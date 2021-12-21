package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.List;

public class Venta {
	private String nombre;
	private Integer dni;
	private List<Producto> carrito;

	public Venta(String nombre, Integer dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.carrito = new ArrayList<>();
	}

	public void agregarAlCarrito(Producto producto) {
		carrito.add(producto);
	}

	public double getImporte() {
		// TODO Auto-generated method stub
		Double importe=0.0;
		for (Producto producto : carrito) {
			importe+=producto.getPrecio();
		}
		return importe;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

}
