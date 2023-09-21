package br.com.fiap.expendapp.models;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.hateoas.EntityModel;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import br.com.fiap.expendapp.controllers.ContaController;
import br.com.fiap.expendapp.controllers.ProdutoController;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.domain.Pageable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
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

	public void setConta(Conta conta2) {
	}

	public EntityModel<Produto> toEntityModel() {
		return EntityModel.of(
			this,
            linkTo(methodOn(ProdutoController.class).show(id)).withSelfRel(),
            linkTo(methodOn(ProdutoController.class).destroy(id)).withRel("delete"),
            linkTo(methodOn(ProdutoController.class).index(null, Pageable.unpaged())).withRel("all"),
            linkTo(methodOn(ContaController.class).show(this.getConta().getId())).withRel("conta")
            );
	}



		
}

