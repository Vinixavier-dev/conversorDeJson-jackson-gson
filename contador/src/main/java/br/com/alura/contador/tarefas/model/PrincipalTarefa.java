package br.com.alura.contador.tarefas.model;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.expression.TargetedAccessor;

import br.com.alura.contador.model.ContadorApplication;
import br.com.alura.contador.tarefas.service.ConversorJacksonParaJson;
import br.com.alura.contador.tarefas.service.ConversorJacksonParaObjeto;
import br.com.alura.contador.tarefas.service.Documento;

@SpringBootApplication
public class PrincipalTarefa implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ContadorApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Tarefa tarefa = new Tarefa(true, "codar em java e spring", "vinicius");
        ConversorJacksonParaJson conversorJackson = new ConversorJacksonParaJson();
        ConversorJacksonParaObjeto conversorJacksonParaObjeto = new ConversorJacksonParaObjeto();
        var documento = new Documento();

        String ObjetoParaJson = conversorJackson.obterDados(tarefa);
        documento.documentar(ObjetoParaJson);

        System.out.println("Objeto Java para Json: ");
        System.out.println(ObjetoParaJson);

        conversorJacksonParaObjeto.ConversorJacksonParaObjeto(documento);
        System.out.println("File Json para Objeto Java: ");
        System.out.println();
    }
}
