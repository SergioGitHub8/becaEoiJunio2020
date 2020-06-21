package com.everis;

import java.util.List;

public class Tienda {
	
	private String nombreTienda;
	private Integer maxProducto;
	private List<ProductoInventariado> inventario;
	private Double caja;
	
	public Tienda(String nombreTienda, Integer maxProducto, Double caja) {
		super();
		this.nombreTienda = nombreTienda;
		this.maxProducto = maxProducto;
		this.caja = caja;
	}
	
	public ProductoInventariado buscaProducto(int indice) {
		   return inventario.get(indice);
	}
	
	public void addProducto(ProductoInventariado productoinventariado) {
		inventario.add(productoinventariado);
	}
}
