package com.josiani.desafio1;

import java.util.Scanner;

/*
 * Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços.
 * A base e altura da escada devem ser iguais ao valor de n.
 * A última linha não deve conter nenhum espaço.
 */
public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        ImpressorEscada impressor = new ImpressorEscada();

        //requisita entrada do console
        System.out.print("digite a quantidade de degraus: ");
        int entrada = leitor.nextInt();

        impressor.imprimir(entrada);


    }
}
