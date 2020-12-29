package Comparadores;

import java.util.Comparator;

import entrevis.Vehiculo;

public class ComparadorPrecio implements Comparator<Vehiculo> {

	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		return (int) (o2.getPrecio()-o1.getPrecio());
	}

}
