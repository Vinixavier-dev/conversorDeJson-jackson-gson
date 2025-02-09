package br.com.alura.avaliacao.model;

import br.com.alura.avaliacao.services.OfertaComercial;

public class Assinatura extends OfertaComercial {
    
    public Assinatura(String nome, String descricao, double preco, int nota, String comentario) {
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setPreco(preco);
        this.setNota(nota);
        this.setComentario(comentario);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Assinatura{");
        sb.append('}');
        return sb.toString();
    }
}
