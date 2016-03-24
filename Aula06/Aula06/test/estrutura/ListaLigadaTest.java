/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrutura;

import model.Aluno;
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
public class ListaLigadaTest {
    
    
    private static final int MAXIMO = 1000000;
    
    public ListaLigadaTest() {
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
     * Test of adiciona method, of class ListaLigada.
     */
    @Test
    public void testAdiciona_Object() {
        System.out.println("adiciona (COMECO)");
        Object elemento = new Aluno("Nome 1", 33);
        ListaLigada instance = new ListaLigada();
        instance.adiciona(elemento);
        
        assertTrue(instance.tamanho() == 1);
        
    }

    /**
     * Test of adiciona method, of class ListaLigada.
     */
    @Test
    public void testAdiciona_int_Object() {
        System.out.println("adiciona em certa posicao (COMECO)");
        int posicao = 0;
        Object elemento = new Aluno("Douglas", posicao);
        ListaLigada instance = new ListaLigada();
        instance.adiciona(posicao, elemento);
        
        assertTrue(instance.tamanho() == 1);
        assertEquals(elemento, instance.pega(0));
    }

    /**
     * Test of pega method, of class ListaLigada.
     */
    @Test
    public void testPega() {
        System.out.println("pega (apenas um elemento)");
        int posicao = 0;
        ListaLigada instance = new ListaLigada();
        Object expResult = new Aluno("Batman", posicao);
        
        instance.adiciona(posicao, expResult);
        
        Object result = instance.pega(posicao);
        
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of remove method, of class ListaLigada.
     */
    @Test
    public void testRemove() {
        System.out.println("remove (COMECO)");
        int posicao = 0;
        ListaLigada instance = new ListaLigada();
        Object elemento = new Aluno("Mulher", posicao);
        instance.adiciona(elemento);
        
        instance.remove(posicao);
        
        assertTrue(instance.tamanho() == 0);
    }

    /**
     * Test of tamanho method, of class ListaLigada.
     */
    @Test
    public void testTamanho() {
        System.out.println("tamanho (sem nada)");
        ListaLigada instance = new ListaLigada();
        int expResult = 0;
        int result = instance.tamanho();
        assertEquals(expResult, result);
    }

    /**
     * Test of contem method, of class ListaLigada.
     */
    @Test
    public void testContem() {
        System.out.println("contem (elemento adicionado)");
        Object elemento = new Aluno("Homem Aranha", 44);
        ListaLigada instance = new ListaLigada();
        instance.adiciona(elemento);
        
        boolean expResult = true;
        boolean result = instance.contem(elemento);
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of adicionaNoComeco method, of class ListaLigada.
     */
    @Test
    public void testAdicionaNoComeco() {
        System.out.println("adicionaNoComeco (garantindo adicionar no inicio)");
        Object elemento1 = new Aluno("José", 22);
        Object elemento2 = new Aluno("Maria", 12);
        
        ListaLigada instance = new ListaLigada();
        instance.adicionaNoComeco(elemento1);
        
        instance.adiciona(elemento2);
        
        Object atual = instance.pega(0);
        
        assertEquals(elemento1, atual);
        
    }

    /**
     * Test of removeDoComeco method, of class ListaLigada.
     */
    @Test
    public void testRemoveDoComeco() {
        System.out.println("removeDoComeco ()");
        ListaLigada instance = new ListaLigada();
        Aluno papai = new Aluno("Papai", 79);
        Aluno mamae = new Aluno("Mamãe", 59);
        
        instance.adiciona(papai);
        instance.adiciona(mamae);
        
        instance.removeDoComeco();
        
        assertTrue(instance.tamanho() == 1);
        assertEquals(mamae, instance.pega(0));
    }

    /**
     * Test of removeDoFim method, of class ListaLigada.
     */
    @Test
    public void testRemoveDoFim() {
        System.out.println("removeDoFim");
        
        ListaLigada instance = new ListaLigada();
        Aluno papai = new Aluno("Papai", 79);
        Aluno mamae = new Aluno("Mamãe", 59);
        
        instance.adiciona(papai);
        instance.adiciona(mamae);
        
        instance.removeDoFim();
        
        assertTrue(instance.tamanho() == 1);
        assertTrue(!instance.contem(mamae));
        
    }

    /**
     * Test of toString method, of class ListaLigada.
     */
    @Test
    public void testToString() {
        System.out.println("toString");

        ListaLigada instance = new ListaLigada();
        Aluno papai = new Aluno("Papai", 79);
        Aluno mamae = new Aluno("Mamãe", 59);
        
        instance.adiciona(papai);
        instance.adiciona(mamae);
        
        String result = instance.toString();

        assertTrue(result.contains("Papai") && result.contains("Mamãe"));
    }
    
    
    @Test
    public void testAdicionaVarios() {
        System.out.println("adiciona (VARIOS "+MAXIMO+" ELEMENTOS)");        
        ListaLigada instance = new ListaLigada();
        
        for (int i = 0; i < MAXIMO; i++) {
            Object elemento = new Aluno("Nome "+i, (int) (Math.random()*10));
            instance.adiciona(elemento);
        }
        
        assertTrue(instance.tamanho() == MAXIMO);
    }
    
    
    @Test
    public void testAdicionaVariosNoComeco() {
        System.out.println("adiciona (VARIOS "+MAXIMO+" ELEMENTOS)");        
        ListaLigada instance = new ListaLigada();
        
        for (int i = 0; i < MAXIMO; i++) {
            Object elemento = new Aluno("Nome "+i, (int) (Math.random()*10));
            instance.adicionaNoComeco(elemento);
        }
        
        assertTrue(instance.tamanho() == MAXIMO);
    }
}
