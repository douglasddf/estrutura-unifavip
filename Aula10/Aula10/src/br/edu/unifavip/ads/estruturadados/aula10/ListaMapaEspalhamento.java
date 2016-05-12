/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifavip.ads.estruturadados.aula10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author douglasfrari
 */
public class ListaMapaEspalhamento {
    
    private List<List<MapaAssociativo>> tabela = new ArrayList();

    public ListaMapaEspalhamento() {
        
        for (int i = 0; i < 100; i++) {
            this.tabela.add(new LinkedList<MapaAssociativo>());
        }
        
    }
    
    
    public boolean contemChave(String placa) {
        int indice = this.calculaIndiceDaTabela(placa);
        List<MapaAssociativo> lista = this.tabela.get(indice);
        for (int i = 0; i < lista.size(); i++) {
            MapaAssociativo associacao = lista.get(i);
            if (associacao.getPlaca().equals(placa)) {
                return true;
            }
        }
        
        return false;
    }
    
    public void remove(String placa) {
        int indice = this.calculaIndiceDaTabela(placa);
        List<MapaAssociativo> lista = this.tabela.get(indice);
        for (int i = 0; i < lista.size(); i++) {
            MapaAssociativo associacao = lista.get(i);
            if (associacao.getPlaca().equals(placa)) {
                lista.remove(i);
                return; 
            }
        }
    
        throw new IllegalArgumentException("A chave não existe");
    }
    
    
    
    public void adiciona(String placa, Carro carro) {
        if (this.contemChave(placa)) {
            this.remove(placa);
        }
        
        int indice = this.calculaIndiceDaTabela(placa);
        List<MapaAssociativo> lista = this.tabela.get(indice);
        lista.add(new MapaAssociativo(placa, carro));
        
    }
    
    
    public Carro pega(String placa) {
    
        int indice = this.calculaIndiceDaTabela(placa);
    
        List<MapaAssociativo> lista = this.tabela.get(indice);
    
        for (int i = 0; i < lista.size(); i++) {
            MapaAssociativo associacao = lista.get(i);
            if (associacao.getPlaca().equals(placa)) {
                return associacao.getCarro();
            }
        }
    
        throw new IllegalArgumentException("A chave não existe");
    }
    
    private int calculaIndiceDaTabela(String placa) {
        return Math.abs(placa.hashCode()) % this.tabela.size();
    }
    
    
    
}
