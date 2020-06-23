package com.everis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
		System.out.println("**********************");

		// Creamos Productos

		Producto producto1 = new Producto("Informes", 500.0);
		System.out.println(producto1.getIdentificacion());
		ProductoInventariado productoInventariado1 = new ProductoInventariado("Informes", 500.0, 10, 10);
		System.out.println(productoInventariado1);
		System.out.println(productoInventariado1.precioFinal());
		System.out.println("**********************");

		// Creamos Tienda

		Tienda pcComponentes = new Tienda("PcComponentes", 100, 2000.0);
		List<ProductoInventariado> inventario = new ArrayList<ProductoInventariado>();
		ProductoInventariado productoInventariado2 = new ProductoInventariado("HP", 600.0, 15, 15);
		inventario.add(productoInventariado1);
		inventario.add(productoInventariado2);
		// System.out.println(inventario);
		System.out.println("Producto 1: " + inventario.get(0));
		System.out.println("Producto 2: " + inventario.get(1));
		System.out.println("**********************");

		// Creamos Tienda Array para usar los metodos de la clase con array

		TiendaArray amazon = new TiendaArray("Amazon", 200, 8000.0);
		ProductoInventariado productoInventariado3 = new ProductoInventariado("iPhoneXV", 1500.0, 5, 25);
		System.out.println(amazon.getNombreTienda());
		amazon.addProducto(productoInventariado3);
		System.out.println(amazon.buscaProducto("iPhoneXV"));

	}

}
