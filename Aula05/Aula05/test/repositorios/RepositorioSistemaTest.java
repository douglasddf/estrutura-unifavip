/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

import modelos.Produto;
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
public class RepositorioSistemaTest {
    
    private static final int MAXIMO = 1000000;
    
    public RepositorioSistemaTest() {
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
     * Test of adicionarProduto method, of class RepositorioSistema.
     */
    @Test
    public void testAdicionarProduto() {
        System.out.println("adicionarProduto");
        Produto produto = new Produto("NOTEBOOK", "...", 1000, 2000.5);
        Produto produto2 = new Produto("NOTEBOOK", "...", 1000, 2000.5);
        
        RepositorioSistema instance = new RepositorioSistema();
        
        instance.adicionarProduto(produto);
        instance.adicionarProduto(produto2);
    
        System.out.println(produto);
        System.out.println(produto2);
        
        Produto produtoRecuperado = instance.recuperarProdutoPeloCodigo(2);
        
        assertEquals(produto2, produtoRecuperado);
    }

    @Test
    public void testAdicionaVarios() {
        System.out.println("adiciona (VARIOS "+MAXIMO+" ELEMENTOS)");        
        RepositorioSistema repositorio = new RepositorioSistema();
        
        for (int i = 0; i < MAXIMO; i++) {
            Produto p = new Produto("Produto "+(i+1), null, 10.5, 5.5);
            repositorio.adicionarProduto(p);
        }
        
        
        assertTrue(repositorio.getTotalProdutos() == MAXIMO);
    }
    
    
    
}
