/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212pj;

import java.util.Scanner;

/**
 *
 * @author 631910092
 */
public class calcIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        float peso, alt, imc;
        // TODO code application logic here
        
        
        System.out.println("--Calculo IMC--");
        System.out.print("Informe o seu peso: \n");
        peso = leia.nextFloat();
        System.out.println("Informe a altura: \n");
        alt = leia.nextFloat();
        
        imc = peso /(alt*alt);
        
        System.out.printf("O IMC é: %.2f", imc );
        
        
    }
    
}
