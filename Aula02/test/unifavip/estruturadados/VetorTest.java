/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unifavip.estruturadados;

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
public class VetorTest {
    
    private static final int TOTAL = 200000;
    
    
    public VetorTest() {
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
     * Test of adicionaAluno method, of class Vetor.
     */
    @Test
    public void testAdicionaAluno_Aluno() {
        System.out.println("adicionaAluno");
        Aluno aluno = null;
        Vetor instance = new Vetor();
        instance.adicionaAluno(aluno);

        assertTrue(instance.tamanho() == 1);
    }

    /**
     * Test of adicionaAluno method, of class Vetor.
     */
    @Test
    public void testAdicionaAluno_int_Aluno() {
        System.out.println("adicionaAluno");
        int posicao = 99;
        Aluno aluno = null;
        Vetor instance = new Vetor();
        instance.adicionaAluno(posicao, aluno);
        
        
        assertTrue(instance.tamanho() == 1);
        
    }

    /**
     * Test of pegaAluno method, of class Vetor.
     */
    @Test
    public void testPegaAluno() {
        System.out.println("pegaAluno");
        int posicao = 0;
        Vetor instance = new Vetor();
        Aluno expResult = new Aluno("Batman");        
        instance.adicionaAluno(expResult);
        
        Aluno result = instance.pegaAluno(posicao);
        
        assertEquals(expResult, result);
        assertTrue(expResult.equals(result));
    }

    /**
     * Test of remove method, of class Vetor.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        int posicao = 0;
        Vetor instance = new Vetor();
        
        Aluno aluno = new Aluno("Ryu");        
        instance.adicionaAluno(aluno);
        
        
        instance.remove(posicao);
        
        assertTrue(instance.tamanho() == 0);
    }

    /**
     * Test of contem method, of class Vetor.
     */
    @Test
    public void testContem() {
        System.out.println("contem");
        Aluno aluno = new Aluno("Xuxa");   
        Vetor instance = new Vetor();        
        instance.adicionaAluno(aluno);
        
        boolean expResult = true;
        boolean result = instance.contem(aluno);
        assertEquals(expResult, result);
    }

    /**
     * Test of tamanho method, of class Vetor.
     */
    @Test
    public void testTamanho() {
        System.out.println("tamanho");
        Vetor instance = new Vetor();
        int expResult = 0;
        int result = instance.tamanho();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of listaTodos method, of class Vetor.
     */
    @Test
    public void testListaTodos() {
        System.out.println("listaTodos");
        Vetor instance = new Vetor();
        String expResult = "[]";
        String result = instance.listaTodos();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of toString method, of class Vetor.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Vetor instance = new Vetor();
        String expResult = "[]";
        String result = instance.toString();
        
        assertEquals(expResult, result);
        
        
    }
    
    @Test
    public void testAdicionarAlunos() {
        
        String textoDiferenca = "Adicionar "+TOTAL+" Alunos";
        long tempoInicial = System.currentTimeMillis();
        
        Vetor instance = new Vetor();
        
        for (int i = 0; i < TOTAL; i++) {
            Aluno aluno = new Aluno("Aluno "+(i+1));
            instance.adicionaAluno(aluno);
        }
        
        long tempoFinal = System.currentTimeMillis();
        
        exibirTempo(textoDiferenca, (tempoFinal-tempoInicial));

        assertTrue(instance.tamanho() == TOTAL);

    }
    
    @Test
    public void testAdicionarAlunosNaPosicaoInicial() {
       
        String textoDiferenca = "Adicionar "+TOTAL+" Alunos na posiçao INICIAL";
        long tempoInicial = System.currentTimeMillis();
        
        Vetor instance = new Vetor();
        
        for (int i = 0; i < TOTAL; i++) {
            Aluno aluno = new Aluno("Aluno "+(i+1));
            instance.adicionaAluno(0,aluno);
        }
        
        long tempoFinal = System.currentTimeMillis();
        
        exibirTempo(textoDiferenca, (tempoFinal-tempoInicial));

        assertTrue(instance.tamanho() == TOTAL);

    }
    
    @Test
    public void testAdicionarAlunosNaPosicaoMeio() {

        String textoDiferenca = "Adicionar "+TOTAL+" Alunos na posiçao MEIO";
        long tempoInicial = System.currentTimeMillis();
        
        Vetor instance = new Vetor();
        
        for (int i = 0; i < TOTAL; i++) {
            Aluno aluno = new Aluno("Aluno "+(i+1));
            instance.adicionaAluno(instance.tamanho()/2,aluno);
        }
        
        long tempoFinal = System.currentTimeMillis();
        
        exibirTempo(textoDiferenca, (tempoFinal-tempoInicial));

        assertTrue(instance.tamanho() == TOTAL);

    }
    
    @Test
    public void testAdicionarAlunosNaPosicaoFinal() {
       
        String textoDiferenca = "Adicionar "+TOTAL+" Alunos na posiçao FINAL";
        long tempoInicial = System.currentTimeMillis();
        
        Vetor instance = new Vetor();
        
        for (int i = 0; i < TOTAL; i++) {
            Aluno aluno = new Aluno("Aluno "+(i+1));
            instance.adicionaAluno(instance.tamanho(),aluno);
        }
        
        long tempoFinal = System.currentTimeMillis();
        
        exibirTempo(textoDiferenca, (tempoFinal-tempoInicial));

        assertTrue(instance.tamanho() == TOTAL);

    }

    
    private void exibirTempo(String texto, double diferencaTempo) {
        
        float tempoAtual;
        tempoAtual = (float)(diferencaTempo / 1000) % 60;
        
        if (tempoAtual < 60) {
            System.out.printf("%s -> tempo: %f segundos <-\n",texto,tempoAtual);
        } else {
            float minutos = (float)(diferencaTempo / 60000) % 60;
            System.out.printf("%s -> tempo: %f minuto(s) <-\n",texto,minutos);
        }
        
    }
    
}
