/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifavip.ads.estruturadados.aula10;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author douglasfrari
 */
public class ListaMapa {
    
    
    private List<MapaAssociativo> associacoes = new ArrayList();
    
    public void adiciona(String placa, Carro carro) {
        
        if (!this.contemChave(placa)) {
            MapaAssociativo associacao = new MapaAssociativo(placa, carro);
            this.associacoes.add(associacao);
        }
        
    }
    public Carro pega(String placa) {
        for (MapaAssociativo associacao : this.associacoes) {
            if (placa.equals(associacao.getPlaca())) {
                return associacao.getCarro();
            } 
        }
        throw new IllegalArgumentException("chave não existe");
    }
    
    public void remove(String placa) {
        
        if (this.contemChave(placa)) {
        
            for (int i = 0; i < this.associacoes.size(); i++) {
                MapaAssociativo associacao = this.associacoes.get(i);
                
                if (placa.equals(associacao.getPlaca())) {
                
                    this.associacoes.remove(i);
                    break;
                } 
            }
        } else {
            throw new IllegalArgumentException("chave não existe");
        }
        
    }
    
    public boolean contemChave(String placa) {
        
        for (MapaAssociativo associacao : this.associacoes) {
        
            if (placa.equals(associacao.getPlaca())) {
                return true;
            } 
        }
        return false;        
    }
    
    
    public int tamanho() {
    
        return this.associacoes.size();
    }
}
