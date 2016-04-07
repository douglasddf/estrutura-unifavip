/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author douglasfrari
 */
public class Produto {
    
    private String nome;
    private String descricao;
    private double precoVenda;
    private double precoCusto;

    public Produto() {
    }

    public Produto(String nome, String descricao, double precoVenda, double precoCusto) {
        this.nome = nome;
        this.descricao = descricao;
        this.precoVenda = precoVenda;
        this.precoCusto = precoCusto;
    }

    @Override
    public String toString() {
        StringBuilder relatorio = new StringBuilder();
        relatorio.append("nome="+nome);
        relatorio.append(", descrição="+descricao);
        relatorio.append(", preço venda="+precoVenda);
        relatorio.append(", preço custo="+precoCusto);
        
        return relatorio.toString();
    }
    
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }
    
    
    
}
