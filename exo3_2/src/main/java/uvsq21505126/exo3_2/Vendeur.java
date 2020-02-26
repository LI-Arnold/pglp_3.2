package uvsq21505126.exo3_2;

public class Vendeur extends Empoyer {
    private int commission;

    public Vendeur(int commission, int anciennete){
        super(anciennete);
        this.commission=commission;
    }

    @Override
    public int calcul_salaire(){
        return super.calcul_salaire()+commission;
    }

}