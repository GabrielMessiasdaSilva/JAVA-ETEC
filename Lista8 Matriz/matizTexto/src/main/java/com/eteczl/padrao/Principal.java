package com.eteczl.padrao;

    
    public class Principal{
        
    public static String matTexto [][] = {{"Joao"} , {"Maria"} , {"Pedro"} , {"Paula"} , {"Ana"}};
        
    public static Matriz matriz = new Matriz();
        
    public static void main(String args[]){
        
        matriz.exibirMatriz(matTexto);
        
    }
    
}
