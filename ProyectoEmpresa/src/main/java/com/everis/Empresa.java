package com.everis;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
public class Empresa {
	private String nombre;
	private int size = 0;
	List<Empleado> empleados;
	private int contador;

	public Empresa(String nombre, int size) {
		this.nombre = nombre;
		this.size = size;
		empleados = new ArrayList<Empleado>(size);
	}

	public void nuevoEmpleado(String nombre, int sueldo) {

		Empleado empleado = new Empleado(this, nombre, sueldo, contador);
		this.empleados.add(empleado);
		contador++;
	}

	public Empleado getEmpleado(int numeroEmpleado) {

		if (numeroEmpleado < empleados.size()) {
			return empleados.get(numeroEmpleado);
		} else {
			return null;
		}
	}

}
