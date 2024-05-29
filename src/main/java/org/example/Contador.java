package org.example;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int primeiroParametro = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int segundoParametro = terminal.nextInt();

        try {

        } catch () {
        }

    }
    static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        int contagem = segundoParametro - primeiroParametro;
        //realizar o for para imprimir os números com base na variável contagem


    }
}