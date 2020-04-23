package logic;

import model.Fruta;

public class OperationsFruit {
	
	public static double calculoPrecioTotal (Fruta fruta, int cantidadComprada) {
		double precioFinal = 0;
		// COMPROBACIÓN SI HAY TANTA FRUTA COMO EL CLIENTE QUIERE COMPRAR. SI ES ASÍ SE
		// PROCESA EL PRECIO TOTAL QUE DEBE PAGAR EL CLIENTE, ADEMÁS DE ACTUALIZAR EL
		// STOCK
		if (cantidadComprada <= fruta.getCantidad()) {
			precioFinal = fruta.getPrecio()*cantidadComprada;
			fruta.setCantidad(fruta.getCantidad()-cantidadComprada);
			System.out.println("El nuevo stock de " + fruta.getNombre() + " es " + fruta.getCantidad() + ".");
		} else {
			System.out.println("No tenemos tanto stock de la fruta que quiere comprar.");
		}
		
		return precioFinal;
	}

}
