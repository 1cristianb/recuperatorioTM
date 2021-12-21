package ar.edu.unlam.pb2;

public class Remera extends Producto implements Indumentaria {
	private String talle;
	private String color;

	public Remera(int codigo, String descripcion, String talle, String marca, String color, double precio) {
		super(codigo, descripcion, marca, precio);
		this.talle=talle;
		this.color=color;
	}

	@Override
	public Object getTalle() {
		// TODO Auto-generated method stub
		return this.talle;
	}

	@Override
	public Object getColor() {
		// TODO Auto-generated method stub
		return this.color;
	}
	
	

}
