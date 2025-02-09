package br.com.alura.avaliacao.model;

import br.com.alura.avaliacao.services.OfertaComercial;

public class Servico extends OfertaComercial {

    public Servico(String nome, String descricao, double preco, int nota, String comentario) {
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setPreco(preco);
        this.setNota(nota);
        this.setComentario(comentario);
    }
    
    
}

