/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

import java.util.ArrayList;
import modelos.Produto;
import estrutura.ListaLigada;
/**
 *
 * @author alunofavip
 */
public class RepositorioSistema implements RegrasRepositorioSistema {

    //private ArrayList<Produto> listaProdutos = new ArrayList();
    private ListaLigada listaProdutos = new ListaLigada();
    
    @Override
    public void adicionarProduto(Produto produto) {
        this.listaProdutos.adiciona(produto);
    }
    
    @Override
    public Produto recuperarProdutoPeloCodigo(int codigo) {
    
        Produto objetoEncontrado = null;
        
        for (int i = 0; i < this.listaProdutos.tamanho(); i++) {
            objetoEncontrado = (Produto)this.listaProdutos.pega(i);
            
            if (objetoEncontrado.getCodigo() == codigo) {
                // achei
                break;
            }
        }
        
        return objetoEncontrado;
    }

    @Override
    public void atualizarProduto(Produto produto) {
        Produto p = this.recuperarProdutoPeloCodigo(produto.getCodigo());
        p = produto;
        
    }

    @Override
    public void removerProduto() {
       
    }
    
    public int getTotalProdutos() {
        return this.listaProdutos.tamanho();
    }


    
}
