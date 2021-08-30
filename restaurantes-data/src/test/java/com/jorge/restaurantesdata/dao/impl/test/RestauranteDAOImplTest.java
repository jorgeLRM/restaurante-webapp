package com.jorge.restaurantesdata.dao.impl.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.SQLException;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import com.jorge.restaurantesdata.dao.impl.RestauranteDAOImpl;
import com.jorge.restauranteentities.entity.Menu;
import com.jorge.restauranteentities.entity.Restaurante;
import com.jorge.restauranteentities.entity.TipoRestaurante;

class RestauranteDAOImplTest {

	@Test
	void testGuardar() {
		RestauranteDAOImpl restauranteDAOImpl = new RestauranteDAOImpl();
		
		Restaurante restaurante = new Restaurante();
		restaurante.setNombre("Restaurante Hiroshima");
		restaurante.setImagen("hiroshima.png");
		restaurante.setEstatus(1);
		restaurante.setFechaCreacion(LocalDateTime.now());
		
		TipoRestaurante tipoRestaurante = new TipoRestaurante();
		tipoRestaurante.setIdTipoRestaurante(18);
		restaurante.setTipoRestaurante(tipoRestaurante);
		
		Menu menu = new Menu();
		menu.setIdMenu(4);
		restaurante.setMenu(menu);
		
		int guardado = 0;
		
		try {
			guardado = restauranteDAOImpl.guardar(restaurante);
			
			assertTrue(guardado > 0);
			
			System.out.println("Se guard� exit�samente");
			
		}catch(SQLException e) {
			assertTrue(guardado == 0);
			System.out.println("No se guard�...");
			e.printStackTrace();
		}
	}

}
