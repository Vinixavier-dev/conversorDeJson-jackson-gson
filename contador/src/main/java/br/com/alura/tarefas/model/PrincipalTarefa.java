package br.com.alura.tarefas.model;

import java.io.File;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.alura.contador.tarefas.model.Tarefa;
import br.com.alura.contador.tarefas.service.ConversorJacksonParaJson;
import br.com.alura.contador.tarefas.service.ConversorJacksonParaObjeto;

@SpringBootApplication
public class PrincipalTarefa implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(PrincipalTarefa.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Tarefa tarefa = new Tarefa(true, "codar em java e spring", "vinicius");

        ConversorJacksonParaJson conversorJackson = new ConversorJacksonParaJson();
        ConversorJacksonParaObjeto conversorJacksonParaObjeto = new ConversorJacksonParaObjeto();
        
        var documento = new br.com.alura.contador.tarefas.service.Documento();
        File arquivo = new File("tarefa.json");

        String ObjetoParaJson = conversorJackson.obterDados(tarefa);
        documento.documentar(ObjetoParaJson);

        System.out.println("Objeto Java para Json: ");
        System.out.println(ObjetoParaJson);

        System.out.println("File Json para Objeto Java: ");
        tarefa = conversorJacksonParaObjeto.ConversorJacksonParaObjeto(arquivo);
        System.out.println(tarefa);

    }
}
