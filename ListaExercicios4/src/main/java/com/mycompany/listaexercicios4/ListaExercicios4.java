/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.listaexercicios4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author deborah
 */
public class ListaExercicios4 {

    public static void main(String[] args) {
        Random gerador = new Random(); // gerador de número aleatório
        List<Integer> Numeros = new ArrayList<>(); //Fila de números aleatórios
        List<Integer> Inverter = new ArrayList<>(); //Fila invertida
        int[] num = new int[100]; //Vetor auxiliar para fazer a inversão
        int valor;
        
        for(int i = 0; i < 100; i++){
            Numeros.add(gerador.nextInt(1001));
        }
        System.out.println(Numeros);
        
        for (int i= 0; i < 100; i++) {
            valor = Numeros.remove(0);
            num[i] = valor;
        }
        
        for (int i = 99; i >= 0; i--){
            Inverter.add(num[i]);
        }
        System.out.println(Inverter);
    }
}
