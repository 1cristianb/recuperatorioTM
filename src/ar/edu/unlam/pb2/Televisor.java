package ar.edu.unlam.pb2;

public class Televisor extends Producto implements Electrodomestico {

	private Integer pulgadas;
	private Integer garantia;
	
	public Televisor(int codigo, String descripcion, int pulgadas, int garantia, String marca, double precio) {
		super(codigo, descripcion, marca, precio);
		this.garantia=garantia;
		this.pulgadas=pulgadas;
	}

	@Override
	public Object getGarantia() {
		// TODO Auto-generated method stub
		return this.garantia;
	}

	public Integer getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(Integer pulgadas) {
		this.pulgadas = pulgadas;
	}
	

}
