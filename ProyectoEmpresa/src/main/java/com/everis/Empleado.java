package com.everis;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Empleado {

	protected Empresa empresa;
	protected String nombre;
	protected int sueldo;
	protected int numEmpleado;

	@Override
	public String toString() {
		return "nombre=" + nombre + ", sueldo=" + sueldo + ", numEmpleado=" + numEmpleado;
	}

	public final void aumentarSueldo(int porcentaje) {
		this.sueldo= this.sueldo*porcentaje;
	}

	public void despedir() {
		this.empresa.getEmpleados().remove(this.numEmpleado);
		System.out.println("DESPEDIDO -> " + this.nombre);
	}

	public void ascender() {
		Ejecutivo ejecutivo= new Ejecutivo(this.empresa,this.nombre,this.sueldo,this.numEmpleado);
	    empresa.getEmpleados().add(this.numEmpleado, ejecutivo);
	}
	

	public Empresa getEmpresa() {
		return this.empresa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}	
	

}
