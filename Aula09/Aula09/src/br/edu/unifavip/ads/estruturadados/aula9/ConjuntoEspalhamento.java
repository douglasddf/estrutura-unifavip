/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifavip.ads.estruturadados.aula9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author douglasfrari
 */
public class ConjuntoEspalhamento {
    
    private int tamanho = 0;
    private List<List<String>> tabela = new ArrayList<List<String>>();
    
    public ConjuntoEspalhamento() {
        // alfabeto BR com 26 letras (incluindo K, W, Y)
        for (int i = 0; i < 26; i++) {
            LinkedList<String> lista = new LinkedList<String>();
            tabela.add(lista);
        }
    }
 
     
     
    public void adiciona(String palavra) {
        // implementação
         if (!this.contem(palavra)) {
        
            int indice = this.calculaIndiceDaTabela(palavra);
            List<String> lista = this.tabela.get(indice);
            lista.add(palavra);
            tamanho++;
         }

    }
    
    public void remove(String palavra) {
        // implementação
        
        if (this.contem(palavra)) {
            int indice = this.calculaIndiceDaTabela(palavra);
            List<String> lista = this.tabela.get(indice);
            lista.remove(palavra);
            tamanho--;
        }
    }
    
    
    public boolean contem(String palavra) {
        // implementação
        
        int indice = this.calculaIndiceDaTabela(palavra);
        List<String> lista = this.tabela.get(indice);
        
        return lista.contains(palavra);
    }
    public List<String> pegaTodas(){
        // implementação
        List<String> palavras = new ArrayList<String>();
        
        for (int i = 0; i < this.tabela.size(); i++) {
            palavras.addAll(this.tabela.get(i));
        }
        
        return palavras;
    }
    
    
    public int tamanho() {
        // implementação
        return tamanho;
    }
    
    
    
    public void imprimeTabela(){
        
        for (List<String> lista : this.tabela) {
           
            System.out.print("[");
            for (int i = 0; i < lista.size(); i++) {
                System.out.print("*");
            }
            System.out.println("]");
        }
    }
    
    private int calculaIndiceDaTabela(String palavra){
        
        int codigoDeEspalhamento = this.calculaCodigoDeEspalhamento(palavra);
        codigoDeEspalhamento = Math.abs(codigoDeEspalhamento);
        
        return codigoDeEspalhamento % tabela.size();
    }
    
    private int calculaCodigoDeEspalhamento(String palavra){
        int codigo = 1;
        
        for (int i = 0; i < palavra.length(); i++) {
            codigo = 31 * codigo + palavra.charAt(i);
        }
        
        return codigo;
    }
    
    
    
    
}
