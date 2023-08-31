package com.loja;

import java.util.ArrayList;
import java.util.List;

public class TabelasProdutos {
    List<Produto> produtos = new ArrayList<>();

    /**
     * No construtor a lista de produtos
     * séra preenchida
     */
    public TabelasProdutos() {
        Produto caneta = new Produto(1, "Caneta Bic", "Caneta Bic na cor azul", 1.99);
        Produto borracha = new Produto(2,"Borracha Branca", "Borracha branca comum", 3.99);
        Produto lapis = new Produto(3, "Lápis Faber Castel", "Lápis da Faber Castel comum", 2.99);
        Produto apontador = new Produto(4, "Apontador", "Apontador comum com reservatório", 7.99);
        Produto caderno = new Produto(5, "Caderno espiral", "Caderno espiral de 96 folhas", 15.99);
        this.produtos.add(caneta);
        this.produtos.add(apontador);
        this.produtos.add(caderno);
        this.produtos.add(lapis);
        this.produtos.add(borracha);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    /**
     * Métoso que retorna todos os produtos da lista
     * @return
     */
    public List<Produto> buscarTodosOsProdutos(){
        return this.getProdutos();
    }
}
