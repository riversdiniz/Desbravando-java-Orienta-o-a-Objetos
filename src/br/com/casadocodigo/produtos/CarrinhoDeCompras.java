package br.com.casadocodigo.produtos;

public class CarrinhoDeCompras {

    private double total;
    private Produto[] produtos = new Produto[10];
    private int contador = 0;

    public void adiciona(Produto produto) {
        System.out.println("Adicionando: " + produto);
        this.produtos[contador] = produto;
        contador ++;
        this.total += produto.getValor();
    }

    // public void adiciona(Revista revista) {
    //     System.out.println("Adicionnando: " + revista);
    //     revista.aplicaDescontoDe(0.05);
    //     total += revista.getValor();
    // }

    public double getTotal() {
        return total;
    }
}
