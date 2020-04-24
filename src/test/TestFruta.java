package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import logic.OperationsFruit;
import model.Fruta;

class TestFruta {
	
	@Test
	void calculoPrecioTotal() {
		Fruta testFruit = new Fruta("Manzana", 23, 1.05, "XBS415", "Alta");
		assertEquals(10.5, OperationsFruit.calculoPrecioTotal(testFruit, 10));
	}
	
	@Test
	void nombreFuta() {
		Fruta testFruit = new Fruta("Mel�n", 26, 1, "XB97676", "Baja");
		assertTrue(testFruit.getNombre().equals("Mel�n"));
	}
	
	@Test
	void reponerStock() {
		Fruta testFruit = new Fruta("Tomate", 5, 0.57, "TS21664", "Baja");
		assertEquals(55, OperationsFruit.reponerStock(5, testFruit));
	}
	
	@Test
	void cambiarNombre() {
		Fruta testFruit = new Fruta("Tomate", 5, 0.57, "TS21664", "Baja");
		assertEquals("Cucumber", OperationsFruit.cambiarNombre(testFruit, "Cucumber"));
	}
	
	@Test
	void stockNegativo() {
		Fruta testFruit = new Fruta("Tomate", 5, 0.57, "TS21664", "Baja");
		testFruit.setCantidad(-5);
		assertEquals(true, OperationsFruit.stockNegativo(testFruit));
	}

}
