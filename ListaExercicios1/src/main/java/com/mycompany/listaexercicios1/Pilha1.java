/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaexercicios1;

import javax.swing.JOptionPane;

/**
 *
 * @author deborah
 */
public class Pilha1 {
    //Atributos
    
    int topopilha = -1;
    char[] pilha = new char[500];
    
    //Métodos
    
    int tamanho(){ //Retorna o tamanho atual da pilha
        return(this.topopilha + 1);
    }
    
    int push(int topo, char letra){ //Utilizado para inserir um elemento do topo da pilha.
        this.topopilha = topo;
        this.topopilha++;
        
        if(this.topopilha < 0){
            this.topopilha = 0;
        }
        
        this.pilha[this.topopilha] = letra;
        return (this.topopilha);
    }
    
    char pop(int topo){ //Utilizado para retirar um elemento do topo da pilha.
        this.topopilha = topo;
        this.topopilha--;
        
        if(this.topopilha < -1){
            JOptionPane.showMessageDialog(null,"Pilha vazia! Erro: -997");
            return('9');
        }else{
            return(this.pilha[this.topopilha + 1]);
        }
    }
}
