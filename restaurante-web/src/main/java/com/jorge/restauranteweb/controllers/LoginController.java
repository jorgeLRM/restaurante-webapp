package com.jorge.restauranteweb.controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

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
	
	public void entrar() {
		
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
}
