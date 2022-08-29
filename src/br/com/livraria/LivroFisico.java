package br.com.livraria;

public class LivroFisico extends Livro {
    
    public LivroFisico(Autor autor) {
        super(autor);
    }

    public double getTaxaImpressao() {
        return this.getTaxaImpressao() * 0.05;
    }
}
