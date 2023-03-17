package br.com.fiap.expendapp.models;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String produto;
	private BigDecimal valor;
	private LocalDate data;
	private int qtd;
	private String tipoPg;

	protected Produto(){
		
	}

	public Produto(String produto, BigDecimal valor, LocalDate data, int qtd, String tipoPg) {
        this.produto = produto;
        this.valor = valor;
        this.data = data;
        this.qtd = qtd;
        this.tipoPg = tipoPg;
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
		return tipoPg;
	}

	public void setTipopg(String tipopg) {
		this.tipoPg = tipopg;
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
				+ tipoPg + "]";
	}
	
}
