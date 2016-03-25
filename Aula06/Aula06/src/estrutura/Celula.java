/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrutura;

/**
 * Representa uma célula para tratar em listas Duplamente Ligadas.
 * 
 * @author douglasfrari
 */
class Celula {
    
    private Celula proxima;
    private Celula anterior;
    private Object elemento;

    public Celula(Celula proxima, Object elemento) {
        this.proxima = proxima;
        this.elemento = elemento;
    }

    public Celula(Object elemento) {
        this.elemento = elemento;
    }

    public void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }

    public Celula getAnterior() {
        return anterior;
    }

    
    public void setProxima(Celula proximaCelula) {
        this.proxima = proximaCelula;
    }

    public Celula getProxima() {
        return proxima;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }
    
}
