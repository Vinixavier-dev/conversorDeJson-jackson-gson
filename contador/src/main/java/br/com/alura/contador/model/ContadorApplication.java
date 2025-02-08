package br.com.alura.contador.model;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.alura.contador.service.Contador;
import br.com.alura.contador.service.ConversorJson;

@SpringBootApplication
public class ContadorApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ContadorApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Contador contador = new Contador();
        ConversorJson conversorJson = new ConversorJson();
        

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        //int variavel = contador.contagem(numero);
        String json = conversorJson.converteJson(contador.contagem(numero));
        //System.out.println(json);	

    }

}
