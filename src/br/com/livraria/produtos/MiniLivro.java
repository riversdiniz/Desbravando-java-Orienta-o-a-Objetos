package br.com.livraria.produtos;

public class MiniLivro extends Livro {
    
    public MiniLivro(Autor autor) {
        super(autor);
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        return false;
    }
}
