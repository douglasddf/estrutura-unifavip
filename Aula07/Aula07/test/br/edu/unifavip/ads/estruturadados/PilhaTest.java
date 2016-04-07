/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifavip.ads.estruturadados;

import modelos.Produto;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author douglasfrari
 */
public class PilhaTest {

    private static int TOTAL_ELEMENTOS = 1000000;
    
    public PilhaTest() {
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
     * Test of insere method, of class Pilha.
     */
    @Test
    public void testInsere() {
        
        Produto t = new Produto("Notebook", "...", 1000, 500);
        Pilha<Produto> instance = new Pilha();
        instance.insere(t);
        
        assertTrue(instance.total() == 1);
        assertEquals(t, instance.topo());
    }


    @Test
    public void testInsereRemove() {
        
        Pilha<Produto> instance = new Pilha();
        Produto t = new Produto("Notebook", "...", 1000, 500);        
        
        instance.insere(t);
        Produto produtoRemovido = instance.remove();
        
        assertTrue(instance.total() == 0);
        assertEquals(t, produtoRemovido);
        
    }
    
    
    @Test
    public void testInsereMuitos() {
        
        Pilha<Produto> instance = new Pilha();
        for (int i = 0; i < TOTAL_ELEMENTOS; i++) {
            Produto t = new Produto("Notebook "+i, "..."+i, Math.random()*3, Math.random()*2);        
            instance.insere(t);
        }
        
        assertTrue(instance.total() == TOTAL_ELEMENTOS);
    }
}
