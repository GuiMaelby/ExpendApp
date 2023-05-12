package br.com.fiap.expendapp.models;

public record Token(
    String token,
    String type,
    String prefix
) {}
