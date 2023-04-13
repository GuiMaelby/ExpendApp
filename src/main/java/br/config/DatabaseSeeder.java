package br.config;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.fiap.expendapp.models.Conta;
import br.com.fiap.expendapp.repository.ContaRepository;

@Configuration
public class DatabaseSeeder implements CommandLineRunner {

    @Autowired
    ContaRepository contaRepository;

    @Override
    public void run(String... args) throws Exception {
        contaRepository.saveAll(List.of(
            new Conta()
        ));
    }


    
}
