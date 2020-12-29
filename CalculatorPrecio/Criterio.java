package CalculatorPrecio;

import entrevis.Vehiculo;

public interface  Criterio {
	public boolean cumple(Vehiculo acumulado, Vehiculo iterando);

}
