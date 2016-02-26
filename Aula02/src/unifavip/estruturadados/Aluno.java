/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unifavip.estruturadados;

/**
 *
 * @author douglasfrari
 */
public class Aluno {
    
    private String nome;
    
    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "nome="+this.nome;
    }

    @Override
    public boolean equals(Object obj) {
        
        Aluno outro = (Aluno) obj;
        String nomeAtual = this.nome;
        
        return nomeAtual.equals(outro.nome);
    }
    
    
    
}
