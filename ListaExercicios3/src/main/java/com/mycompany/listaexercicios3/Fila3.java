/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaexercicios3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author deborah
 */
public class Fila3 {
    
    //Criar Fila
    List<Aviao> obj = new ArrayList<>();
    
    //Procedimento para inserir um aviao na fila
    void inserir(Aviao aviao){
        this.obj.add(aviao);
    }
    
    //Função para remover um aviao da fila
    Aviao remover(){
        return this.obj.remove(0);
    }
    
    //Função para esvaziar a fila
    boolean fila_vazia(){
        return(this.obj.isEmpty());
    }
    
    //Função para mostrar um aviao em determinada posição
    Object mostrar(int i){
        return this.obj.get(i);
    }
    
    //Procedimento para imprimir os dados do aviao
    void imprimir(Object obj){
        if (obj instanceof Aviao){
            System.out.println("Avião ID: " + ((Aviao) obj).id);
            System.out.println("Nome: " + ((Aviao) obj).nome);
            System.out.println("---------------------------------------\n");
        }
    }
    
    int tamanho(){ // retorna a quantidade de elementos presentes na fila
        return(this.obj.size()); 
    }
}
