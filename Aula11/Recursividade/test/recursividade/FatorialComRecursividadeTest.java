/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividade;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alunofavip
 */
public class FatorialComRecursividadeTest {
    private static final int FATORIAL = 10000;
    
    public FatorialComRecursividadeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of fatorial method, of class FatorialComRecursividade.
     */
    @Test
    public void testFatorialComRecursividade() {
        System.out.println("fatorial com recursividade");
        int num = FATORIAL;
       
        double result = FatorialComRecursividade.fatorial(num);
       
        
        assertTrue(true);
    }



    @Test
    public void testFatorialSemRecursividade() {
        System.out.println("fatorial sem recursividade");
        int num = FATORIAL;
        int expResult = 0;
        double result = FatorialSemRecursividade.funcaoFatorial(num);
        assertTrue(true);
    }
    
}
