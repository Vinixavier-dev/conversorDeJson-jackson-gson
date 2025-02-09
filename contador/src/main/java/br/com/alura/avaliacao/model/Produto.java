package br.com.alura.avaliacao.model;

import br.com.alura.avaliacao.services.OfertaComercial;

public class Produto extends OfertaComercial {

    public Produto(String nome, String descricao, double preco, int nota, String comentario) {
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setPreco(preco);
        this.setNota(nota);
        this.setComentario(comentario);
    }
}
