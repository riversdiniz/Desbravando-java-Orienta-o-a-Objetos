package br.com.livraria;

public class Livro {
    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor;

    void mostrarDetalhes() {
        System.out.println("Mostrando detablhes do livro");
        System.out.println("Nome " + nome);
        System.out.println("Descrição " + descricao);
        System.out.println("Valor " + valor);
        System.out.println("ISBN: " + isbn);
        System.out.println("--");
    }
}
