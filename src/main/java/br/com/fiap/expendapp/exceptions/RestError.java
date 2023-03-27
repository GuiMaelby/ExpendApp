package br.com.fiap.expendapp.exceptions;

public record RestError (
    int cod,
    String message   
) {}
