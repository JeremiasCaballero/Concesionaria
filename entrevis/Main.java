package entrevis;

import java.util.ArrayList;

import BusquedaModelo.ContieneLetra;
import CalculatorPrecio.CriterioPrecioMaximo;
import CalculatorPrecio.CriterioPrecioMinimo;
import Comparadores.ComparadorPrecio;

public class Main {

	public static void main(String[] args) {
		Auto auto = new Auto("Peugeot", "206", 200000.00, 4);
		Moto moto = new Moto("Honda","Titan",60000.00,125);
		Auto auto2 = new Auto("Peugeot", "208", 250000.00,  5);
		Moto moto2 = new Moto("Yamaha","YBR",80500.50,160);

		Concensionaria con = new Concensionaria();
		
		con.addVehiculo(auto);
		con.addVehiculo(moto);
		con.addVehiculo(auto2);
		con.addVehiculo(moto2);
		
		// OBTENER TODOS
		
		ArrayList<Vehiculo> resultado = new ArrayList<Vehiculo>();
		resultado.addAll(con.getAutos());
		
		for (Vehiculo elem : resultado) {
			System.out.println(elem);
		}
		
		
		
		// vehiculo mas caro
		CriterioPrecioMaximo cr = new CriterioPrecioMaximo();
		
		System.out.println("Vehículo más barato: "+con.getAuto(cr));
		
		// vehiculo mas barato
		CriterioPrecioMinimo cr2 = new CriterioPrecioMinimo();
		
		System.out.println("=========== Vehículo más barato: "+con.getAuto(cr2));
		
		// vehiculo que contenga la letra y
		ContieneLetra letra = new ContieneLetra("Y");
		System.out.println("========= Vehículo que contiene en el modelo la letra ‘Y’: ");
		System.out.println(con.getAutoPalabra(letra));
		
		// Vehiculos Ordenados por precio
		System.out.println("========= Vehículos ordenados por precio de mayor a menor: ");
		ComparadorPrecio precio = new ComparadorPrecio();
		ArrayList<Vehiculo> aux = con.getAutosOrdenados(precio);
		for (Vehiculo elem : aux) {
			System.out.println(elem.getMarca()+" "+elem.getModelo());
		}
		
		
	}
}
