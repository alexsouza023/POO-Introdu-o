package com.poo.introducao;

import java.util.Scanner;

public class Lista01 {

    public void ex1(){

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
 
        // Calcula a média aritmética das notas
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
 
        // Exibe a média aritmética
        System.out.printf("A média aritmética das notas é: %.2f\n", media);
 
        // Fecha o scanner
        scanner.close();
    }

    public void ex8(){

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
