package br.com.alura.contador.service;

import com.google.gson.Gson;

public class ConversorJson {

    Gson gson = new Gson();

    public String converteJson(int variavel) {
        String variavelString = String.valueOf(variavel);
        String json = gson.toJson(variavelString);
        return json;
    }
}
