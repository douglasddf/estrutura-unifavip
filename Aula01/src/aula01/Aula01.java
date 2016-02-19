/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula01;

import dados.Pessoa;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author douglasfrari
 */
public class Aula01 {

    private static List<Pessoa>pessoas = new LinkedList<>();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double tempoInicio;
        double tempoFim;
        double tempoDiferenca;
        
        tempoInicio = System.currentTimeMillis();
        System.out.println("CARREGANDO (inicio) -> "+tempoInicio);
        
        inicializarPessoas();      
        
        tempoFim = System.currentTimeMillis();       
        tempoDiferenca = (tempoFim - tempoInicio);
        
        System.out.println("CARREGANDO (fim) -> "+tempoFim);
        System.out.println("CARREGANDO (diferenca) -> "+tempoDiferenca);
        
        // ----------------
        System.out.println("---------------------");
        tempoInicio = System.currentTimeMillis();
        System.out.println("-> MAIOR ALTURA (inicio) -> "+tempoInicio);
                
        imprimirMaiorAltura();
        
        tempoFim = System.currentTimeMillis();       
        tempoDiferenca = (tempoFim - tempoInicio);
        System.out.println("-> MAIOR ALTURA (fim) -> "+tempoFim);
        System.out.println("-> MAIOR ALTURA (diferenca) -> "+tempoDiferenca);
        
        
        
        
    }
    
    
    
    
    private static void inicializarPessoas() {
        /*
        Pessoa p1 = new Pessoa("João", 1.81);
        Pessoa p2 = new Pessoa("Gomes", 2.05);
        Pessoa p3 = new Pessoa("Manuel", 1.61);
        Pessoa p4 = new Pessoa("Paulo", 2.11);
        
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        pessoas.add(p4);
        */        
        for (int i = 0; i < 1000000; i++) {
            
            Pessoa p = new Pessoa("Fulano "+(i+1), Math.random()*10);
            pessoas.add(0,p);
        }
    }

    private static void imprimirMaiorAltura() {
        
        Pessoa pessoaComMaiorAltura = null;
        double maiorAltura = 0.0;
        for (Pessoa pessoa : pessoas) {
            
            if (pessoa.getAltura() > maiorAltura) {
                pessoaComMaiorAltura = pessoa;
                maiorAltura = pessoa.getAltura();                
            }
        }
        
        if(pessoaComMaiorAltura != null) {
            System.out.println(pessoaComMaiorAltura);
        }
        
    }
    
}
