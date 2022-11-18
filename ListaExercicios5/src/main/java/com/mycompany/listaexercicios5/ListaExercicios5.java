/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.listaexercicios5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author deborah
 */
public class ListaExercicios5 {

    public static void main(String[] args) {
        Random gerador = new Random(); // gerador de números aleatórios
        List<Integer> F = new ArrayList<>(); //Fila de números distintos
        Pilha5 P = new Pilha5(); //Pilha para inserir os números repetidos
        int topo = -1, num;
        
        F.add(gerador.nextInt(1001));
        
        for(int i = 0; i < 999; i++){
            num = gerador.nextInt(1001);
            System.out.println(num);
            
            if(F.contains(num) == false){
                F.add(num);
                System.out.println("Inserindo na fila o número: " + num);
            }else{
                topo = P.push(topo, num);
            } 
        }
        System.out.println(F);
        System.out.println("--------------------------------------------------");
        P.imprimir(topo);
    }
}
