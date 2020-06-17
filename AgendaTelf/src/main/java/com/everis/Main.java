package com.everis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		// Agenda telefonica (numeros tlf)
		// Contacto y Set<String> telefonos;

		// SET (HASHSET)
		// 1 crear Contacto (nombre apellidos) y meterle 3 telefonos
		// 2 localizar el tlf a llamar (llamar-> syso(he llamado al numero .....)
		// 3 meter un nuevo telefono para el mismo contacto
		// 4 Imprimir todos los telefonos de un contacto
		// ***************FIN SET*************

		// 1

		Contact contact = new Contact();
		contact.setName("Sergio");
		contact.setSurname("Vizcaino");

		System.out.println(contact.getName());
		Set<String> phones = new HashSet<String>();
		phones.add("612334567");
		phones.add("666666666");
		phones.add("777777777");

		contact.setTelephonesSet(phones);
		// 2
		String numero = "666666666";

		for (String phoneNumber : contact.getTelephonesSet()) {
			if (phoneNumber.equals(numero)) {
				System.out.println("estoy llamando al " + phoneNumber);
			}
		}
		// 3
		contact.getTelephonesSet().add("888888888");
		// 4
		for (String phone : phones) {
			System.out.println("Tlf: " + phone);
		}

		// LIST (ARRAYLIST)
		// 1 crear Contacto (nombre apellidos) y meterle 3 telefonos
		System.out.println("*************************");
		Contact contact1 = new Contact();
		contact1.setName("Paco");
		contact1.setSurname("Sanz");
		System.out.println(contact1.getName());

		List<String> phoneList = new ArrayList<String>();
		phoneList.add("11111111");
		phoneList.add("22222222");
		phoneList.add("33333333");

		contact1.setTelephoneList(phoneList);

		// 2 llamar al numero 666666666

		String phoneNumber = contact1.getTelephoneList().get(contact1.getTelephoneList().indexOf("11111111"));

		System.out.println("estoy llamando al " + phoneNumber);

		// 3
		if (!contact1.getTelephoneList().contains("88888888")) {
			contact1.getTelephoneList().add("888888888");
		}

		// 4
		for (String phone : phoneList) {
			System.out.println("tlf: " + phone);
		}
		
		//CLASE PERSONA
		Persona persona1 = new Persona("ANA", 26, 2010);
		Persona persona2 = new Persona("ALBA", 21, 1988);
		Persona persona3 = new Persona("ANA", 26, 2009);
		Persona persona4 = new Persona("ALBA", 26, 2007);
		
		
		List<Persona> Lista = new LinkedList<Persona>();
		Lista.add(persona1);
		Lista.add(persona2);
		Lista.add(persona3);
		Lista.add(persona4);
		
		// Ordenamos la lista.
        //Collections.sort(lista,);
         
        // Imprimimos
//        for (String nombre : List) {
//            System.out.println(nombre);
//        }
		

	}

}
