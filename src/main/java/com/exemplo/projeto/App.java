package com.exemplo.projeto;

import java.util.Scanner;

public class App {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Qual é o seu nome? ");
        String nome = sc.nextLine();
        Pessoa p = new Pessoa(nome);
        System.out.println("Bem vindo " + p.getNome());
    }
}

class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}