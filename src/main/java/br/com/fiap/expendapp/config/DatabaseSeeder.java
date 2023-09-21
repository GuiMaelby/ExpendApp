package br.com.fiap.expendapp.config;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.fiap.expendapp.models.Conta;
import br.com.fiap.expendapp.models.Produto;
import br.com.fiap.expendapp.repository.ContaRepository;
import br.com.fiap.expendapp.repository.ProdutoRepository;

@Configuration
@Profile("dev")
public class DatabaseSeeder implements CommandLineRunner {

    @Autowired
    ContaRepository contaRepository;

    @Autowired
    ProdutoRepository produtoRepository;

    @Override
    public void run(String... args) throws Exception {
        Conta c1 = new Conta(1L,"Mercado Livre",new BigDecimal(200));
        Conta c2 = new Conta(2L,"Shopee", new BigDecimal(100));
        Conta c3 = new Conta(3L,"Kabum", new BigDecimal(150));
        contaRepository.saveAll(List.of(c1,c2,c3));

        produtoRepository.saveAll(List.of(
            Produto.builder().conta(c1).produto("Fones de ouvido").valor(new BigDecimal(100)).data(LocalDate.now()).qtd(1).tipoPg("Débito").build(),
            Produto.builder().conta(c2).produto("Mouse com LEDs").valor(new BigDecimal(150)).data(LocalDate.now()).qtd(1).tipoPg("Crédito").build(),
            Produto.builder().conta(c3).produto("Tapete").valor(new BigDecimal(80)).data(LocalDate.now()).qtd(1).tipoPg("Crédito").build()

        ));
    }
    
}
