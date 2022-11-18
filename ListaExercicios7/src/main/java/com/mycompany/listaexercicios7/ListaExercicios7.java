/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.listaexercicios7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author deborah
 */
public class ListaExercicios7 {

    public static void main(String[] args) {
        Random gerador = new Random(); // gerador de número aleatório
        List<Integer> Numeros = new ArrayList<>(); //Fila de números aleatórios
        Pilha7 pilha = new Pilha7(); //Pilha auxiliar para fazer a inversão
        int topo = -1, num;
        
        for(int i = 0; i < 20; i++){
            Numeros.add(gerador.nextInt(100));
        }
        System.out.println(Numeros);
        
        for (int i= 0; i < 20; i++) {
            num = Numeros.remove(0);
            topo = pilha.push(topo, num);
        }
        System.out.println("-----------------------------------------------------");
        pilha.imprimir(topo);
        
        for (int i= 0; i < 20; i++) {
            Numeros.add(pilha.pop(topo));
            topo--;
        }
        System.out.println("----------------------------------------------");
        System.out.println(Numeros);
    }
}
