/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.Date;

/**
 *
 * @author alunofavip
 */
public class Venda {
    
    private int codigo;
    private Date data;
    private Produto produto;
    private Funcionario funcionario;
    private Cliente cliente;
    
    private static int codigoAtual;

    public Venda(Produto produto, 
                 Funcionario funcionario, 
                 Cliente cliente) {
        this.codigo = ++codigoAtual;
        this.data = new Date();
        
        this.produto = produto;
        this.funcionario = funcionario;
        this.cliente = cliente;
    }
    
    @Override
    public String toString() {
        StringBuilder relatorio = new StringBuilder();
        
        relatorio.append("codigo="+codigo);
        relatorio.append(",data="+data);
        relatorio.append(",produto="+produto);
        relatorio.append(",funcionario="+funcionario);
        relatorio.append(",cliente="+cliente);
        
        
        return relatorio.toString();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    
    
    
    
}
