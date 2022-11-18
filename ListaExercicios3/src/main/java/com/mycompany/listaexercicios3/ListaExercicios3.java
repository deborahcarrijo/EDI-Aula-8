/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.listaexercicios3;

import javax.swing.JOptionPane;

/**
 *
 * @author deborah
 */
public class ListaExercicios3 {

    public static void main(String[] args) {
        //Estanciar classe Fila
        Fila3 Decolagem = new Fila3(); //Fila de decolagem dos aviões
        Fila3 Espera = new Fila3(); //Fila de espera dos aviões
        String autorizacao;
        
        //Declarar variável contador
        int cont = 0;
        
        //Estanciar classe Aviao
        Aviao A = new Aviao(); //Aviões
        
        //Estanciar objetos genericos
        Object obj = new Object(); //Objetos aviões
        
        //Entrada de dados dos aviões
        for(int i = 1; i < 13; i++){
            Aviao entrada = new Aviao(); //Objeto que armazena a entrada de dados
            
            entrada.id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do avião: "));
            entrada.nome = JOptionPane.showInputDialog("Digite o nome do avião: ");
            
            //Inserindo aviões
            System.out.println("Entrando na fila de Decolagem: \n");
            Decolagem.inserir(entrada);
            
            //Imprimir o avião inserido
            Decolagem.imprimir(entrada);
            
            if(i % 2 == 0){
                autorizacao = JOptionPane.showInputDialog("Autorizar a decolagem do primeiro avião?\nResponda com S ou N ");
                
                if(autorizacao.equalsIgnoreCase("S")){ //Autorizar a decolagem do primeiro avião da fila
                    if(Decolagem.fila_vazia()){
                        System.out.println("A fila de decolagem está vazia");
                    }else{
                        //Removendo avião da fila de decolagem
                        obj = Decolagem.remover();
                        A = (Aviao) obj;
                        System.out.println("Avião autorizado a decolar: \n");
                        System.out.println("Avião ID: " + A.id);
                        System.out.println("Nome: " + A.nome);
                        System.out.println("---------------------------------------\n");
                    }
                }else if(autorizacao.equalsIgnoreCase("N")){
                    if(Decolagem.fila_vazia()){
                        System.out.println("A fila de decolagem está vazia");
                    }else{
                        //Removendo avião da fila de decolagem
                        System.out.println("Avião não autorizado a decolar: \n");
                        obj = Decolagem.remover();

                        A = (Aviao) obj;

                        //Adicionar um avião à fila de espera
                        Espera.inserir(A);

                        Espera.imprimir(A);
                        cont++;
                    }
                }else{
                    System.out.println("Autorização inválida!");
                    return;
                }
            }
            //Listar o número de aviões aguardando na fila de decolagem
            System.out.println("O número de aviões aguardando na fila de decolagem é:\n" + Decolagem.tamanho());
            System.out.println("---------------------------------------\n");
        }
        
        System.out.println("Os aviões na fila de espera são: \n");
        for(int j = 0; j < cont; j++){ //Listar todos os aviões na fila de espera
            
            obj = Espera.mostrar(j); //Mostra o objeto na posição j
            A = (Aviao) obj;
 
            Espera.imprimir(A); //Imprime a lista com as características dos aviões na fila de espera
        }
        
        //Listar as características do primeiro avião da fila
        System.out.println("O primeiro avião da fila de espera é:\n"); 
        Espera.imprimir(Espera.mostrar(0));
        
        System.out.println("O primeiro avião da fila de decolagem é:\n");
        Decolagem.imprimir(Decolagem.mostrar(0));
    }
}
