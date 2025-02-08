package br.com.alura.contador.tarefas.service;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.alura.contador.tarefas.model.Tarefa;

public class ConversorJacksonParaJson {

    public String obterDados(Tarefa tarefa) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(tarefa);
    }
}
