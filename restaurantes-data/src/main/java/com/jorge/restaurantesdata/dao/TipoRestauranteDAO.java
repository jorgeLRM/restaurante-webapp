package com.jorge.restaurantesdata.dao;

import java.sql.SQLException;
import java.util.List;

import com.jorge.restauranteentities.entity.TipoRestaurante;
import com.jorge.restaurantesdata.myexceptions.RestauranteException;

public interface TipoRestauranteDAO {
	
	int guardar(TipoRestaurante tipoRestaurante) throws SQLException;
	
	int actualizar(TipoRestaurante tipoRestaurante) throws SQLException;
	
	int eliminar(int idTipoRestaurante) throws SQLException;
	
	List<TipoRestaurante> consultar() throws SQLException;
	
	TipoRestaurante consultarPorId(int idTipoRestaurante) throws SQLException, RestauranteException;
	
}
