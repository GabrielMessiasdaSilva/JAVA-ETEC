/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.terceiro_fatorial;

import java.util.Scanner;

/**
 *
 * @author dti
 */
public class Fatorial3 {
            public static void main(String[] args) {
        int numero;
        double resultado = 1;
        Scanner ler = new Scanner(System.in);
        System.out.println("Por favor,digite um número para calcular o seu fatorial: ");
        numero = ler.nextInt();
        int cont = 1;
        do
            {        
              resultado = resultado*cont;
              
              cont++;
            }
            while (cont <= numero);

            System.out.println("o fatorial de" + numero+" é" + resultado);
    }
}



