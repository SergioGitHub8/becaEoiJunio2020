package com.everis;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ejecutivo extends Empleado {

	int presupuesto;

	public Ejecutivo(Empresa empresa, String nombre, int sueldo, int id) {
		super(empresa, nombre, sueldo, id);
	}

	public int getPresupueto() {
		return this.presupuesto;

	}

	public void asignaPresupuesto(int valor) {
		this.presupuesto = valor;

	}

	@Override
	public String toString() {
		return "Soy un Ejecutivo";
	}

}