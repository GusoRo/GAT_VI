package com.dt2.gta_vi.entities;

import jakarta.persistence.*;

@Entity
public class Armas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String categoria;
    private String fabricante;
    private String descricao;
    private String imagem;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public Armas(String nome, String categoria, String fabricante, String descricao, String imagem) {
        this.nome = nome;
        this.categoria = categoria;
        this.fabricante = fabricante;
        this.descricao = descricao;
        this.imagem = imagem;
    }

    public Armas() {
    }
}
