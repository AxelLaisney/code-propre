package ex5;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {

	private List<Caisse> caisses;

	public Inventaire() {
		caisses = new ArrayList<>();
		caisses.add(new Caisse("Petits objets", 0, 5));
		caisses.add(new Caisse("Moyens objets", 5, 20));
		caisses.add(new Caisse("Grands objets", 20, 100));
	}

	public void addItem(Item item) {

		//TODO Faites évoluer ce code (idée: c'est le caisse qui doit "savoir" si elle peut accepter un objet ou non)
		for(Caisse c: caisses){
			if(c.checkPoid(item)){
				c.getItems().add(item);
			}
		}
	}

	public int taille() {
		int total = 0;
		for(Caisse c: caisses){
			total += total + c.getItems().size();
		}
		
		//TODO faites évoluer ce code.
		return total;
	}
}
