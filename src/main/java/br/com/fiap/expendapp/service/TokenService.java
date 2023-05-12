package br.com.fiap.expendapp.service;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;

import br.com.fiap.expendapp.models.Credencial;
import br.com.fiap.expendapp.models.Token;
import br.com.fiap.expendapp.models.Usuario;
import br.com.fiap.expendapp.repository.UsuarioRepository;

@Service
public class TokenService {

    @Autowired
    UsuarioRepository usuarioRepository;


    public Token generateToken(Credencial credencial) {
        Algorithm alg =  Algorithm.HMAC256("meusecret");
        var jwt = JWT.create()
                    .withSubject(credencial.email())
                    .withIssuer("ExpendApp")
                    .withExpiresAt(Instant.now().plus(20,ChronoUnit.MINUTES))
                    .sign(alg)
                    ;
        return new Token(jwt, "JWT", "Bearer");

    }

    public Usuario validate(String token) {
        Algorithm alg = Algorithm.HMAC256("meusecret");
        var email =  JWT.require(alg)
                .withIssuer("ExpendApp")
                .build()
                .verify(token)
                .getSubject();

        return usuarioRepository.findByEmail(email).orElseThrow(
            () -> new JWTVerificationException("usuario nao encontrado"));

    }
 
}
