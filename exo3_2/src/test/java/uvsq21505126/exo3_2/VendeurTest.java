package uvsq21505126.exo3_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class VendeurTest {

    @Test
    public void calculSalaire() throws Exception {
    	Vendeur v = new Vendeur(10,2);
        assertEquals(1550,v.calcul_salaire());
    }

}