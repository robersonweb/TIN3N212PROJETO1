/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212pj;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import static java.time.temporal.TemporalQueries.localDate;
import java.util.Scanner;

/**
 *
 * @author 631910092
 */
public class Aula01122022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/mm/yyyy"); //BIBLIOTECA INTERNA DO JAVA
        LocalDate dtNascimento,hoje = LocalDate.now();
        long diasvida;
        
        System.out.println("Cálculo de dias de vida exato");
        System.out.print("Informe sua data de nascimento: ");
        dtNascimento = LocalDate.parse(leia.next(),dtf);
        System.out.println("Data Nasc.: " + dtf.format(dtNascimento)); // .format ele permite que a data tenha o formato 18/06/1987 se nao colocasse o .format a data seria assim ex 10-06-1987
        System.out.println("Data Atual; " + dtf.format(hoje));
        diasvida = ChronoUnit.DAYS.between(dtNascimento, hoje);
        System.out.println("Dias de vida exato: " + diasvida);
        
       
        
    }
    
}
