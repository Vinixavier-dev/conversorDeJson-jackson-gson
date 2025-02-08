package br.com.alura.contador.tarefas.service;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.alura.contador.tarefas.model.Tarefa;

public class ConversorJacksonParaObjeto {

    public Tarefa ConversorJacksonParaObjeto(File arquivo) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            return mapper.readValue(arquivo, Tarefa.class);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
}
