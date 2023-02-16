package com.eteczl.padrao;

public class Matriz {
    
    void exibirMatriz(String[][] _matTexto){
        
            System.out.println("Matriz = ");
            
            for(int linha = 0; linha < _matTexto.length; linha++){
                
                for(int coluna = 0; coluna < _matTexto[linha].length; coluna++){
                    
                    System.out.println(_matTexto[linha][coluna]);
                
                }
                
            }
        
    }
    
}
