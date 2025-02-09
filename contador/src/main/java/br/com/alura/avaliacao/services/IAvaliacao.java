package br.com.alura.avaliacao.services;

public interface IAvaliacao {
    public <T> T avaliacao(String nome, int nota, String comentario, Class<T> classe);
}
