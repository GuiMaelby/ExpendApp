package br.com.fiap.expendapp.models;

import java.math.BigDecimal;

public class Balanco {
    
    private int qtdeCompraMes;
    private BigDecimal valorMes;
    private BigDecimal limiteMes;
    private BigDecimal economia;
    private String formaPgtoMaisUsado;
    private String mediaGastoMes;
    
    public Balanco(int qtdeCompraMes, BigDecimal valorMes, BigDecimal limiteMes, BigDecimal economia,String formaPgtoMaisUsado, String mediaGastoMes) {
        this.qtdeCompraMes = qtdeCompraMes;
        this.valorMes = valorMes;
        this.limiteMes = limiteMes;
        this.economia = economia;
        this.formaPgtoMaisUsado = formaPgtoMaisUsado;
        this.mediaGastoMes = mediaGastoMes;
    }
        
    public int getQtdeCompraMes() {
        return qtdeCompraMes;
    }
    
    public void setQtdeCompraMes(int qtdeCompraMes) {
        this.qtdeCompraMes = qtdeCompraMes;
    }
    
    public BigDecimal getValorMes() {
        return valorMes;
    }
    
    public void setValorMes(BigDecimal valorMes) {
        this.valorMes = valorMes;
    }
    
    public BigDecimal getLimiteMes() {
        return limiteMes;
    }
    
    public void setLimiteMes(BigDecimal limiteMes) {
        this.limiteMes = limiteMes;
    }
    
    public BigDecimal getEconomia() {
        return economia;
    }
    
    public void setEconomia(BigDecimal economia) {
        this.economia = economia;
    }
    
    public String getFormaPgtoMaisUsado() {
        return formaPgtoMaisUsado;
    }
    
    public void setFormaPgtoMaisUsado(String formaPgtoMaisUsado) {
        this.formaPgtoMaisUsado = formaPgtoMaisUsado;
    }
    
    public String getMediaGastoMes() {
        return mediaGastoMes;
    }
    
    public void setMediaGastoMes(String mediaGastoMes) {
        this.mediaGastoMes = mediaGastoMes;
    }
        
    @Override
    public String toString() {
        return "BalancoDeContas [qtdeCompraMes=" + qtdeCompraMes + ", valorMes=" + valorMes + ", limiteMes=" + limiteMes+ ", economia=" + economia + ", formaPgtoMaisUsado=" + formaPgtoMaisUsado + ", mediaGastoMes="+ mediaGastoMes + "]";
    }
}
