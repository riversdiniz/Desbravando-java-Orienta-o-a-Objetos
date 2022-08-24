package br.com.livraria;

public class CadastroDeLivros {
    public static void main(String[] args) {

        Livro livro = new Livro();

        livro.nome = "Java 8 Prático";
        livro.descricao = "Novos recursos da linguagem";
        livro.valor = 59.90;
        livro.isbn = "978-85-66250-46-6";

        System.out.println(livro.nome);
        System.out.println(livro.descricao);
        System.out.println(livro.valor);
        System.out.println(livro.isbn);

        Livro outroLivro = new Livro();
        outroLivro.nome = "Lógica de Programação";
        outroLivro.descricao = "Crie seus primeiros programas";
        outroLivro.valor = 59.90;
        livro.isbn = "978-85-66250-22-0";

        System.out.println(outroLivro.nome);
        System.out.println(outroLivro.descricao);
        System.out.println(outroLivro.valor);
        System.out.println(outroLivro.isbn);

    }
}
