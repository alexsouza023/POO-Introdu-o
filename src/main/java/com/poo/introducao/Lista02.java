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

    public void ex3 () {

        /* Um banco contratou você para que escreva um programa que será utilizado
        pelo usuário em um tablet. O programa irá fazer 3 perguntas e encaminhar o
        cliente para 2 filas. A fila comum e a fila preferencial. Se o cliente atender a uma
        das condições a seguir ele deve ser encaminhado para a fila preferencial. As
        condições são: Ter mais de 65 anos, se deficiente ou gestante. */

        Scanner scanner = new Scanner(System.in);

        // Perguntar a idade
        System.out.print("Por favor, insira sua idade: ");
        int idade = scanner.nextInt();


        // Se for idoso, encaminhar para a fila preferencial e encerrar
        if (idade > 65) {
            System.out.println("Você será encaminhado(a) para a fila preferencial.");
            scanner.close();
            return;
        }

        // Perguntar se é deficiente
        System.out.print("Você é deficiente? (sim/não): ");
        String respostaDeficiente = scanner.next();

        // Se for deficiente, encaminhar para a fila preferencial e encerrar
        if (respostaDeficiente.equalsIgnoreCase("sim")) {
            System.out.println("Você será encaminhado(a) para a fila preferencial.");
            scanner.close();
            return;
        }

        // Perguntar se é gestante
        System.out.print("Você é gestante? (sim/não): ");
        String respostaGestante = scanner.next();

        // Se for gestante, encaminhar para a fila preferencial e encerrar
        if (respostaGestante.equalsIgnoreCase("sim")) {
            System.out.println("Você será encaminhado(a) para a fila preferencial.");
            scanner.close();
            return;
        }

        // Se não atender a nenhuma das condições, encaminhar para a fila comum
        System.out.println("Você será encaminhado(a) para a fila comum.");
        
        
        // Fechar Scarnner
        scanner.close();

        }
    



}
