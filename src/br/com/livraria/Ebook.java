package br.com.livraria;

public class Ebook extends Livro {
    
    private String waterMark;

    public Ebook(Autor autor){
        super(autor);
    }

    public void setWaterMark() {
        this.waterMark = waterMark;
    }

    public String getWaterMark() {
        return waterMark;
    }
}
