package ex2;

public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;

	public LivretA(double solde, double tauxRemuneration){
		super(solde);
		this.tauxRemuneration = tauxRemuneration;
	}

	@Override
	public void debiterMontant(double montant){
		if (this.solde - montant > 0){
			this.solde = solde - montant;
		}
	}

	public void appliquerRemuAnnuelle(){
		this.solde = solde + solde*tauxRemuneration/100;
	}


	public double getTauxRemuneration() {
		return tauxRemuneration;
	}
	/** Setter
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
	/** Getter for type
	 * @return the type
	 */

}
