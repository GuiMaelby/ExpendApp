package br.com.fiap.expendapp.models;

import java.math.BigDecimal;

public class FuturaCompra {
	
	private String produto;
	private BigDecimal valor;
	private String mes;
	private int qtd;
	private String tipopg;

	public FuturaCompra(String produto, BigDecimal valor, String mes, int qtd, String tipopg) {
        this.produto = produto;
        this.valor = valor;
        this.mes = mes;
        this.qtd = qtd;
        this.tipopg = tipopg;
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


	public String getMes() {
		return mes;
	}


	public void setMes(String mes) {
		this.mes = mes;
	}


	public int getQtd() {
		return qtd;
	}


	public void setQtd(int qtd) {
		this.qtd = qtd;
	}


	public String getTipopg() {
		return tipopg;
	}


	public void setTipopg(String tipopg) {
		this.tipopg = tipopg;
	}


	@Override
	public String toString() {
		return "FuturaCompra [produto=" + produto + ", preco=" + valor + ", mes=" + mes + ", qtd=" + qtd + ", tipopg="
				+ tipopg + "]";
	}

}
