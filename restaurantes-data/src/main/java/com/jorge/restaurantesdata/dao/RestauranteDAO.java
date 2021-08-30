package com.jorge.restaurantesdata.dao;

import java.sql.SQLException;
import java.util.List;

import com.jorge.restauranteentities.entity.Restaurante;
import com.jorge.restaurantesdata.myexceptions.RestauranteException;

public interface RestauranteDAO {
	
	int guardar(Restaurante restaurante) throws SQLException;
	
	int actualizar(Restaurante tipoRestaurante) throws SQLException;
	
	int eliminar(int idRestaurante) throws SQLException;
	
	List<Restaurante> consultar() throws SQLException;
	
	Restaurante consultarPorId(int idRestaurante) throws SQLException, RestauranteException;
	
}
