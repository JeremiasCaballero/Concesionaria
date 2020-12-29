package BusquedaModelo;

import entrevis.Vehiculo;

public class ContieneLetra implements BusquedaModelo {
	private String letra; 
	
	public ContieneLetra(String letra) {
		this.letra = letra;
	}

	@Override
	public boolean cumple(Vehiculo v) {
		return v.contieneLetra(letra);
	}
	

}
