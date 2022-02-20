package com.josiani.desafio1;

public class ImpressorEscada {
    private String linha = "";

    //faz o loop imprimindo as linhas conforme a quantidade de degraus.
    public void imprimir(int degraus) {
        for (int i = 0; i < degraus; i++) {
            linha = linha.concat("*");
            System.out.printf("%" + degraus + "s%n", linha);
        }
    }
}
