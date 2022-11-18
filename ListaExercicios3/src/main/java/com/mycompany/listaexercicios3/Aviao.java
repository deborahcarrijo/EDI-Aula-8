/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaexercicios3;

/**
 *
 * @author deborah
 */
public class Aviao {
    //Definição dos atributos
    int id;
    String nome;
    
    //Os métodos GET e SET são técnicas padronizadas para gerenciamento sobre o acesso dos atributos.
    //
    public int getId() { //Get: usado para acessar atributos da classe
        return id;
    }

    public void setId(int id) { //Set: usado para alterar, modificar os valores de um atributo da classe 
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
