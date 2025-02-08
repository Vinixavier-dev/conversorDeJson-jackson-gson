package br.com.alura.contador.tarefas.service;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConversorJacksonParaObjeto {

    public JsonNode ConversorJacksonParaObjeto(File file) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            return mapper.readTree(file);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
}
