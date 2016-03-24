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
public class ListaLigada implements RegrasListaLigada {
    
    
    private int totalDeElementos;
    private Celula primeira;
    private Celula ultima;

    @Override
    public void adiciona(Object elemento) {
        
        if (this.totalDeElementos == 0) {
            this.adicionaNoComeco(elemento);
        } else {
            Celula nova = new Celula(elemento);
            this.ultima.setProxima(nova);
            nova.setAnterior(this.ultima);
            this.ultima = nova;
            this.totalDeElementos++;
        }
    }

    @Override
    public void adiciona(int posicao, Object elemento) {

        if(posicao == 0){ // No começo.
            this.adicionaNoComeco(elemento);
        } else if(posicao == this.totalDeElementos){ // No fim.
            this.adiciona(elemento);
        } else {
            Celula anterior = this.pegaCelula(posicao - 1);
            Celula proxima = anterior.getProxima();
            Celula nova = new Celula(anterior.getProxima(), elemento);
            nova.setAnterior(anterior);
            anterior.setProxima(nova);
            proxima.setAnterior(nova);
            
            this.totalDeElementos++;
        }
    }

    @Override
    public Object pega(int posicao) {
        return this.pegaCelula(posicao).getElemento();
    }

    @Override
    public void remove(int posicao) {
                
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição não existe");
        }
        
        if (posicao == 0) {
            
            this.removeDoComeco();
            
        } else if (posicao == this.totalDeElementos - 1) {
            
            this.removeDoFim();
            
        } else {
            Celula anterior = this.pegaCelula(posicao - 1);
            Celula atual = anterior.getProxima();
            Celula proxima = atual.getProxima();
            anterior.setProxima(proxima);
            proxima.setAnterior(anterior);
            
            this.totalDeElementos--;
        }        
    }

    @Override
    public int tamanho() {
        return this.totalDeElementos;
    }

    @Override
    public boolean contem(Object elemento) {
        
        Celula atual = this.primeira;
        
        while (atual != null) {
            if (atual.getElemento().equals(elemento)) {
                return true;
            }

            atual = atual.getProxima();
        }
    
        return false;        
    }

    @Override
    public void adicionaNoComeco(Object elemento) {
       
        if(this.totalDeElementos == 0){
            Celula nova = new Celula(elemento);
            this.primeira = nova;
            this.ultima = nova;
        } else {
            Celula nova = new Celula(this.primeira, elemento);
            this.primeira.setAnterior(nova);
            this.primeira = nova;
        }
        this.totalDeElementos++;
    }

    @Override
    public void removeDoComeco() {
        
        if (!posicaoOcupada(0)) {
            throw new IllegalArgumentException("Posição não existe");
        }
        
        this.primeira = this.primeira.getProxima();
        this.totalDeElementos--;
        
        if (this.totalDeElementos == 0) {
            this.ultima = null;
        }
        
    }

    @Override
    public void removeDoFim() {
               
        if (!this.posicaoOcupada(this.totalDeElementos - 1)) {
            throw new IllegalArgumentException("Posição não existe");
        }
        
        if (this.totalDeElementos == 1) {
            this.removeDoComeco();
        } else {
            Celula penultima = this.ultima.getAnterior();
            penultima.setProxima(null);
            this.ultima = penultima;
            this.totalDeElementos--;
        }        
    }

    @Override
    public String toString() {
        
        // Verificando se a Lista está vazia
        if(this.totalDeElementos == 0){
            return "[]";
        }
        
        StringBuilder builder = new StringBuilder("[");
        Celula atual = primeira;
        
        // Percorrendo até o penúltimo elemento.
        for (int i = 0; i < this.totalDeElementos - 1; i++) {
            builder.append(atual.getElemento());
            builder.append(", ");
            atual = atual.getProxima();
        }

        // último elemento
        builder.append(atual.getElemento());
        builder.append("]");
        
        return builder.toString();
    }
    
    
    
    private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao < this.totalDeElementos;
    }
    
    
    private Celula pegaCelula(int posicao) {
        
        if(!this.posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição não existe");
        }
        Celula atual = primeira;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProxima();
            // break <- ponto de otimizacao
        }
        
        return atual;   
    }
    
}
