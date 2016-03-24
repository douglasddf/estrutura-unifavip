/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author alunofavip
 */
public class Pessoa {
    protected int codigo;
    private String nome;
    

    public Pessoa(String nome) {
        
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "codigo="+codigo+", nome="+nome;
    }

    
    
    
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    

}
