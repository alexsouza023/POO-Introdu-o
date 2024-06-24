package com.poo.introducao;

import java.util.Scanner;

public class Lista03 {

    public void ex1 () {

        /*Escreva um programa que sirva como um cronômetro. O usuário deve
        digitar um numero em segundos e o programa deve contabilizar os segundos
        digitados. O programa deve receber somente números entre 1 e 59, do
        contrário ele retornar um erro e solicitar que o usuário digite um número válido. */

        // Cria um objeto Scanner para receber a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        int segundos = 0;

        // Solicita o número de segundos ao usuário
        while (true) {
            System.out.print("Digite um número de segundos entre 1 e 59: ");
            if (scanner.hasNextInt()) {
                segundos = scanner.nextInt();
                if (segundos >= 1 && segundos <= 59) {
                    break;
                } else {
                    System.out.println("Erro: O número deve estar entre 1 e 59.");
                }
            } else {
                System.out.println("Erro: Por favor, digite um número inteiro válido.");
                scanner.next(); // Limpa a entrada inválida
            }
        }

        // Contabiliza os segundos
        for (int i = 1; i <= segundos; i++) {
            System.out.println(i + " segundo(s)");
            try {
                Thread.sleep(1000); // Pausa por 1 segundo
            } catch (InterruptedException e) {
                System.out.println("O cronômetro foi interrompido.");
            }
        }

        System.out.println("Tempo esgotado!");

        // Fecha o objeto Scanner
        scanner.close();

    }

    public void ex2 () {

        /* Desenvolva um programa que receba um número do usuário e escreva a
        tabuada dele. */

        // Cria um objeto Scanner para receber a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Erro: Por favor, digite um número inteiro válido.");
            scanner.next(); // Limpa a entrada inválida
            System.out.print("Digite um número para ver a tabuada: ");
        }
        
        int numero = scanner.nextInt();

        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        // Fecha o objeto Scanner
        scanner.close();

    }

    public void ex3 () {

        /* Escreva um código que receba dois números inteiros e escreva todos os
        números pares entre eles. */

        // Cria um objeto Scanner para receber a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Erro: Por favor, digite um número inteiro válido.");
            scanner.next(); // Limpa a entrada inválida
            System.out.print("Digite o primeiro número inteiro: ");
        }
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Erro: Por favor, digite um número inteiro válido.");
            scanner.next(); // Limpa a entrada inválida
            System.out.print("Digite o segundo número inteiro: ");
        }
        int numero2 = scanner.nextInt();

        // Determina o menor e o maior número
        int menor = Math.min(numero1, numero2);
        int maior = Math.max(numero1, numero2);

        System.out.println("Números pares entre " + menor + " e " + maior + ":");
        for (int i = menor; i <= maior; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // Fecha o objeto Scanner
        scanner.close();
    }

    public void ex4 () {

        /* Jogo da adivinhação. Peça para alguém escolher um número. Depois peça
        para outra pessoa tentar adivinhar. O programa deverá retornar dicas como:
        "Muito baixo, muito alto ou quase lá" ou "tá quente, tá frio". */

        // Cria um objeto Scanner para receber a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Jogador 1 escolhe um número
        System.out.print("Jogador 1, escolha um número (0 a 100): ");
        int numeroEscolhido = scanner.nextInt();

        // Limpa a tela (simulado aqui com várias linhas em branco)
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }

        // Jogador 2 tenta adivinhar
        int tentativa;
        boolean acertou = false;
        
        while (!acertou) {
            System.out.print("Jogador 2, tente adivinhar o número: ");
            tentativa = scanner.nextInt();

            // Fornece dicas
            int diferenca = Math.abs(tentativa - numeroEscolhido);
            if (tentativa == numeroEscolhido) {
                System.out.println("Parabéns! Você acertou!");
                acertou = true;
            } else if (diferenca <= 2) {
                System.out.println("Quase lá!");
            } else if (diferenca <= 5) {
                System.out.println("Tá quente!");
            } else if (diferenca <= 10) {
                System.out.println("Tá morno.");
            } else if (diferenca <= 20) {
                System.out.println("Tá frio.");
            } else {
                System.out.println("Muito frio.");
            }

            if (tentativa < numeroEscolhido && !acertou) {
                System.out.println("Muito baixo.");
            } else if (tentativa > numeroEscolhido && !acertou) {
                System.out.println("Muito alto.");
            }
        }

        // Fecha o objeto Scanner
        scanner.close();
    }

    public void ex5 () {

        /* Crie um algoritmo que receba login e senha e verifique as credenciais. Caso
        algum deles estiver errado o programa deve retornar ao usuário quais das
        opções está errada, se é o login ou a senha. O programa deve bloquear o
        acesso após 3 tentativas erradas. Quando for a última tentativa ele deve emitir
        um alerta: "Última tentativa, mais um erro seu acesso será bloqueado!" */

        // Cria um objeto Scanner para receber a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Credenciais corretas
        String loginCorreto = "usuario";
        String senhaCorreta = "senha123";
        
        int tentativas = 0;
        final int MAX_TENTATIVAS = 3;
        
        while (tentativas < MAX_TENTATIVAS) {
            System.out.print("Digite o login: ");
            String login = scanner.nextLine();
            
            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();
            
            if (login.equals(loginCorreto) && senha.equals(senhaCorreta)) {
                System.out.println("Acesso concedido!");
                return;
            } else {
                tentativas++;
                
                if (!login.equals(loginCorreto)) {
                    System.out.println("Login incorreto.");
                }
                
                if (!senha.equals(senhaCorreta)) {
                    System.out.println("Senha incorreta.");
                }
                
                if (tentativas == MAX_TENTATIVAS - 1) {
                    System.out.println("Última tentativa, mais um erro seu acesso será bloqueado!");
                }
            }
        }
        
        System.out.println("Acesso bloqueado após 3 tentativas erradas.");
        
        
    }

    public void ex6 () {

        /* Escreva um programa que seja capaz de desenhar uma pirâmide de
        asteriscos. O usuário deverá informar quantos andares ele deseja que a
        pirâmide tenha.  */

        // Cria um objeto Scanner para receber a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de andares para a pirâmide: ");
        int andares = scanner.nextInt();

        for (int i = 1; i <= andares; i++) {
            // Imprime espaços antes dos asteriscos
            for (int j = andares - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Imprime asteriscos
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Nova linha após cada andar
            System.out.println();
        }

        scanner.close();
    }

    public void ex7 () {

        /* Aproveitando o exercício anterior, escreva um programa que consiga
        construir um retângulo. O usuário deve informar a largura e a altura em
        asteriscos */

        // Cria um objeto Scanner para receber a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a largura do retângulo: ");
        int largura = scanner.nextInt();

        System.out.print("Digite a altura do retângulo: ");
        int altura = scanner.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
