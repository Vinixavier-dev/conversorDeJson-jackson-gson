package br.com.alura.avaliacao.main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.alura.avaliacao.model.Assinatura;
import br.com.alura.avaliacao.model.Produto;
import br.com.alura.avaliacao.model.Servico;
import br.com.alura.avaliacao.services.Avaliacao;

@SpringBootApplication
public class AvalicaoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AvalicaoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Assinatura netflix = new Assinatura("Netflix", "Assista filmes e séries de qualidade", 37.90, 8, "Muito bom");
        Produto cadeira = new Produto("Cadeira", "cadeira ergonomica", 500, 9, "Muito confortavel");
        Servico internet = new Servico("Instalação de internet - Claro", "Instalação de internet tipo fibra", 40, 7, "Muito agil e organizado!");

        Assinatura avaliacaoNetflix = new Avaliacao().avaliacao(netflix.getNome(), netflix.getNota(), netflix.getComentario(), Assinatura.class);
        System.out.println(avaliacaoNetflix);
    }
}
