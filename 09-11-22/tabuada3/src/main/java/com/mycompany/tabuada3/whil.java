/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tabuada3;

import java.util.Scanner;

/**
 *
 * @author dti
 */
public class whil {
    public static void main(String[] args) {
    Scanner teclado= new Scanner(System.in);
        int cont = 0;
        int  num;
        int res;
        
        System.out.println("Informe o número para o cálculo da tabuada");
        num = teclado.nextInt();
        if ((num >= 1) && (num<=10)) 
            
        
        while (cont < 11) {
            res = cont * num;
            System.out.println(cont + "*" + num + "=" + res);
            cont = cont+ 1;
            
             }  else {
                    System.out.println("numero invalido");
                    System.exit(0);
        }
    }
}


    

