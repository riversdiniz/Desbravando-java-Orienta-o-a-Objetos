package br.com.casadocodigo.testes;

import java.util.*;

public class GerenciadorDeCupons {
    
    private Map<String, Double> cupons;

    public GerenciadorDeCupons() {
        this.cupons = new HashMap<>();

        cupons.put("CUPOM10", 10.0);
        cupons.put("CUPOM20", 20.0);
        cupons.put("CUPOM30", 30.0);
        cupons.put("CUPOM40", 40.0);
        cupons.put("CUPOM50", 50.0);
        cupons.put("CUPOM60", 60.0);
    }

    public boolean validaCupom(String cupom) {
        return this.cupons.containsKey(cupom);
    }
}
