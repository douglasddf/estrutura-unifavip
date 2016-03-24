/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

import modelos.Produto;

/**
 *
 * @author alunofavip
 */
public interface RegrasRepositorioSistema {
    // CRUD para PRODUTO
    
    // CREATE
    public void adicionarProduto(Produto produto);

    // READ
    public Produto recuperarProdutoPeloCodigo(int codigo); 

    // UPDATE
    public void atualizarProduto(Produto produto);
    
    // DELETE
    public void removerProduto();
    
    
    
    
}
