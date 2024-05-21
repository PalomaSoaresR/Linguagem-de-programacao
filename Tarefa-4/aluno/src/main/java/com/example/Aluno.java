package com.example;

public class Aluno {
    private String nome;
    private int idade;
    private String curso;

    // Construtor que aceita nome, idade e curso
    public Aluno(String nome, int idade, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    // Métodos getters para acessar os atributos privados
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCurso() {
        return curso;
    }
}