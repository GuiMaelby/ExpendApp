package br.com.fiap.expendapp.models;

import java.math.BigDecimal;

public class Limite {
    
    private BigDecimal valorLimite;
    
    public Limite(BigDecimal valorLimite) {
        this.valorLimite = valorLimite;
    }
    
    public BigDecimal getValorLimite() {
        return valorLimite;
    }
    
    public void setValorLimite(BigDecimal valorLimite) {
        this.valorLimite = valorLimite;
    }
    
    @Override
    public String toString() {return "LimiteMensal [valorLimite=" + valorLimite + "]";
    }
}