package com.poo.introducao;

import java.util.Scanner;

import java.util.ArrayList;

public class Lista04 {


    public void ex1 () {

    /* Voce é gerente de um supermercado e sabe que os valores das
    vendas do dia são gravados em um vetor. Digite um código que faça o
    fechamento (soma) de vendas do dia de maneira automatizada. */

    // Vetor com os valores das vendas do dia
    double[] vendas = {100.50, 200.75, 50.25, 300.60, 150.40};

    // Chamada do método que calcula a soma das vendas
    double totalVendas = calcularTotalVendas(vendas);

    // Exibe o total das vendas
    System.out.println("O total das vendas do dia é: R$ " + totalVendas);
}

/**
 * Método para calcular a soma dos valores de um vetor de vendas.
 * @param vendas Vetor contendo os valores das vendas do dia
 * @return Soma dos valores das vendas
 */
public static double calcularTotalVendas(double[] vendas) {
    double soma = 0;

    // Percorre o vetor somando os valores
    for (double venda : vendas) {
        soma += venda;
    }

    return soma;


    }

    public void ex2 () {


        /* Agora que voce sabe o fechamento do dia, monte um código que
        identifique a compra de menor valor e a compra de maior valor */


        // Vetor com os valores das vendas do dia
        double[] vendas = {100.50, 200.75, 50.25, 300.60, 150.40};

        // Chamada do método que calcula a soma das vendas
        double totalVendas = calcularTotalVendas(vendas);

        // Chamada dos métodos que identificam a menor e a maior compra
        double menorCompra = encontrarMenorCompra(vendas);
        double maiorCompra = encontrarMaiorCompra(vendas);

        // Exibe os resultados
        System.out.println("O total das vendas do dia é: R$ " + totalVendas);
        System.out.println("A menor compra do dia foi: R$ " + menorCompra);
        System.out.println("A maior compra do dia foi: R$ " + maiorCompra);
    }

    /**
     * Método para calcular a soma dos valores de um vetor de vendas.
     * @param vendas Vetor contendo os valores das vendas do dia
     * @return Soma dos valores das vendas
     */
    public static double calcularTotalVenda(double[] vendas) {
        double soma = 0;

        // Percorre o vetor somando os valores
        for (double venda : vendas) {
            soma += venda;
        }

        return soma;
    }

    /**
     * Método para encontrar a menor compra em um vetor de vendas.
     * @param vendas Vetor contendo os valores das vendas do dia
     * @return Menor valor de compra
     */
    public static double encontrarMenorCompra(double[] vendas) {
        double menor = vendas[0];

        // Percorre o vetor comparando os valores
        for (double venda : vendas) {
            if (venda < menor) {
                menor = venda;
            }
        }

        return menor;
    }

    /**
     * Método para encontrar a maior compra em um vetor de vendas.
     * @param vendas Vetor contendo os valores das vendas do dia
     * @return Maior valor de compra
     */
    public static double encontrarMaiorCompra(double[] vendas) {
        double maior = vendas[0];

        // Percorre o vetor comparando os valores
        for (double venda : vendas) {
            if (venda > maior) {
                maior = venda;
            }
        }

        return maior;
    }

    public void ex3 () {
        
        /* Ainda utilizando o exercício do mercado, calcule o ticket médio de
        vendas do dia */

        // Vetor com os valores das vendas do dia
        double[] vendas = {100.50, 200.75, 50.25, 300.60, 150.40};

        // Chamada do método que calcula a soma das vendas
        double totalVendas = calcularTotalVendas(vendas);

        // Chamada dos métodos que identificam a menor e a maior compra
        double menorCompra = encontrarMenorCompra(vendas);
        double maiorCompra = encontrarMaiorCompra(vendas);

        // Chamada do método que calcula o ticket médio
        double ticketMedio = calcularTicketMedio(vendas);

        // Exibe os resultados
        System.out.println("O total das vendas do dia é: R$ " + totalVendas);
        System.out.println("A menor compra do dia foi: R$ " + menorCompra);
        System.out.println("A maior compra do dia foi: R$ " + maiorCompra);
        System.out.println("O ticket médio de vendas do dia é: R$ " + ticketMedio);
    }

    /**
     * Método para calcular a soma dos valores de um vetor de vendas.
     * @param vendas Vetor contendo os valores das vendas do dia
     * @return Soma dos valores das vendas
     */
    public static double calcularTotalVendass(double[] vendas) {
        double soma = 0;

        // Percorre o vetor somando os valores
        for (double venda : vendas) {
            soma += venda;
        }

        return soma;
    }

    /**
     * Método para encontrar a menor compra em um vetor de vendas.
     * @param vendas Vetor contendo os valores das vendas do dia
     * @return Menor valor de compra
     */
    public static double encontrarMenorCompras(double[] vendas) {
        double menor = vendas[0];

        // Percorre o vetor comparando os valores
        for (double venda : vendas) {
            if (venda < menor) {
                menor = venda;
            }
        }

        return menor;
    }

    /**
     * Método para encontrar a maior compra em um vetor de vendas.
     * @param vendas Vetor contendo os valores das vendas do dia
     * @return Maior valor de compra
     */
    public static double encontrarMaiorCompras(double[] vendas) {
        double maior = vendas[0];

        // Percorre o vetor comparando os valores
        for (double venda : vendas) {
            if (venda > maior) {
                maior = venda;
            }
        }

        return maior;
    }

    /**
     * Método para calcular o ticket médio das vendas do dia.
     * @param vendas Vetor contendo os valores das vendas do dia
     * @return Ticket médio das vendas
     */
    public static double calcularTicketMedio(double[] vendas) {
        double totalVendas = calcularTotalVendas(vendas);
        int numeroVendas = vendas.length;

        return totalVendas / numeroVendas;
    }

    public void ex4 () {

        /* Escreva um código que irá percorrer uma lista de números inteiros
        lista[ ] = { 3, 5, 6, 7, 8, 10, 22, 55, 110 } e irá contar a quantidade de
        números pares presente nela. */

        // Vetor com os números inteiros
        int[] lista = {3, 5, 6, 7, 8, 10, 22, 55, 110};

        // Chamada do método que conta a quantidade de números pares
        int quantidadePares = contarNumerosPares(lista);

        // Exibe a quantidade de números pares
        System.out.println("A quantidade de números pares na lista é: " + quantidadePares);
    }

    /**
     * Método para contar a quantidade de números pares em um vetor de inteiros.
     * @param lista Vetor contendo os números inteiros
     * @return Quantidade de números pares
     */
    public static int contarNumerosPares(int[] lista) {
        int contador = 0;

        // Percorre o vetor verificando se o número é par
        for (int numero : lista) {
            if (numero % 2 == 0) {
                contador++;
            }
        }

        return contador;
    }

    public void ex5 () {

        /* Escreva um programa que sirva como uma lista de compras de
        mercado. Você irá criar um menu que pergunte se o usuário quer inserir
        um item ou ver a lista. */

        // Lista de compras
        ArrayList<String> listaDeCompras = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            // Exibe o menu
            System.out.println("Menu:");
            System.out.println("1. Inserir item na lista");
            System.out.println("2. Ver a lista de compras");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    // Inserir item na lista
                    System.out.print("Digite o nome do item: ");
                    String item = scanner.nextLine();
                    listaDeCompras.add(item);
                    System.out.println("Item adicionado com sucesso!");
                    break;
                case 2:
                    // Ver a lista de compras
                    System.out.println("Lista de Compras:");
                    for (int i = 0; i < listaDeCompras.size(); i++) {
                        System.out.println((i + 1) + ". " + listaDeCompras.get(i));
                    }
                    break;
                case 3:
                    // Sair
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            System.out.println();
        } while (opcao != 3);

        scanner.close();
    }


    public void ex6 () {

        /* Aproveite a questão anterior e adiciona a opção do usuário remover
        um item. */

        
            // Lista de compras
            ArrayList<String> listaDeCompras = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            int opcao;
    
            do {
                // Exibe o menu
                System.out.println("Menu:");
                System.out.println("1. Inserir item na lista");
                System.out.println("2. Ver a lista de compras");
                System.out.println("3. Remover item da lista");
                System.out.println("4. Sair");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine(); // Consumir a nova linha
    
                switch (opcao) {
                    case 1:
                        // Inserir item na lista
                        System.out.print("Digite o nome do item: ");
                        String item = scanner.nextLine();
                        listaDeCompras.add(item);
                        System.out.println("Item adicionado com sucesso!");
                        break;
                    case 2:
                        // Ver a lista de compras
                        System.out.println("Lista de Compras:");
                        for (int i = 0; i < listaDeCompras.size(); i++) {
                            System.out.println((i + 1) + ". " + listaDeCompras.get(i));
                        }
                        break;
                    case 3:
                        // Remover item da lista
                        System.out.println("Lista de Compras:");
                        for (int i = 0; i < listaDeCompras.size(); i++) {
                            System.out.println((i + 1) + ". " + listaDeCompras.get(i));
                        }
                        System.out.print("Digite o número do item a ser removido: ");
                        int index = scanner.nextInt();
                        scanner.nextLine(); // Consumir a nova linha
                        if (index > 0 && index <= listaDeCompras.size()) {
                            listaDeCompras.remove(index - 1);
                            System.out.println("Item removido com sucesso!");
                        } else {
                            System.out.println("Número inválido.");
                        }
                        break;
                    case 4:
                        // Sair
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
                System.out.println();
            } while (opcao != 4);
    
            scanner.close();
    }


    public void ex7 () {

        /* Aproveite o código que estamos utilizando e implemente um preço
        para cada item (Dica. Utilizem outra lista e use os mesmos índices para
        o item e para o preço). */

       
            // Lista de compras e preços
            ArrayList<String> listaDeCompras = new ArrayList<>();
            ArrayList<Double> listaDePrecos = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            int opcao;
    
            do {
                // Exibe o menu
                System.out.println("Menu:");
                System.out.println("1. Inserir item na lista");
                System.out.println("2. Ver a lista de compras");
                System.out.println("3. Remover item da lista");
                System.out.println("4. Sair");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine(); // Consumir a nova linha
    
                switch (opcao) {
                    case 1:
                        // Inserir item na lista
                        System.out.print("Digite o nome do item: ");
                        String item = scanner.nextLine();
                        System.out.print("Digite o preço do item: ");
                        double preco = scanner.nextDouble();
                        scanner.nextLine(); // Consumir a nova linha
                        listaDeCompras.add(item);
                        listaDePrecos.add(preco);
                        System.out.println("Item adicionado com sucesso!");
                        break;
                    case 2:
                        // Ver a lista de compras
                        System.out.println("Lista de Compras:");
                        for (int i = 0; i < listaDeCompras.size(); i++) {
                            System.out.println((i + 1) + ". " + listaDeCompras.get(i) + " - R$ " + listaDePrecos.get(i));
                        }
                        break;
                    case 3:
                        // Remover item da lista
                        System.out.println("Lista de Compras:");
                        for (int i = 0; i < listaDeCompras.size(); i++) {
                            System.out.println((i + 1) + ". " + listaDeCompras.get(i) + " - R$ " + listaDePrecos.get(i));
                        }
                        System.out.print("Digite o número do item a ser removido: ");
                        int index = scanner.nextInt();
                        scanner.nextLine(); // Consumir a nova linha
                        if (index > 0 && index <= listaDeCompras.size()) {
                            listaDeCompras.remove(index - 1);
                            listaDePrecos.remove(index - 1);
                            System.out.println("Item removido com sucesso!");
                        } else {
                            System.out.println("Número inválido.");
                        }
                        break;
                    case 4:
                        // Sair
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
                System.out.println();
            } while (opcao != 4);
    
            scanner.close();
    }

    public void ex8 () {

        /* Aproveite os códigos anteriores e implemente a função de impressão
        por ordem de preço (crescente) */

        


    }
    
}
    
    

    


            


