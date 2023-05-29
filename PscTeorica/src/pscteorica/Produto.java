/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pscteorica;

/**
 *
 * @author Gigi
 */
public class Produto {

    private int id;
    private String nome;
    private double preco;

    /**
     * Inicializa um produto vazio
     */
    public Produto() {
        id = -1;
        nome = "";
        preco = 0.0;
    }

    /**
     * Inicializa um novo produto
     * @param id um int representando a chave primária
     * @param nome uma String representando o nome
     */
    public Produto(int id, String nome) {
        this.id = id;
        this.nome = nome;
        preco = 0.0;
    }

    /**
     * Inicializa um novo produto
     * @param id um int representando a chave primária
     * @param nome uma String representando o nome
     * @param preco um double representando o preço
     */
    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

}