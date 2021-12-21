package ar.edu.unlam.pb2;

public class Heladera extends Producto implements Electrodomestico {
	private Boolean noFrost;
	private Integer garantia;
	
	public Heladera(int codigo, String descripcion, boolean noFrost, int garantia, String marca, double precio) {
		super(codigo, descripcion, marca, precio);
		this.noFrost=noFrost;
		this.garantia=garantia;
	}

	@Override
	public Object getGarantia() {
		// TODO Auto-generated method stub
		return this.garantia;
	}

	public Boolean isNoFrost() {
		return noFrost;
	}

	public void setNoFrost(Boolean noFrost) {
		this.noFrost = noFrost;
	}
	

}
