package com.everis;

import lombok.Getter;

@Getter
public class TiendaArray {

	private String nombreTienda;
	private Integer maxProducto;
	private ProductoInventariado[] inventario1 = new ProductoInventariado[200];
	private Double caja;

	public TiendaArray(String nombreTienda, Integer maxProducto, Double caja) {
		super();
		this.nombreTienda = nombreTienda;
		this.maxProducto = maxProducto;
		this.caja = caja;
	}

	public ProductoInventariado buscaProducto(String identificacion) {
		ProductoInventariado productoinventariado1 = null;
		for (int i = 0; i < inventario1.length; i++) {
			if (inventario1[i] != null
					&& ((ProductoInventariado) inventario1[i]).getIdentificacion().equals(identificacion)) {
				productoinventariado1 = (ProductoInventariado) inventario1[i];
			}
		}
		return productoinventariado1;
	}

	public void addProducto(ProductoInventariado productoinventariado) {
		for (int i = 0; i < inventario1.length; i++) {
			if (inventario1[i] == null) {
				inventario1[i] = productoinventariado;
				break;
			}
		}
	}

}