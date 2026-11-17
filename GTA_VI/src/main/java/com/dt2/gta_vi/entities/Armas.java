package com.dt2.gta_vi.entities;

import jakarta.persistence.*;

@Entity
public class Armas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    public String nome;
    public String marca;
    public String modelo;
    public String descricao;
    public String imagem;

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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Armas(String imagem, int id, String nome, String marca, String descricao, String modelo) {
        this.imagem = imagem;
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.descricao = descricao;
        this.modelo = modelo;
    }

    public Armas(String nome, String marca, String descricao, String modelo, String imagem) {
        this.nome = nome;
        this.marca = marca;
        this.descricao = descricao;
        this.modelo = modelo;
        this.imagem = imagem;
    }

    public Armas() {
    }
}
