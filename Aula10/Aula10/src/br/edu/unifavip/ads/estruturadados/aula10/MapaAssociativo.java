/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifavip.ads.estruturadados.aula10;

/**
 *
 * @author douglasfrari
 */
public class MapaAssociativo {
    
    private String placa;
    private Carro carro;

    public MapaAssociativo(String placa, Carro carro) {
        this.placa = placa;
        this.carro = carro;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    @Override
    public String toString() {
        return "Placa="+placa+" - "+carro;
    }
    
    
    
}
