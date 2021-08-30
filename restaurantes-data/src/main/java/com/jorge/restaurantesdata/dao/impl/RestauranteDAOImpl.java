package com.jorge.restaurantesdata.dao.impl;

import java.sql.SQLException;
import java.util.List;

import com.jorge.restauranteentities.entity.Restaurante;
import com.jorge.restaurantesdata.connection.ConnectionFactory;
import com.jorge.restaurantesdata.dao.RestauranteDAO;
import com.jorge.restaurantesdata.myexceptions.RestauranteException;

public class RestauranteDAOImpl implements RestauranteDAO {

	static {
		try {
			ConnectionFactory.conectar();
		} catch (ClassNotFoundException | SQLException e) {
			System.err.println("Error de Base de datos: " + e.getMessage());
		}
	}

	
	public int guardar(Restaurante restaurante) throws SQLException {
		String sql = "INSERT INTO restaurante (nombre, imagen, slogan, idTipoRestaurante, fechaCreacion, estatus, idMenu) "
				+ "VALUES ('"+restaurante.getNombre()+"','"+restaurante.getImagen()+"','',"+restaurante.getTipoRestaurante().getIdTipoRestaurante()+","
						+ "'"+restaurante.getFechaCreacion()+"',"+restaurante.isEstatus()+","+restaurante.getMenu().getIdMenu()+")";
		int ejecutado = ConnectionFactory.ejecutarSQL(sql);
		return ejecutado;
	}

	@Override
	public int actualizar(Restaurante tipoRestaurante) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int eliminar(int idRestaurante) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Restaurante> consultar() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Restaurante consultarPorId(int idRestaurante) throws SQLException, RestauranteException {
		// TODO Auto-generated method stub
		return null;
	}

}
