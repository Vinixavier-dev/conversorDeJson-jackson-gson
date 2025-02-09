package br.com.alura.avaliacao.services;

public class Avaliacao implements IAvaliacao {

    @Override
    public <T> T avaliacao(String nome, int nota, String comentario, Class<T> classe) {
        System.out.println(nome + " avaliado com " + nota + " estrelas!");
        System.out.println("Comentário do " + nome + " feito com sucesso! - " + comentario);
        return null;
    }

}
