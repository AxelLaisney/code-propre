package ex5;

import java.util.ArrayList;
import java.util.List;

public class Caisse {

	private String nom;
	private List<Item> items;
	private int poidsItemMax;
	private int poidsItemMin;


	/** Constructeur
	 * @param nom
	 */
	public Caisse(String nom, int poidsItemMin, int poidsItemMax) {
		super();
		this.nom = nom;
		this.items = new ArrayList<>();
		this.poidsItemMax = poidsItemMax;
		this.poidsItemMin = poidsItemMin;
	}

	public boolean checkPoid(Item item){
		if(item.getPoids() >= this.poidsItemMin && item.getPoids() <= this.poidsItemMax){
			return true;
		}
		return false;
	}


	/** Getter pour l'attribut nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter pour l'attribut nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter pour l'attribut items
	 * @return the items
	 */
	public List<Item> getItems() {
		return items;
	}

	/** Setter pour l'attribut items
	 * @param items the items to set
	 */
	public void setItems(List<Item> items) {
		this.items = items;
	}

	public void setPoidsItemMax(int poidsItemMax) {
		this.poidsItemMax = poidsItemMax;
	}

	public int getPoidsItemMax() {
		return poidsItemMax;
	}

	public void setPoidsItemMin(int poidsItemMin) {
		this.poidsItemMin = poidsItemMin;
	}

	public int getPoidsItemMin() {
		return poidsItemMin;
	}
}
