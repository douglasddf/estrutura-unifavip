/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifavip.ads.estruturadados.aula8;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author douglasfrari
 */
public class Fila<T> {
    
    private List<T> fila = new LinkedList();
    
    public void insere(T objeto) {        
        this.fila.add(objeto);
}
    public T remove() throws Exception {
        
        if (vazia()) {
            throw new Exception("Não se pode remover porque Fila está vazia.");                    
        }
        
        return fila.remove(0);
    }
    
    public boolean vazia() {        
        return this.fila.size() == 0;
    }
    
}

/**
 *  (opcional) É possível implementar a nossa Fila utilizando 
 * internamente uma ArrayList em vez de LinkedList? Teremos algum ganho
 * ou perda no consumo de tempo de alguma das operações? Mos- tre a diferença 
 * através de um código que adiciona e remova muita gente da  la.
 */