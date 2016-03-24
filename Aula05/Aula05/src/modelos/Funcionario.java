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
public class Funcionario extends Pessoa {
    
    private static int codigoAtual;

    public Funcionario(String nome) {
        super(nome);
        this.codigo = ++codigoAtual;
    }
    
}
