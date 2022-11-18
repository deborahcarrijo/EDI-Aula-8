/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.listaexercicios8;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author deborah
 */
public class ListaExercicios8 {

    public static void main(String[] args) {
        Random gerador = new Random(); // gerador de números aleatórios
        int[] numeros = new int[1000]; //Vetor auxiliar para fazer a inversão
        Pilha8 pilhaP = new Pilha8();
        Pilha8 pilhaN = new Pilha8();
        int topo1 = -1, topo2 = -1, num;

        
        for (int i= 0; i < 1000; i++) { //Função para criar um vetor com números aleatórios no intervalo de -100 a 100
            numeros[i] = gerador.nextInt((100 - (-100)) + 1) + (-100);
        }
        System.out.println(Arrays.toString(numeros));
        
        for (int i= 0; i < 1000; i++){
            if(numeros[i] > 0){
                num = numeros[i];
                topo1 = pilhaP.push(topo1, num);
            }else if(numeros[i] < 0){
                num = numeros[i];
                topo2 = pilhaN.push(topo2, num);
            }else{
                pilhaP.pop(topo1);
                topo1--;
                pilhaN.pop(topo2);
                topo2--;
            }
        }
        System.out.println("Números Positivos");
        pilhaP.imprimir(topo1);
        System.out.println("Números Negativos");
        pilhaN.imprimir(topo2);
    }
}
