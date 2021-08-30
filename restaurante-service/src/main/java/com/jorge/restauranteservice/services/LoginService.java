package com.jorge.restauranteservice.services;

import java.sql.SQLException;

import com.jorge.restauranteentities.entity.Empleado;
import com.jorge.restaurantesdata.dao.impl.EmpleadoDAOImpl;

/**
 * 
 * @author jorge
 * Clase que realiza la lógica de negocio para la funcionalidad de la pantalla de login.
 */
public class LoginService {
	
	private EmpleadoDAOImpl empleadoDAOImpl = new EmpleadoDAOImpl();
	
	public Empleado consultarPorUsuarioYPassword(String usuario, String password, boolean esSuperAdminGeneral) throws SQLException {
		return this.empleadoDAOImpl.consultarPorUsuarioYPassword(usuario, password, esSuperAdminGeneral);
	}
}
