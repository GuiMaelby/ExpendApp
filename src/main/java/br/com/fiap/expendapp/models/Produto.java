package br.com.fiap.expendapp.models;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Produto {

	private Long id;
	private String produto;
	private BigDecimal valor;
	private LocalDate data;
	private int qtd;
	private String tipopg;

	public Produto(String produto, BigDecimal valor, LocalDate data, int qtd, String tipopg) {
        this.produto = produto;
        this.valor = valor;
        this.data = data;
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

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + produto + ", valor=" + valor + ", data=" + data + ", qtd=" + qtd + ", tipopg="
				+ tipopg + "]";
	}
	
}
