/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.etec.padrao;

import java.util.Scanner;

/**
 *
 * @author g
 */
public class Multa2 {
    /**
     *
     */
      private static final Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        double mu;
        double kg;
       
        System.out.println("Digite a quantidade de peixe que você pescou");
        kg = teclado.nextDouble();
        mu = kg - 50*4;
        if (kg==50){
         System.out.println("Você não ultrapassou a quantidade de 50 kg de peixes");
        }else{
            mu = kg - 50 *4;
            System.out.println("Você ultrapassou o limite permitido ");
            System.out.println("Você devera pagar uma multa de 4 $ por quilos  excedentes"+mu);
        }
        
    }
}
