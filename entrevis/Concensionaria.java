package entrevis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import BusquedaModelo.BusquedaModelo;
import CalculatorPrecio.Criterio;

public class Concensionaria {
	private ArrayList<Vehiculo> vehiculos;
	
	
	
	public Concensionaria() {
		this.vehiculos = new ArrayList<Vehiculo>();
	}
	
	
	public ArrayList<Vehiculo> getAutos(){
		return new ArrayList<Vehiculo>(this.vehiculos); // copia
	}
	
	
	public void addVehiculo(Vehiculo v) {
			if(!vehiculos.contains(v)) { // comprueba repetidos, hay que redefinir equals
				vehiculos.add(v);
		}
	}
	public Vehiculo getAuto(Criterio cr) {
		Vehiculo pos = null; 
		
		for (Vehiculo elem : vehiculos) {
			if(pos == null) {
				pos = elem;
			}
			if(cr.cumple(pos, elem)) {
				pos = elem;
			}
		}
		return pos;
	}
		/*
		pos = vehiculos.get(0)
		for (int i = 0; i < vehiculos.size(); i++) {
			if(cr.cumple(pos, vehiculos.get(i))) {
				pos = vehiculos.get(i);
			}
		}
		return pos;
	}
	*/
	public Vehiculo getAutoPalabra(BusquedaModelo b) {
		Vehiculo retorno = null;
		for (Vehiculo elem : vehiculos) {
			if(b.cumple(elem)) {
				retorno = elem;
			}
		}
		return retorno;
		
	}
	public ArrayList<Vehiculo> getAutosOrdenados(Comparator<Vehiculo> com){
		ArrayList<Vehiculo> aux = new ArrayList<Vehiculo>(vehiculos);
		Collections.sort(aux, com);
		return aux;
	}
	
}
