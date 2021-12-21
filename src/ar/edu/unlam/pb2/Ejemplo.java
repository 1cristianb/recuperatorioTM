package ar.edu.unlam.pb2;

public class Ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supermercado coto = new Supermercado("coto");
		Producto tele=new Televisor(1, "oled", 42, 12, "lg", 35000);
		coto.ingresarProducto(tele);
		System.out.println(coto.getStock(1));
	}

}
