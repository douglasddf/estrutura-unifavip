/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

/**
 *
 * @author douglasfrari
 */
public class Pessoa {
    
    
    private String nome;
    private double altura;

    public Pessoa(String nome, double altura) {
        this.nome = nome;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "nome="+nome+", altura="+altura;
    }
    
    
    
    
}
