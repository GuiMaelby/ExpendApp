package br.com.fiap.expendapp.models;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	private String produto;

	@Min(0)
	private BigDecimal valor;

	@NotNull
	private LocalDate data;

	@NotNull
	private int qtd;
	
	private String tipoPg;

	@ManyToOne
	private Conta conta;

	public void setConta(Produto produto2) {
	}

		
	}

