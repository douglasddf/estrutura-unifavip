/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifavip.ads.estruturadados.aula10;

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
public class ListaMapaTest {
    
    private static final int MAX = 30000;
    
    
    
    public ListaMapaTest() {
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
     * Test of adiciona method, of class ListaMapa.
     */
    @Test
    public void testAdicionaListaMapa() {
        ListaMapa instanceListaMapa = new ListaMapa();    
        for (int i = 0; i < MAX; i++) {
            Carro carro = new Carro("carro "+(i+1));
            String placa = new String("IDG-"+Math.random());
            instanceListaMapa.adiciona(placa, carro);
        }
        
        assertTrue(true);
        
    }

    
    
    @Test
    public void testAdicionaListaMapaEspalhamento() {
        ListaMapaEspalhamento instanceListaMapaEspalhamento = new ListaMapaEspalhamento();
        
        for (int i = 0; i < MAX; i++) {
            Carro carro = new Carro("carro "+(i+1));
            String placa = new String("IDG-"+Math.random());
            
            instanceListaMapaEspalhamento.adiciona(placa, carro);
        }
        
        
        assertTrue(true);
        
    }


}
