package com.jorge.restauranteweb.controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.jorge.restauranteentities.entity.Empleado;
import com.jorge.restauranteservice.services.LoginService;
import com.jorge.restauranteweb.utils.ControllersUtil;

/**
 * 
 * @author jorge
 * Clase Bean de JSF que se comunica con la pantalla login.xhtml
 * NOTA: Siempre agregar @ManagedBean a una clase para realizar este proceso
 */
@ManagedBean
@ViewScoped
public class LoginController {
	
	private String username;
	private String password;
	private boolean esSuperAdminGeneral;
	
	private LoginService loginService = new LoginService();
	
	public void entrar() {
		try {
			Empleado empleadoConsultado = this.loginService.consultarPorUsuarioYPassword(this.username, this.password, this.esSuperAdminGeneral);
		
			if (empleadoConsultado != null) {
				if (empleadoConsultado.isEstatus() == 1) {
					if (empleadoConsultado.isSuperadmingeneral()) {
						ControllersUtil.redireccionar("/adminrestaurantes.xhtml");
					}
				}
			} else {
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEsSuperAdminGeneral() {
		return esSuperAdminGeneral;
	}

	public void setEsSuperAdminGeneral(boolean esSuperAdminGeneral) {
		this.esSuperAdminGeneral = esSuperAdminGeneral;
	}
}
