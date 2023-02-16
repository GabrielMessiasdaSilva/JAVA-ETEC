/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.etec.padrão;

import java.util.Scanner;

/**
 *
 * @author dti
 */
public class Principal {

    /**
     *
     */
    private static final Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        double imc;
        double alt;
        double peso;
        
        System.out.println("digite o seu peso");
        peso = teclado.nextDouble();
        System.out.println("digite a sua altura");
        alt = teclado.nextDouble();
        imc = peso / (alt * alt);
        if (imc < 18) {
            System.out.println("seu indice do imc é de magreza");
        } else {
            if (imc < 24.9) {
                System.out.println("seu imc é de saudável");
            } else {
                if (imc > 29.9) {
                    System.out.println("seu indice de imc é de sobrepeso");
                } else {
                    if (imc >= 30.00) {
                        System.out.println("seu indice de imc é de Obesidade");
                    }
                }
            }
        }
    }
}
