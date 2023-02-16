
package com.mycompany.principal;

import java.util.Scanner;

public class Principal {
 public static Scanner teclado = new Scanner(System.in);
    
  public static int a,b,c;
  public static double delta;
    
  public static void main(String[] args) {
  System.out.println("Equação de segundo grau");
        
    System.out.println("Informe o A da equação: ");
         a = teclado.nextInt();
        
       System.out.println("Informe o B da equação: ");
         b = teclado.nextInt();
        
         System.out.println("Informe o C da equação: ");
           c = teclado.nextInt();
        
        delta = (b*b) - (4*a*c) ;
        
        System.out.println("O delta é " + delta);
        
        if (delta<0) {
            System.out.println("Não existem valores reais");
        } else {
            if (delta==0) {
                double x1;
                x1 = -b/(2*a);
                System.out.println("Só existe 1 raiz e ela é " + x1);
            } else {
                double x1,x2;
                x1 = ((-b + Math.sqrt(delta)) / (2*a));
                x2 = ((-b - Math.sqrt(delta)) / (2*a));
                
                System.out.println("Só existe 2 raizes reais");
                System.out.println("X1: " + x1);
                System.out.println("X2: " + x2);
            }
        }
    }
}
