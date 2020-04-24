package controller;

import logic.OperationsFruit;
import model.Fruta;

public class Main {

	public static void main(String[] args) {
		Fruta fruta = new Fruta();

		fruta.setNombre("Naranja");
		fruta.setCantidad(45);
		fruta.setPrecio(0.79);
		fruta.setLote("AX45123");
		fruta.setMadurez("Media");
		String prueba = "";

		System.out.println(fruta.toString());
		
		int cantidadComprada = 13;
		System.out.println("El precio total que debe pagar el cliente es: " + OperationsFruit.calculoPrecioTotal(fruta, cantidadComprada) + " €.");
	}

}