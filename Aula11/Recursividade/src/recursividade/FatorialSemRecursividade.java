/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividade;

import java.util.Scanner;


public class FatorialSemRecursividade {
    
    public static void main(String[] args){
    
        Scanner ent = new Scanner(System.in);
        int num = 1;
        double fat = 1;
        int cont = 1;

        do{
            System.out.println("Digite um nº");
            num = ent.nextInt();
            
            fat = funcaoFatorial(num);
            
            System.out.println("!" + num + " = " + fat);
            cont++;
            
       }while(cont < 2);
    }



    public static double funcaoFatorial(int num) {
        long fat = 1;
        
        for(int i = 1;i <= num; i++){
            fat = fat * i;
        }


        return fat;
    }


}
/* Passo-a-passo do algoritmo
fat = fat * i -> fat
fat = 1 * 1 -> 1
fat = 1 * 2 -> 2
fat = 2 * 3 -> 6
fat = 6 * 4 -> 24
fat = 24 * 5 -> 120
 */
    

