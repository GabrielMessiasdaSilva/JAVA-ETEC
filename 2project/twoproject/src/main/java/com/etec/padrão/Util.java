/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.etec.padrão;

import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class Util {
    /**
 *
 *       Declaração de Atributos 
 */
private String texto;
    
public Util()
{
    System.out.println("Construtor executado..");
    
}



/**
 * 
 *    Metodo:Set's' e Get's  (encapsulamento)
 * 
 */


/** 
 * @return o texto 
 */
public String getTexto()
        {
       return texto;     
        }
/**
 * @param texto the texto to set 
 */
public void setTexto (String texto)
{
    this.texto = texto;
}

/**
 *    metodo:exibir o texto 
 */
public void exibirTexto()
{
    JOptionPane.showMessageDialog(null, "uhuu,seu primeiro programa..." + "\n" + this.getTexto());
}
public void digitarTexto()
{
    this.setTexto(JOptionPane.showInputDialog("digite seu nome:"));
}
}