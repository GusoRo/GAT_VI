package com.dt2.gta_vi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.*;


@Entity
public class Personagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String apelido;
    private String categoria;
    private String imagem;
    private String descricao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Personagem(String descricao, String apelido, String nome, String categoria, String imagem, int id) {
        this.descricao = descricao;
        this.apelido = apelido;
        this.nome = nome;
        this.categoria = categoria;
        this.imagem = imagem;
        this.id = id;
    }

    public Personagem(String nome, String apelido, String categoria, String imagem, String descricao) {
        this.nome = nome;
        this.apelido = apelido;
        this.categoria = categoria;
        this.imagem = imagem;
        this.descricao = descricao;
    }

    public Personagem() {
    }
}
