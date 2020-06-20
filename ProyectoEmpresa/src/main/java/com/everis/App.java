package com.everis;

public class App {

	public static void main(String[] args) {

		// Creacion de empresa

		Empresa empresa = new Empresa("EVERIS", 20);

		// Creamos empleados en la empresa

		empresa.nuevoEmpleado("SERGIO", 25000);
		empresa.nuevoEmpleado("PEPE", 25000);

		// Imprimimos por pantalla la Lista Empleados
		
		empresa.empleados.forEach(System.out::println);

		// Usamos los métodos de empleado
		
		empresa.getEmpleado(0).aumentarSueldo(2); 
		empresa.getEmpleado(1).despedir();
		empresa.empleados.forEach(System.out::println);

	}

}
