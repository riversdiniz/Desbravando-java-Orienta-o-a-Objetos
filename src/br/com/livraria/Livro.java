package br.com.livraria;

public class Livro {
    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor;

    public Livro() {
        System.out.println("Novo livro criado");
    }

    void mostrarDetalhes() {
        System.out.println("Mostrando detablhes do livro");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        autor.mostrarDetalhes();
        System.out.println("--");
    }

    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.3) {
            return false;
        }
        this.valor -= this.valor * porcentagem;
        return true;
    }
}
