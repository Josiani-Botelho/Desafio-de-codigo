package com.josiani.desafio2;

import java.util.Scanner;

/*
*construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser adicionados
*para uma string qualquer ser considerada segura.
*satisfaz os seguintes critérios:
Possui no mínimo 6 caracteres.
Contém no mínimo 1 digito.
Contém no mínimo 1 letra em minúsculo.
Contém no mínimo 1 letra em maiúsculo.
Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+
* */
public class Main {
    public static void main(String[] args) {
        ValidadorSenhas validador = new ValidadorSenhas();

        String entrada = requisitaEntrada();

        boolean estaValido = validador.valida(entrada);
        if(estaValido){
            System.out.println("Senha Válida");
        }else{
            System.out.println("Senha Inválida");
        }

        System.out.println("Quantidade de digitos faltantes: "+validador.verificaLetrasFaltantes(entrada));

    }

    //requisita entrada do usuario
    private static String requisitaEntrada(){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite uma senha para validar: ");
        return leitor.next();
    }
}
