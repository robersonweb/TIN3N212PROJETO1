/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212pj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author 631910092
 */
public class ArrayListInicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        
        ArrayList<String> nomes = new ArrayList<>();
        System.out.println("Array está vazio?" + nomes.isEmpty());
        System.out.println("Quantos registros: " + nomes.size());
        
        nomes.add("Roberson");
        System.out.println("Depois de add valor");
        System.out.println("Array está vazio?" + nomes.isEmpty());
        System.out.println("Quantos registros:" + nomes.size());
        
        System.out.println("Digite um nome:");
        nomes.add(leia.next());
        System.out.println("Depois de add valor:");
        System.out.println("Quantos registros:" + nomes.size());
        System.out.println("Nomes:" + nomes.toString());
        
        nomes.add(0,"Felipe");
        System.out.println("Depois de add valor");
        System.out.println("Quantos registros:" + nomes.size());
        System.out.println("Nomes:" + nomes.toString());
        
        nomes.add(3,"Juvenal");
        System.out.println("Depois de add valor");
        System.out.println("Quantos registros:" + nomes.size());
        System.out.println("Nomes:" + nomes.toString());
        
        System.out.println("Index de Roberson " + nomes.indexOf("Roberson"));
        
        nomes.remove("Roberson");
        System.out.println("Resultado depois de remover Roberson");
        System.out.println("Quantos registros: " + nomes.size());
        System.out.println("Nomes: " + nomes.toString());
        
        nomes.add("André");
        nomes.add("Silvano");
        nomes.add("Bagre");
        nomes.add("Godzilla");
        System.out.println("Depois de add valor");
        System.out.println("Quantos registros:" + nomes.size());
        System.out.println("Nomes:" + nomes.toString());
        
        
        nomes.remove("Felipe");
        
        Collections.sort(nomes);
        System.out.println("Array ordenado");
        System.out.println("Nomes" + nomes.toString());
        
        
        
        
    }
    
}
