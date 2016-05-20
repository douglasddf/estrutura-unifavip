package recursividade;

//Importa a classe Scanner para realizar leituras do teclado.
import java.util.Scanner;

/**
 * Este é um algoritmo que calcula o fatorial de um número utilizando as artimanhas
 * da recursão.
 * Este algoritmo foi baseado na versão em C de um amigo.
 * Vocês podem encontra-lo em: www.vivaolinux.com.br/script/Fatorial-Recursivo
 * Espero que seja de ajuda ao pessoal que está começando agora. xD
 */

public class FatorialComRecursividade {

    /**
     * Este é um método estático que faz o calculo do fatorial de um número que é
     * passado como parâmetro e retorna para a função principal o resultado.
    */
    public static double fatorial(int num) {
       /**
         * Este é o caso base, se o número passado por parametro for 0 ou 1,
         * ele retorna o resultado 1 e finaliza o método.
         */
        if (num <= 1) {
            return 1;
        } else {
            /**
             * chama o método fatorial novamente, mas dessa vez enviando como
             * parametro (n - 1).
             */            
            return fatorial(num - 1) * num;
        }
    }

    public static void main(String[] args) {

        //Declara uma variável para guardar o número que o usuário digitar
        int numero;

        //Instancia um objeto da classe Scanner para realizar a leitura do teclado (System.in)
        Scanner entrada = new Scanner(System.in);

        //Imprime na saída
        System.out.println("Digite o número que você pretende obter o fatorial.");

        /**Aqui a variável 'numero' irá receber a entrada que o usuário digitar.
         * A minha instancia de Scanner, no caso 'entrada', utilizará o método nextInt()
         * para ler o que vier do teclado como sendo um int.
         */
        numero = entrada.nextInt();

        double valor = fatorial(numero);
        
        //imprime o resultado do fatorial
        System.out.println("O fatorial de " + numero + " é " + valor + ".");


    }
}
