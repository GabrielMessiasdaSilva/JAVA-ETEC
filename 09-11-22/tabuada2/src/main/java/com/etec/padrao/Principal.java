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
     public static void main(String[] args){
     Scanner teclado = new Scanner(System.in);{
        int i;
        int num;
        int res;
        
        i = 1;
        System.out.println("Informe o número para o cálculo da tabuada");
        num = teclado.nextInt();
        
        if ((num >= 1) && (num<=10)) {
        do {
            res = i * num;
            System.out.println(i + "*" + num + "=" + res);
            i = i + 1;
        } while (i <= 10);
        
        
        }  else {
                    System.out.println("numero invalido");
                    System.exit(0);
                    
                    }  

    
        
        }
    }
}

    

