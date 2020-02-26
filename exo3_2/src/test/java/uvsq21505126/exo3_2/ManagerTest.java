package uvsq21505126.exo3_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class ManagerTest {

    @Test
    public void calculSalaire() throws Exception {
    	Manager v = new Manager(2,10,5);
        assertEquals(2050,v.calcul_salaire());
    }

}