package br.com.casadocodigo.testes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GerenciadorDeCupons {
    
    private Set<String> cupons;

    public GerenciadorDeCupons() {
        this.cupons = new HashSet<String>();

        cupons.addAll(Arrays.asList(" CUP 74 ", " CUP 158 ", 
        " CUP 14 ", " CUP 52 ", " CUP 21 ", " CUP 221 ", " CUP 91 ", 
        " CUP 327 ", " CUP 410 ", " CUP 275 ", " CUP 484 ", " CUP 207 "));
    }

    public boolean validaCupom(String cupom) {
        return this.cupons.contains(cupom);
    }
}
