/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.listaexercicios2;

import javax.swing.JOptionPane;

/**
 *
 * @author deborah
 */
public class ListaExercicios2 {

    public static void main(String[] args) {
        int topo = -1, topo2 = -1, num, chave;
        String entrada, entrada2;
        Pilha2 pilha1 = new Pilha2();
        Pilha2 pilha2 = new Pilha2();
        
        for(int i = 0; i < 10; i++){
            entrada = JOptionPane.showInputDialog("Entre com um número: ");
            num = Integer.parseInt(entrada);
            topo = pilha1.push(topo, num);
        }
        pilha1.imprimir(topo);
        
        entrada2 = JOptionPane.showInputDialog("Entre com a chave");
        chave = Integer.parseInt(entrada2);
        
        for(int i = 0; i < 10; i++){
            if(topo != chave){
                topo2 = pilha2.push(topo2, pilha1.pop(topo));
                topo--;
            }else{
                pilha1.pop(topo);
                topo--;
            }
        }
        
        while(pilha2.tamanho()!= 0){
            topo = pilha1.push(topo, pilha2.pop(topo2));
            topo2--;
        }
        System.out.println("----------------------------------------------");
        pilha1.imprimir(topo);
    }
}
