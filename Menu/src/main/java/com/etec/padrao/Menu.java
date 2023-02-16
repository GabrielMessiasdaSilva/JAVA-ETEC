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
public class Menu {
public static Scanner teclado = new Scanner (System.in);
    public static void main(String[] args) {
        int opcao;
        System.out.println("seja bem vindo,eu Gabriel irei apresentar o nosso menu de lanches");
        System.out.println("temos 6 opçoes de lanches");
        System.out.println("digite uma opção");
          System.out.println(" para escolher o lanche digite essas opções 1 para bigMac,2 Quarteirão,3MacchonKen,4Cheddar ,5 Macmelt e 6 para Mac Max");
        opcao= teclado.nextInt();
        if (opcao == 1) {
         System.out.println("o lanche escolhido foi o BigcMac");
         
        } else {
            if (opcao == 2) {
                System.out.println("o lanche escolhido foi Quarteirão");
            } else {
                if (opcao == 3) {
                    System.out.println("o lanche escolhido foi MacChiken");
                } else {
                    if (opcao == 4) {
                        System.out.println("o lanche escolhido foi Cheddar");
                    } else {
                        if (opcao == 5) {
                            System.out.println("o lanche escolhido foi MacMelt");
                        } else {
                            if (opcao == 6) {
                                System.out.println("o lanche escolhido foi MacMax");
                            } else {
                                System.out.println("número de opção invalida");
                            }
                        }
                    }
                }
            }
        }
    }
}

    


