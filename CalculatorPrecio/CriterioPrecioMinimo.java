package CalculatorPrecio;

import entrevis.Vehiculo;

public class CriterioPrecioMinimo implements Criterio{

	@Override
	public boolean cumple(Vehiculo enPos, Vehiculo iterando) {
		return enPos.getPrecio()>iterando.getPrecio();
	}
	

}
