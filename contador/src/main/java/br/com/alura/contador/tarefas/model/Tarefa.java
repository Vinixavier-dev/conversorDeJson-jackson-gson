package br.com.alura.contador.tarefas.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tarefa {
    @JsonProperty("descricao")
    private String descricao;
    @JsonProperty("concluida")
    private boolean concluida;
    @JsonProperty("pessoaResponsavel")
    private String pessoaResponsavel;

    public Tarefa(boolean concluida, String descricao, String pessoaResponsavel) {
        this.concluida = concluida;
        this.descricao = descricao;
        this.pessoaResponsavel = pessoaResponsavel;
    }

    public Tarefa() {
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public String getPessoaResponsavel() {
        return pessoaResponsavel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tarefa {");
        sb.append("descricao =").append(descricao);
        sb.append(", concluida =").append(concluida);
        sb.append(", pessoaResponsavel =").append(pessoaResponsavel);
        sb.append('}');
        return sb.toString();
    }
}
