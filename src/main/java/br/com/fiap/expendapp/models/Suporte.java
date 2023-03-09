package br.com.fiap.expendapp.models;

public class Suporte {
    private String numWhatsapp;

    public Suporte(String numWhatsapp) {
        this.numWhatsapp = numWhatsapp;
    }

    public String getNumWhatsapp() {
        return numWhatsapp;
    }
    
    public void setNumWhatsapp(String numWhatsapp) {this.numWhatsapp = numWhatsapp;}
    
    @Override 
    public String toString() {
        return "Suporte [numWhatsapp=" + numWhatsapp + "]";
    }

}