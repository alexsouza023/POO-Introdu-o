package com.poo.introducao;

import java.util.Scanner;

public class Lista01 {

    public void ex1(){

        // Escreva um programa que faça a soma entre 2 números.


        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pergunta o primeiro número
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        // Pergunta o segundo número
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        // Calcula a soma dos dois números
        double soma = numero1 + numero2;

        // Exibe a soma
        System.out.println("A soma de " + numero1 + " e " + numero2 + " é: " + soma);

        // Fecha o scanner
        scanner.close();
        
    }
     
    public void ex2(){ 

        /*Escreva um programa que pergunte o nome e o
        sobrenome do usuário e escreva na tela: "Olá, -usuário-". */


        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pergunta o nome do usuário
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // Pergunta o sobrenome do usuário
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        // Exibe a saudação
        System.out.println("Olá, " + nome + " " + sobrenome + "!");

        // Fecha o scanner
        scanner.close();
    }

    public void ex3(){

        /* Escreva uma calculadora que receba um valor em reais e
        converta para dólar. Considere o valor do dólar a R$5,25.*/

        // Define a taxa de câmbio
        final double TAXA_CAMBIO = 5.25;

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pergunta o valor em reais
        System.out.print("Digite o valor em reais (R$): ");
        double valorReais = scanner.nextDouble();

        // Converte o valor para dólares
        double valorDolares = valorReais / TAXA_CAMBIO;

        // Exibe o valor convertido
        System.out.printf("O valor em dólares é: $%.2f\n", valorDolares);

        // Fecha o scanner
        scanner.close();
    }

    public void ex4(){

        /* Construa um algoritmo que leia um número inteiro na tela e
        responda o número antecessor e o sucessor.*/

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pergunta o número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Calcula o antecessor e o sucessor
        int antecessor = numero - 1;
        int sucessor = numero + 1;

        // Exibe o antecessor e o sucessor
        System.out.println("O antecessor de " + numero + " é: " + antecessor);
        System.out.println("O sucessor de " + numero + " é: " + sucessor);

        // Fecha o scanner
        scanner.close();
    }

    public void ex5(){

        /* Construa um algoritmo que calcule o valor de um terreno
        baseado na sua área e valor por m2. */

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pergunta a área do terreno em metros quadrados
        System.out.print("Digite a área do terreno em metros quadrados (m²): ");
        double area = scanner.nextDouble();

        // Pergunta o valor por metro quadrado
        System.out.print("Digite o valor por metro quadrado (R$): ");
        double valorPorMetroQuadrado = scanner.nextDouble();

        // Calcula o valor total do terreno
        double valorTotal = area * valorPorMetroQuadrado;

        // Exibe o valor total do terreno
        System.out.printf("O valor total do terreno é: R$%.2f\n", valorTotal);

        // Fecha o scanner
        scanner.close();
    }

    public void ex6(){

        /*  Construa um algoritmo que leia 1- a distância percorrida
        por um veículo em km 2- o total gasto em combustível em
        litros. No final deverá ser respondido o consumo médio deste
        veículo em km/l. */

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pergunta a distância percorrida pelo veículo em quilômetros
        System.out.print("Digite a distância percorrida pelo veículo em quilômetros (km): ");
        double distancia = scanner.nextDouble();
 
        // Pergunta o total gasto em combustível em litros
        System.out.print("Digite o total gasto em combustível em litros (L): ");
        double combustivelGasto = scanner.nextDouble();
 
        // Calcula o consumo médio do veículo em km/l
        double consumoMedio = distancia / combustivelGasto;
 
        // Exibe o consumo médio
        System.out.printf("O consumo médio do veículo é: %.2f km/l\n", consumoMedio);
 
        // Fecha o scanner
        scanner.close();
    }

    public void ex7(){

        /* Escreva um programa que receba quatro notas de um
        aluno e calcule a média aritmética dessas notas. */

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pergunta as quatro notas do aluno
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
 
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
 
        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
 
        System.out.print("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();
 
        // Calcula a média das notas
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
 
        // Exibe a média 
        System.out.printf("A média aritmética das notas é: %.2f\n", media);
 
        // Fecha o scanner
        scanner.close();
    }

    public void ex8(){

        /*  Suponha que voce trabalhe em um laboratório e seu
        colega mediu a temperatura de um objeto em Fahrenheit.
        Escreva um programa capaz de converter em Celsius.import java */

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pergunta a temperatura em Fahrenheit
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double temperaturaFahrenheit = scanner.nextDouble();

        // Converte a temperatura para Celsius
        double temperaturaCelsius = (temperaturaFahrenheit - 32) * 5 / 9;

        // Exibe a temperatura em Celsius 
        System.out.printf("A temperatura em Celsius é: %.2f°C\n", temperaturaCelsius);

        // Fecha o scanner
        scanner.close(); 
    }


}
