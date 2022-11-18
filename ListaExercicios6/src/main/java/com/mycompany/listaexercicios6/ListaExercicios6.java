/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.listaexercicios6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections; 

/**
 *
 * @author deborah
 */
public class ListaExercicios6 {

    public static void main(String[] args) {
        Random gerador = new Random(); // gerador de números aleatórios
        List<Integer> Numeros = new ArrayList<>(); //Fila de números aleatórios
        Pilha6 pilha = new Pilha6();
        int topo = -1, num;
        
        for (int i= 0; i < 1000; i++) { //Função para criar uma fila com 1000 números aleatórios positivos e 1000 negativos
            Numeros.add(gerador.nextInt((1000 - 1) + 1) + 1); //
            Numeros.add(gerador.nextInt((-1 - (-1000)) + 1) + (-1000));
        }
        Collections.shuffle(Numeros); //Método para embaralhar os números da fila
        System.out.println(Numeros);
        
        for(int i= 0; i < 2000; i++) {
            if(Numeros.get(0) > 0){
                num = Numeros.remove(0);
                System.out.println(num);
                topo = pilha.push(topo, num);
            }else if(Numeros.get(0) < 0){
                System.out.println(Numeros.get(0));
                Numeros.remove(0);
                pilha.top(topo);
                pilha.pop(topo);
                topo--;
            }    
        }
        System.out.println("--------------------------------------------------");
        System.out.println("Pilha final: ");
        pilha.imprimir(topo);
    }
}
