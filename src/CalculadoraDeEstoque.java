public class CalculadoraDeEstoque {
    public static void main(String[] args) {
        //Declaração e atribuição de Variáveis.
        // double livroJava = 59.90;
        // double livroTDD = 59.90;

        //While

        double soma = 0;
        int contador = 0;

        // double soma = livroJava + livroTDD;

        while (contador < 35) {
            double valorDoLivro = 59.90;
            soma = soma + valorDoLivro;
            contador = contador + 1;
        }

        System.out.println("O total em estoque é " + soma);

        if (soma < 150) {
            System.out.println("Seu estoque está muito baixo!");
        } else if(soma >= 2000) {
            System.out.println("Seu estoque está muito alto");
        } else {
            System.out.println("Seu estoque está bom");
        }
    }
}
