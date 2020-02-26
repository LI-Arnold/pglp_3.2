package uvsq21505126.exo3_2;

public abstract class Empoyer{

    private int salaire;
    private int anciennete;

    public Empoyer(int anciennete){
        this.anciennete=anciennete;
        this.salaire = 1500;
    }

    public int calcul_salaire(){
        return salaire+anciennete*20;
    }

}