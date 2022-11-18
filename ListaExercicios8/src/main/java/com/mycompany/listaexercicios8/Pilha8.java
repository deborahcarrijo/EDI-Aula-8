/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaexercicios8;

import javax.swing.JOptionPane;

/**
 *
 * @author deborah
 */
public class Pilha8 {
    /*atributos*/
    int[] pilha = new int[1000]; //estrutura da pilha
    int topopilha = -1; //indicar o topo da pilha
    
    /*metodos*/
    void imprimir(int topo){ //Imprime a pilha
        for(int i=topo; i >= 0; i--){
            System.out.println(this.pilha[i]);
        }
    }
    
    int push(int topo, int num){ //insere elementos na pilha
        this.topopilha = topo;
        this.topopilha++;
        
        if(this.topopilha < 0){
            this.topopilha = 0;
        }
        
        if(this.topopilha > 999){
            JOptionPane.showMessageDialog(null,"Estouro de pilha, Erro: -999");
            return(this.topopilha--);
        }else{
            this.pilha[this.topopilha] = num;
            return(this.topopilha);
        }
    }    
    
    int pop(int topo){ //retirar elementos da pilha
        this.topopilha = topo;
        this.topopilha--;
        
        if(this.topopilha <- 1){
           JOptionPane.showMessageDialog(null,"Pilha vazia!!! Erro..: -997");
           return(-997);
        }else{
            System.out.println("Retirando o valor: " + this.pilha[this.topopilha + 1]);
            return(this.pilha[this.topopilha+1]);
        }     
    }
}
