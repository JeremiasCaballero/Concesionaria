package CalculatorPrecio;

import entrevis.Vehiculo;

public class CriterioPrecioMaximo implements Criterio{



	@Override
	public boolean cumple(Vehiculo enPos, Vehiculo iterando) {
		return enPos.getPrecio()<iterando.getPrecio();
	}
	
	

}
