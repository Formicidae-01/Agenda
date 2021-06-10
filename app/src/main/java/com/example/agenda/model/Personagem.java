package com.example.agenda.model;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Personagem implements Serializable {

    //Classe de personagens

    //Dados do personagem, nome altura e nascimento
    private String nome;
    private String altura;
    private String nascimento;
    //Índice do personagem
    int id = 0;

    //Método construtor do personagem
    public Personagem(String nome, String altura, String nascimento)
    {
        this.nome = nome;
        this.altura = altura;
        this.nascimento = nascimento;
    }

    //Método construtor vazio do personagem, gerará um personagem vazio
    public Personagem()
    {}

    //Encapsulamento do nome, obtendo e definindo o nome do personagem
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Encapsulamento da altura do personagem
    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    //Encapsulamento da data de nascimento do personagem
    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    //Cria um override para o método ToString, que retorna somente o nome do personagem
    @NonNull
    @Override
    public String toString()
    {
        return nome;
    }

    //Encapsulamento do índice do personagem
    public void setId(int id)
    {
        this.id = id;
    }

    public int getId()
    {return id;}

    //Método que  verifica se o índice do personagem é válido, retorna um valor booleano
    public boolean IdValido()
    { return id > 0;}

}
