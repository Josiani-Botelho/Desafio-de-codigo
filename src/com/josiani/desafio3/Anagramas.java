package com.josiani.desafio3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagramas {

    public int numeroDeAnagramasPossiveis(String palavra){
        int contagem = 0;
        List<String> combinacoes = geraCombinacoes(palavra);
        List<String> novaLista = new ArrayList<>(combinacoes);

        for (String combinacao : combinacoes) {
            novaLista.remove(combinacao);
            for (String item : novaLista) {
                char[] combinacaoChars = combinacao.toCharArray();
                char[] itemChars = item.toCharArray();
                Arrays.sort(combinacaoChars);
                Arrays.sort(itemChars);

                if(Arrays.equals(combinacaoChars,itemChars)){
                    contagem++;
                }
            }
        }
        return contagem;
    }

    private List<String> geraCombinacoes(String palavra){
        List<String> combinacoes = new ArrayList<>();

        for (int i = 0; i < palavra.length(); i++) {
            for (int j = i + 1; j <= palavra.length(); j++) {
                String combinacao = palavra.substring(i,j);
                combinacoes.add(combinacao);
            }
        }

        return combinacoes;
    }
}
