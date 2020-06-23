package com.everis;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
}