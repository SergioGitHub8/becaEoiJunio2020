package edu.es.eoi;

import edu.es.eoi.controller.PlayController;
import edu.es.eoi.domain.Film;
import edu.es.eoi.interfaces.Playable;
import edu.es.eoi.service.PlayService;
import edu.es.eoi.view.MenuView;

/*
 * Sergio Vizcaino8
 */

public class App {
	
	public static Playable[] playList= new Playable[10];
	public static PlayService service= new PlayService();
	public static PlayController controller= new PlayController(service);	

	public static void main(String[] args) {
	
		createPlayOffer();
		MenuView.printMenu();
		
	}
	
	public static void createPlayOffer() {		
		Film film1 = new Film();
		film1.setName("El hobbit: un viaje inesperado");
		
		Film film2 = new Film();
		film2.setName("El hobbit: la desolaci�n de Smaug");
		
		Film film3 = new Film();
		film3.setName("El Hobbit: la batalla de los cinco ej�rcitos");
		
		playList[0]=film1;
		playList[1]=film2;
		playList[2]=film3;
		
	}
	
	public static void addToPlaylist(Playable playable) {		
		for (int i = 0; i < playList.length; i++) {
			  if(playList[i]==null) {
				  playList[i]=playable;
				  return;
			  }
		}		
	}

}
