package com.jorge.restaurantesdata.dao;

import java.sql.SQLException;
import java.util.List;

import com.jorge.restauranteentities.entity.Empleado;
import com.jorge.restaurantesdata.myexceptions.RestauranteException;

public interface EmpleadoDAO {
	
	int guardar(Empleado empleado) throws SQLException;
	
	int actualizar(Empleado empleado) throws SQLException;
	
	int eliminar(int idEmpleado) throws SQLException;
	
	List<Empleado> consultar() throws SQLException;
	
	Empleado consultarPorId(int idEmpleado) throws SQLException, RestauranteException;
	
}
