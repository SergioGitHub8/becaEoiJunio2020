package edu.es.eoi.view;

import java.util.Scanner;

import edu.es.eoi.App;
import edu.es.eoi.domain.Film;

public class MenuView {
	
	public static void printMenu() {
	
		System.out.println("\n---------FLIXNET----------------\nQue pelicula quieres ver: ");
		  for (int i = 0; i < App.playList.length; i++) {
			  if(App.playList[i]!=null) {
				  System.out.println(i + "-" + ((Film)App.playList[i]).getName());
			  }
			
		}
		
		@SuppressWarnings("resource")
		Scanner scanner= new Scanner(System.in);
		int opcion=scanner.nextInt();
		
		
		App.controller.play(App.playList[opcion]);
		MenuView.printMenu();
		  
		 
		
		
		
		
	}

}
