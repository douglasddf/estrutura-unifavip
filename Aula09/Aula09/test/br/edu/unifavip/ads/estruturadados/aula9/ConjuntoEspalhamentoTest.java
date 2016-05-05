/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifavip.ads.estruturadados.aula9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
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
public class ConjuntoEspalhamentoTest {
    
    private static final int MAXIMO = 200000;
    
    // ## estrutura otimizada para buscas ##
    private static ConjuntoEspalhamento instanceConjuntoEspalhamento = new ConjuntoEspalhamento();
    
    // ## estrutura Collections ##
    private static List<String> instanceCollectionTradicional;// = new Vector<>();
    
    
    private static String casoPalavraNoInicio;
    private static String casoPalavraNoMeio;
    private static String casoPalavraNoFim;
    
    public ConjuntoEspalhamentoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
        // insere vários registros
        
        StringBuilder palavra = new StringBuilder();
        
        if (instanceConjuntoEspalhamento != null) {
             inicializarConjuntoEspalhamento(palavra);
             
        } else if (instanceCollectionTradicional != null) {
            inicializarCollectionTradicional(palavra);
        }
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


    
    @Test
    public void testaTempoDePesquisaPorPalavraNoInicio() {
        long tempoInicial = System.currentTimeMillis();
        boolean temPalavra = false;
        
        if (instanceConjuntoEspalhamento != null) {
             temPalavra = instanceConjuntoEspalhamento.contem(casoPalavraNoInicio);        
        } else if (instanceCollectionTradicional != null) {
            temPalavra = instanceCollectionTradicional.contains(casoPalavraNoInicio);
        }

        long tempoFinal = System.currentTimeMillis();
        
        // calcula total de tempo gasto
        System.out.printf("testaTempoDePesquisaPorPalavraNoInicio -> %3f ms%n", (tempoFinal - tempoInicial) / 1000d);
        
        assertTrue(temPalavra);
    }
    
    
        @Test
    public void testaTempoDePesquisaPorPalavraNoMeio() {
        long tempoInicial = System.currentTimeMillis();    
        boolean temPalavra = false;
        
        if (instanceConjuntoEspalhamento != null) {
             temPalavra = instanceConjuntoEspalhamento.contem(casoPalavraNoMeio);        
        } else if (instanceCollectionTradicional != null) {
            temPalavra = instanceCollectionTradicional.contains(casoPalavraNoMeio);
        }
        
        long tempoFinal = System.currentTimeMillis();
        
        // calcula total de tempo gasto
        System.out.printf("testaTempoDePesquisaPorPalavraNoMeio -> %3f ms%n", (tempoFinal - tempoInicial) / 1000d);
        
        assertTrue(temPalavra);
    }
    
    @Test
    public void testaTempoDePesquisaPorPalavraNoFim() {
        long tempoInicial = System.currentTimeMillis();
        boolean temPalavra = false;

        if (instanceConjuntoEspalhamento != null) {
             temPalavra = instanceConjuntoEspalhamento.contem(casoPalavraNoFim);
        } else if (instanceCollectionTradicional != null) {
            temPalavra = instanceCollectionTradicional.contains(casoPalavraNoFim);
        }
        
        long tempoFinal = System.currentTimeMillis();
        
        
        // calcula total de tempo gasto
        System.out.printf("testaTempoDePesquisaPorPalavraNoFim -> %3f ms%n", (tempoFinal - tempoInicial) / 1000d);
        
        assertTrue(temPalavra);
    }
    
    
        @Test
    public void testaTempoDePesquisaPorPalavraEmComum() {
        long tempoInicial = System.currentTimeMillis();
        boolean temPalavra = false;
        String palavraEmComum = "_palavra_";

        if (instanceConjuntoEspalhamento != null) {
             temPalavra = instanceConjuntoEspalhamento.contem(palavraEmComum);
        } else if (instanceCollectionTradicional != null) {
            temPalavra = instanceCollectionTradicional.contains(casoPalavraNoFim);
        }
        
        long tempoFinal = System.currentTimeMillis();
        
        
        // calcula total de tempo gasto
        System.out.printf("testaTempoDePesquisaPorPalavraNoFim -> %3f ms%n", (tempoFinal - tempoInicial) / 1000d);
        
        assertTrue(temPalavra);
    }
    
    // ############ METODOS PRIVADOS ###################
    
    
    private static String getPalavraDoAlfabetoAleatoriamente() {
        
        StringBuilder sb = new StringBuilder();
        int palavra = 1 + (int) (Math.random() * 26);        
        
        switch (palavra) {
                case 1:
                    sb.append("A");
                    break;
                case 2:
                    sb.append("B");
                    break;                    
                case 3:
                    sb.append("C");
                    break;
                case 4:
                    sb.append("D");
                    break;
                case 5:
                    sb.append("E");
                    break;
                case 6:
                    sb.append("F");
                    break;
                case 7:
                    sb.append("G");
                    break;
                case 8:
                    sb.append("H");
                    break;
                case 9:
                    sb.append("I");
                    break;
                case 10:
                    sb.append("J");
                    break;
                case 11:
                    sb.append("K");
                    break;
                case 12:
                    sb.append("L");
                    break;
                case 13:
                    sb.append("M");
                    break;
                case 14:
                    sb.append("N");
                    break;
                case 15:
                    sb.append("O");
                    break;
                case 16:
                    sb.append("P");
                    break;
                case 17:
                    sb.append("Q");
                    break;
                case 18:
                    sb.append("R");
                    break;
                case 19:
                    sb.append("S");
                    break;
                case 20:
                    sb.append("T");
                    break;
                case 21:
                    sb.append("U");
                    break;
                case 22:
                    sb.append("V");
                    break;
                case 23:
                    sb.append("W");
                    break;
                case 24:
                    sb.append("X");
                    break;
                case 25:
                    sb.append("Y");
                    break;
                case 26:
                    sb.append("Z");
                    break;
                    
                default:
                    sb.append("A");
        }
        
        return sb.toString();
    }


    private static void inicializarConjuntoEspalhamento(StringBuilder palavra) {
        // adiciona muitas palavras
        
        for (int i = 0; i < MAXIMO; i++) {
            
            String letra = getPalavraDoAlfabetoAleatoriamente();
            
            palavra.setLength(0); // clear data            
            palavra.append(letra);
            palavra.append("_palavra_"+(i+1));
            instanceConjuntoEspalhamento.adiciona(palavra.toString());
        }
        
        int meio = instanceConjuntoEspalhamento.pegaTodas().size()/2;
        System.out.println("TOTAL ADIÇÕES -->"+MAXIMO+" <-- Conjunto Espalhamento");
        System.out.println("exemplo 1 -> "+instanceConjuntoEspalhamento.pegaTodas().get(0));
        System.out.println("exemplo 2 -> "+instanceConjuntoEspalhamento.pegaTodas().get(meio));
        System.out.println("exemplo 3 -> "+instanceConjuntoEspalhamento.pegaTodas().get((meio*2)-1));

        casoPalavraNoInicio = instanceConjuntoEspalhamento.pegaTodas().get(0);
        casoPalavraNoMeio = instanceConjuntoEspalhamento.pegaTodas().get(meio);
        casoPalavraNoFim = instanceConjuntoEspalhamento.pegaTodas().get((meio*2)-1);
        
        
    }
    
    private static void inicializarCollectionTradicional(StringBuilder palavra) {
        // adiciona muitas palavras
        
        for (int i = 0; i < MAXIMO; i++) {
            
            String letra = getPalavraDoAlfabetoAleatoriamente();
            
            palavra.setLength(0); // clear data            
            palavra.append(letra);
            palavra.append("_palavra_"+(i+1));
          
            instanceCollectionTradicional.add(palavra.toString());
        }
        
        int meio = instanceCollectionTradicional.size()/2;
        System.out.println("TOTAL ADIÇÕES -->"+MAXIMO+" <-- Conjunto Collections");
        System.out.println("exemplo 1 -> "+instanceCollectionTradicional.get(0));
        System.out.println("exemplo 2 -> "+instanceCollectionTradicional.get(meio));
        System.out.println("exemplo 3 -> "+instanceCollectionTradicional.get((meio*2)-1));
        
        casoPalavraNoInicio = instanceCollectionTradicional.get(0);
        casoPalavraNoMeio = instanceCollectionTradicional.get(meio);
        casoPalavraNoFim = instanceCollectionTradicional.get((meio*2)-1);
    }


    
}
