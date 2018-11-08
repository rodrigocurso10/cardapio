package com.morr.tiago.cardapio;

public class Produto {

    private String nome;
    private int imagem; // vai armazenar o identificador do recurso
    private String preco;
    public Produto(String nome, String preco, int imagem) {
        this.nome = nome;
        this.preco = preco;
        this.imagem = imagem;
    }
// métodos getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
}

