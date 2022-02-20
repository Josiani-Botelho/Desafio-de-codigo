package com.josiani.desafio3;

import java.util.Scanner;

/*
 * Duas palavras podem ser consideradas anagramas de si mesmas
 * se as letras de uma palavra podem ser realocadas para formar a outra palavra.
 * Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares de substrings
 * que são anagramas.
 */
public class Main {
    public static void main(String[] args) {
        Anagramas anagramas = new Anagramas();
        String entrada = requisitaEntrada();

        int numeroAnagramas = anagramas.numeroDeAnagramasPossiveis(entrada);

        //imprime o Resultado
        System.out.println("O numero de anagramas possíveis das substrings de "+ entrada+ " é: " + numeroAnagramas);
    }

    //requisita entrada do usuario.
    public static String requisitaEntrada(){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira uma palavra: ");
        return leitor.next();
    }
}
