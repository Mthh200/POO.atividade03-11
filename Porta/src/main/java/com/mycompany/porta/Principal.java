package com.mycompany.porta;
import modelo.Porta;

public class Principal {

    public static void main(String[] args) {
        
        Porta p1 = new Porta(1.20, 5);
        
        p1.abrir();
        p1.fechar();
        
        p1.pintar("Vermelho");
        p1.pintar("Verde");
        p1.pintar("Marrom");
        
        p1.altura = 2;
        p1.comprimento = 0.7;
        
        System.out.println(p1.estaAberta());
    }
    
}
