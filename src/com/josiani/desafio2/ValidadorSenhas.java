package com.josiani.desafio2;

import java.util.regex.Pattern;

public class ValidadorSenhas {

    private final int QUANTIDADE_LETRAS = 6;
    private static final Pattern REGRAS = Pattern.compile("(?=.*[!@#$%^&*()-+])(?=.*[a-zA-Z])(?=.*[0-9]).{6,}");

    //Verifica se a senha é válida conforme o REGEX REGRAS
    public boolean valida(String senha){
        return REGRAS.matcher(senha).matches();
    }

    //retorna a quantidade de digitos que faltam na senha
    public int verificaLetrasFaltantes(String senha){
        return senha.length() > QUANTIDADE_LETRAS? 0 : QUANTIDADE_LETRAS - senha.length();
    }

}
