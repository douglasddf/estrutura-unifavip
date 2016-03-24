/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrutura;

/**
 *
 * @author douglasfrari
 */
public interface RegrasListaLigada {
    
    public void adiciona(Object elemento);
    
    public void adiciona(int posicao, Object elemento);
    
    public Object pega(int posicao);
    
    public void remove(int posicao);
    
    public int tamanho();
    
    public boolean contem(Object o);

    // novas regras 
    
    public void adicionaNoComeco(Object elemento);
    
    public void removeDoComeco();
    
    public void removeDoFim();
}
