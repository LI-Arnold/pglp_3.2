package uvsq21505126.exo3_2;

public class Manager extends Empoyer{
	private int nb_personne;
	
	public Manager(int anciennete, int nb_personne) {
		super(anciennete);
		this.nb_personne = nb_personne;
	}
	
	public int calcul_salaire() {
		return super.calcul_salaire() + (100* this.nb_personne);
	}

}
