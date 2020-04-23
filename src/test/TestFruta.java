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
		Fruta testFruit = new Fruta("Melón", 26, 1, "XB97676", "Baja");
		assertTrue(testFruit.getNombre().equals("Melón"));
	}

}
