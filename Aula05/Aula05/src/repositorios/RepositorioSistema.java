/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

import java.util.ArrayList;
import modelos.Produto;
/**
 *
 * @author alunofavip
 */
public class RepositorioSistema implements RegrasRepositorioSistema {

    private ArrayList<Produto> listaProdutos = new ArrayList();
    
    
    @Override
    public void adicionarProduto(Produto produto) {
        this.listaProdutos.add(produto);
    }
    
    @Override
    public Produto recuperarProdutoPeloCodigo(int codigo) {
    
        Produto produtoProcurado = null;
        for (Produto produtoAtual : listaProdutos) {
            if (produtoAtual.getCodigo() == codigo) {
                produtoProcurado = produtoAtual;
                break;
            }
        }
        
        return produtoProcurado;

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
        return this.listaProdutos.size();
    }


    
}
