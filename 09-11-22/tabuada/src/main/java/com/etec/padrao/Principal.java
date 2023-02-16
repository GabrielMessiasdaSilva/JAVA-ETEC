/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.etec.padrao;

import java.util.Scanner;

/**
 *
 * @author dti
 */
public class Principal {


       public static void main (String [] args) {
       Scanner teclado = new Scanner (System.in);

       int numero;
       int result;
      

          System.out.println("digite um numero de 1 á 10");
           numero= teclado.nextInt();
                
        if ((numero >= 1) && (numero<=10)) {
            for (int cont = 1 ; cont <= 10; cont++)
            {
                result = (cont*numero);
                
                System.out.println(numero+ "*" + cont+ "=" + result);
                        
                System.out.println("");
            }  
            } 
            else {
                    System.out.println("numero invalido");
                    System.exit(0);
                    
                    }  
       }
}        


       


    

