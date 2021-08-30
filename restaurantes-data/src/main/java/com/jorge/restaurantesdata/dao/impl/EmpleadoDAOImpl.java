package com.jorge.restaurantesdata.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.jorge.restauranteentities.entity.Empleado;
import com.jorge.restauranteentities.entity.Rol;
import com.jorge.restaurantesdata.connection.ConnectionFactory;
import com.jorge.restaurantesdata.dao.EmpleadoDAO;
import com.jorge.restaurantesdata.myexceptions.RestauranteException;

public class EmpleadoDAOImpl implements EmpleadoDAO {

	@Override
	public int guardar(Empleado empleado) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int actualizar(Empleado empleado) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int eliminar(int idEmpleado) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Empleado> consultar() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Empleado consultarPorId(int idEmpleado) throws SQLException, RestauranteException {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Empleado consultarPorUsuarioYPassword(String usuario, String password, boolean esSuperAdminGeneral) throws SQLException {
		Empleado empleado = null;
		String sql = "";
		
		if (esSuperAdminGeneral) {
			sql = "SELECT e.*, r.nombre AS nombreRol "
					+ "FROM empleado e, rol "
					+ "WHERE e.idRol = r.idRol "
					+ "AND (e.usuario = '"+usuario+"' OR e.email = '"+usuario+"') "
							+ "AND e.password = '"+password+"' "
									+ "AND e.idSucursal IS NULL;";
		} else {
			// Reemplazar por código para ususario administrador sucursal y empleado
		}
		
		ResultSet rs = ConnectionFactory.ejecutarSQLSelect(sql);
		
		if (rs != null) {
			if (rs.next()) {
				empleado = new Empleado();
				empleado.setIdEmpleado(rs.getInt("idEmpleado"));
				empleado.setNombre(rs.getString("nombre"));
				empleado.setPrimerApellido(rs.getString("primerApellido"));
				empleado.setSegundoApellido(rs.getString("segundoApellido"));
				empleado.setUsuario(rs.getString("usuario"));
				empleado.setPassword(rs.getString("password"));
				empleado.setEmail(rs.getString("email"));
				empleado.setEstatus(rs.getInt("estatus"));
				empleado.setSuperadmin(rs.getBoolean("superadmin"));
				empleado.setSuperadmingeneral(rs.getBoolean("superadmingeneral"));
				
				Rol rol = new Rol();
				rol.setIdRol(rs.getInt("idRol"));
				rol.setNombre(rs.getString("nombreRol"));
				empleado.setRol(rol);
				
				// Añadir funcionalidad para el cado de administrador de sucursal  y empleado
				if (!empleado.isSuperadmingeneral()) {
					
				}
			}
		}
		return empleado;
	}

}
