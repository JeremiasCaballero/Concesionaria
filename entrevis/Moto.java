package entrevis;

public class Moto extends Vehiculo {
	int cilindros;
	
	
	public Moto(String marca, String modelo, double precio, int cilindros) {
		super(marca,modelo,precio);
		this.cilindros = cilindros;
		
	}
	
	
	
	@Override
	public String toString() {
		return "Marca: " + super.getMarca() + "//" +" Modelo: "+ super.getModelo() + "//" + "Cilindrada: " + this.cilindros + "//" + " Precio: " + super.getPrecio();
	}
	

}
