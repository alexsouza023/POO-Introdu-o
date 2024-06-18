package com.poo.introducao;

import java.util.Scanner;

public class Lista02 {

    public void ex1 () {

        /* Escreva um programa que recebe um número digitado pelo usuário e responda
        se o número inserido é par ou ímpar ou 0. */

        // Cria um objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um número
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Determina se o número é par, ímpar ou zero
        if (numero == 0) {
            System.out.println("O número é zero.");
        } else if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        // Fecha o objeto Scanner
        scanner.close();
    }

    public void ex2 () {

        /* Desenvolva um algoritmo que seja capaz de receber dois números digitados
        pelo usuário e diga qual deles é maior. */

        // Cria um objeto Scanner para receber a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite o primeiro número
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        // Solicita ao usuário que digite o segundo número
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        // Compara os dois números e exibe qual é o maior
        if (numero1 > numero2) {
            System.out.println("O primeiro número (" + numero1 + ") é maior.");
        } else if (numero2 > numero1) {
            System.out.println("O segundo número (" + numero2 + ") é maior.");
        } else {
            System.out.println("Os dois números são iguais.");
        }

        // Fecha o objeto Scanner
        scanner.close();



    }
    



}
