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
public class Vetor implements IListaAlunos {

    private static final int MAXIMO = 100;
    
    private Aluno[] alunos = new Aluno[MAXIMO];
    private int totalAlunos = 0;
    
    
    @Override
    public void adicionaAluno(Aluno aluno) {
        
        this.garantaEspaco();
        
//        for (int i = 0; i < alunos.length; i++) {
//            
//            if(alunos[i] == null) {
//                // tem espaco
//                alunos[i] = aluno;
//                totalAlunos++;
//                break;
//            }
//            
//        }
        if(aluno == null) {
            throw new IllegalArgumentException("Objeto Inválido!");
        }
        
        alunos[totalAlunos] = aluno;
        totalAlunos++;
    }

    @Override
    public void adicionaAluno(int posicao, Aluno aluno) {
        
        this.garantaEspaco();
        
        if(!posicaoValida(posicao)) {
            throw new IllegalArgumentException("Posição Inválida!");
        }
        
        for (int i = totalAlunos-1; i >= posicao; i-=1) {
            this.alunos[i + 1] = this.alunos[i];
        }
        
        this.alunos[posicao] = aluno;
        this.totalAlunos++;
    }

    @Override
    public Aluno pegaAluno(int posicao) {

        if(!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posicao inválida!");            
        }
        
        return alunos[posicao];        
    }

    @Override
    public void remove(int posicao) {
        
        
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = posicao; i < this.totalAlunos - 1; i++) {
            this.alunos[i] = this.alunos[i + 1];
        }
        this.totalAlunos--;
        
    }

    @Override
    public boolean contem(Aluno aluno) {
        boolean contemAluno = false;
        
        for (int i = 0; i < alunos.length; i++) {
            if(alunos[i] != null && alunos[i].equals(aluno)) {
                contemAluno = true;
                break;
            }
        }
        
        return contemAluno;
    }

    @Override
    public int tamanho() {
        return this.totalAlunos;
    }

    @Override
    public String listaTodos() {
        return toString();
    }

    @Override
    public String toString() {
        
        if (this.totalAlunos == 0) {
            return "[]";
        }
        
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        
        for (int i = 0; i < totalAlunos -1; i++) {
            builder.append(this.alunos[i]);
            builder.append(", ");
        }
        builder.append(this.alunos[this.totalAlunos -1]);
        builder.append("]");
        
        return builder.toString(); 
    }
    
    
    
    
    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.totalAlunos;
    }
    
    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao < this.alunos.length;
    }
    
    
    private void garantaEspaco() {
        if (this.totalAlunos == this.alunos.length) {
            Aluno[] novaArray = new Aluno[this.alunos.length * 2];
            for (int i = 0; i < this.alunos.length; i++) {
                novaArray[i] = this.alunos[i];
            }
            this.alunos = novaArray;
        }
    }

}
