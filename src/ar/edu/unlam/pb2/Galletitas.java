package ar.edu.unlam.pb2;

public class Galletitas extends Producto implements Comestible {

	private String fechaDeElaboracion;
	private String fechaDeVencimiento;

	public Galletitas(int codigo, String descripcion, String fechaDeElaboracion, String fechaDeVencimiento,
			String marca, double precio) {
		super(codigo, descripcion, marca, precio);
		this.fechaDeElaboracion = fechaDeElaboracion;
		this.fechaDeVencimiento = fechaDeVencimiento;
	}

	@Override
	public String getFechaDeElaboracion() {
		// TODO Auto-generated method stub
		return this.fechaDeElaboracion;
	}

	@Override
	public String getFechaDeVencimiento() {
		// TODO Auto-generated method stub
		return this.fechaDeVencimiento;
	}
	
	

}
