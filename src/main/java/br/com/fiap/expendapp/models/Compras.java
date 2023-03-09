package br.com.fiap.expendapp.models;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Compras {
    
    private String produto;
    private BigDecimal valor;
    private LocalDate data;
    private String mes;
    private int qtde;
    private String tipoPag;
    
    public Compras(String produto, BigDecimal valor, LocalDate data, String mes, int qtde, String tipoPag) {
        this.produto = produto;
        this.valor = valor;
        this.data = data;
        this.mes = mes;
        this.qtde = qtde;
        this.tipoPag = tipoPag;
    }
    
    public String getProduto() {
        return produto;
    }
    
    public void setProduto(String produto) {
        this.produto = produto;
    }
    
    public BigDecimal getValor() {
        return valor;
    }
    
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    
    public LocalDate getData() {
        return data;
    }
    
    public void setData(LocalDate data) {
        this.data = data;
    }
    
    public String getMes() {
        return mes;
    }
    
    public void setMes(String mes) {
        this.mes = mes;
    }
    
    public int getQtde() {
        return qtde;
    }
    
    public void setQtde(int qtde) {
        this.qtde = qtde;
    }
    
    public String getTipoPag() {
        return tipoPag;
    }
    
    public void setTipoPag(String tipoPag) {
        this.tipoPag = tipoPag;
    }
    
    @Override
    public String toString() {
        return "ExibirCompras [produto=" + produto + ", valor=" + valor + ", data=" + data + ", mes=" + mes + ", qtde="+ qtde + ", tipoPag=" + tipoPag + "]";
    }

}
