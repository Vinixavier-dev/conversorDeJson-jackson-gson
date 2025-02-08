package br.com.alura.contador.tarefas.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Documento {

    public void documentar(String ObjetoParaJson) throws IOException {
        File file = new File("tarefa.json");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(ObjetoParaJson);
        fileWriter.close();
    }

}
