package br.com.livraria;

public class CarrinhoDeCompras {

    private double total;
    
    public void adiciona(Produto produto) {
        System.out.println("Adicionando: " + produto);
        // produto.aplicaDescontoDe(0.16);
        total += produto.getValor();
    }

    public void adiciona(Revista revista) {
        System.out.println("Adicionnando: " + revista);
        revista.aplicaDescontoDe(0.05);
        total += revista.getValor();
    }

    public double getTotal() {
        return total;
    }
}
