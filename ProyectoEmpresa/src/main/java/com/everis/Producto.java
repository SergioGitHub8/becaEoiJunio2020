package com.everis;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Producto {

	private String identificacion;
	private Double precioBase;

	@Override
	public String toString() {
		return identificacion + "(" + precioBase + ")";
	}

}
