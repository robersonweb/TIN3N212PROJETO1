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
public class INF3N212PJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        float nota1, nota2, nota3, nota4, media;

        System.out.println("--Notas escolares--");
        System.out.print("Informe a nota 1: \n");
        nota1 = leia.nextFloat();
        System.out.println("Informe a nota 2: ");
        nota2 = leia.nextFloat();
        System.out.println("Informa a nota 3: ");
        nota3 = leia.nextFloat();
        System.out.println("Informe a nota 4: ");
        nota4 = leia.nextFloat();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("A media é: %.2f", media);
    }

}
