package br.com.livraria.produtos;

import java.beans.AppletInitializer;

@FunctionalInterface
public interface Promocional {
    
    boolean aplicaDescontoDe(double porcentagem);
    // boolean naoSouMaisUmaInterfaceFuncional();

    default boolean aplicaDescontoDe10Porcento() {
        return aplicaDescontoDe(0.1);
    }
}
