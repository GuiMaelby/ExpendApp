package br.com.fiap.expendapp.models;

public class Configuracoes {
    
    private boolean notificacoes;
    private boolean novidadesemail;
    private boolean tema;
    
    public Configuracoes(boolean notificacoes, boolean novidadesemail, boolean tema) {
        this.notificacoes = notificacoes;
        this.novidadesemail = novidadesemail;
        this.tema = tema;
    }
    
    public boolean getNotificacoes() {
        return notificacoes;
    }
    
    public void setNotificacoes(boolean notificacoes) {
        this.notificacoes = notificacoes;
    }
    
    public boolean getNovidadesemail() {
        return novidadesemail;
    }
    
    public void setNovidadesemail(boolean novidadesemail) {
        this.novidadesemail = novidadesemail;
    }
    
    public boolean getTema() {
        return tema;
    }
    
    public void setTema(boolean tema) {
        this.tema = tema;
    }
    
    @Override
    public String toString() {
        return "ConfigGerais [notificacoes=" + notificacoes + ", novidadesemail=" + novidadesemail + ", tema=" + tema+ "]";
    }
    
}