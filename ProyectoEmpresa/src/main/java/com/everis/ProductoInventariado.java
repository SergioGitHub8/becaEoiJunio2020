package com.everis;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductoInventariado extends Producto {

	private Integer cantidad;
	private Integer beneficio;
	
	

	public ProductoInventariado(String identificacion, Double precioBase, Integer cantidad, Integer beneficio) {
		super(identificacion, precioBase);
		this.cantidad = cantidad;
		this.beneficio = beneficio;
	}

	public double precioFinal() {
		return (this.getPrecioBase() * this.beneficio)/100 + this.getPrecioBase();

	}

	@Override
	public String toString() {
		return getCantidad() + " " + getIdentificacion() + " (" + getPrecioBase() + ") " + "(+" + this.beneficio + "%)";
	}

}