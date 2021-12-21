package ar.edu.unlam.pb2;

public class Carne extends Producto implements Comestible {

	private String fechaDeElaboracion;
	private String fechaDeVencimiento;
	private Double kilos;
	
	public Carne(int codigo, String descripcion, String fechaDeElaboracion, String fechaDeVencimiento,
			Double kg,String marca, double precio){
		super(codigo, descripcion, marca, precio);
		this.fechaDeElaboracion = fechaDeElaboracion;
		this.fechaDeVencimiento = fechaDeVencimiento;
		this.kilos=kg;
	}

	@Override
	public Object getFechaDeElaboracion() {
		// TODO Auto-generated method stub
		return this.fechaDeElaboracion;
	}

	@Override
	public Object getFechaDeVencimiento() {
		// TODO Auto-generated method stub
		return this.fechaDeVencimiento;
	}

	public Double getKilos() {
		return kilos;
	}

	public void setKilos(Double kg) {
		this.kilos = kg;
	}
	

}
