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

        // Cria um objeto Scanner para receber a entrada do usuário
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

    public void ex4 () {

        /* Um cliente que promove eventos e solicitou um programa que seja capaz de
        identificar se uma pessoa é maior de idade. Pessoas com menos de 16 anos não
        podem entrar nos eventos. Entre 16 e 18 anos somente acompanhado pelos
        responsáveis. Maiores de 18 podem entrar normalmente. */


        // Cria um objeto Scanner para receber a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar a idade do usuário
        System.out.print("Por favor, insira a sua idade: ");
        int idade = scanner.nextInt();

        // Verificar as condições de entrada
        if (idade < 16) {
            System.out.println("Você não pode entrar no evento.");
        } else if (idade >= 16 && idade < 18) {
            System.out.println("Você pode entrar no evento, mas precisa estar acompanhado pelos responsáveis.");
        } else if (idade >= 18) {
            System.out.println("Você pode entrar no evento.");
        } else {
            System.out.println("Idade inválida.");
        }

        // Fechar Scarnner
        scanner.close();
    }

    public void ex5 () {

        /* Crie um algoritmo que receba login e senha e verifique as credenciais. Caso
        algum deles estiver errado o programa deve retornar ao usuário quais das opções
        está errada, se é o login ou a senha. */

        // Cria um objeto Scanner para receber a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Credenciais válidas
        String loginValido = "admin";
        String senhaValida = "12345";

        // Solicitar login e senha do usuário
        System.out.print("Insira seu login: ");
        String login = scanner.nextLine();

        System.out.print("Insira sua senha: ");
        String senha = scanner.nextLine();

        // Verificar as credenciais
        boolean loginCorreto = login.equals(loginValido);
        boolean senhaCorreta = senha.equals(senhaValida);

        if (loginCorreto && senhaCorreta) {
            System.out.println("Login bem-sucedido!");
        } else {
            if (!loginCorreto) {
                System.out.println("Login incorreto.");
            }
            if (!senhaCorreta) {
                System.out.println("Senha incorreta.");
            }
        }

        // Fechar Scarnner
        scanner.close();
    }
    
    public void ex6 () {

        /* Crie um programa que receba as notas de um aluno e informe se ele foi
        aprovado ou reprovado. Se o aluno ficar com média acima de 6 nas 2 primeiras
        provas ele passou. Senão o programa deverá perguntar a nota de recuperação
        que irá substituir a menor nota. A pergunta de recuperação deverá aparecer
        somente para os alunos que precisarem. */

        // Cria um objeto Scanner para receber a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar as notas das duas primeiras provas
        System.out.print("Insira a nota da primeira prova: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Insira a nota da segunda prova: ");
        double nota2 = scanner.nextDouble();

        // Calcular a média das duas primeiras provas
        double media = (nota1 + nota2) / 2;

        if (media >= 6) {
            // Se a média é maior ou igual a 6, o aluno está aprovado
            System.out.println("Parabéns! Você foi aprovado com média " + media);
        } else {
            // Se a média é menor que 6, solicitar a nota de recuperação
            System.out.print("Insira a nota de recuperação: ");
            double notaRecuperacao = scanner.nextDouble();

            // Substituir a menor nota pela nota de recuperação
            if (nota1 < nota2) {
                nota1 = notaRecuperacao;
            } else {
                nota2 = notaRecuperacao;
            }

            // Recalcular a média com a nota de recuperação
            media = (nota1 + nota2) / 2;

            // Verificar se o aluno foi aprovado ou reprovado após a recuperação
            if (media >= 6) {
                System.out.println("Parabéns! Você foi aprovado com média " + media + " após a recuperação.");
            } else {
                System.out.println("Infelizmente, você foi reprovado com média " + media + " após a recuperação.");
            }
        }

        // Fechar Scarnner
        scanner.close();
    }

    public void ex7 () {

        /* Escreva um programa Identificador de Divisibilidade, isto é, que identifique se
        um determinado número informado pelo usuário é divisível por X (Que também
        deve ser informado pelo usuário) */

        // Cria um objeto Scanner para receber a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar o número a ser verificado
        System.out.print("Insira o número a ser verificado: ");
        int numero = scanner.nextInt();

        // Solicitar o divisor
        System.out.print("Insira o divisor: ");
        int divisor = scanner.nextInt();

        // Verificar se o número é divisível pelo divisor
        if (divisor == 0) {
            System.out.println("Erro: divisor não pode ser zero.");
        } else if (numero % divisor == 0) {
            System.out.println("O número " + numero + " é divisível por " + divisor + ".");
        } else {
            System.out.println("O número " + numero + " não é divisível por " + divisor + ".");
        }

        // Fechar Scarnner
        scanner.close();
    }
    
    public void ex8 () {

        /* Crie um joguinho de perguntas e respostas múltipla escolha. O programa
        deverá fazer 5 perguntas (Uma por vez). Se ele errar 3 vezes ele perde o jogo. Se
        o usuário chegar até o final o programa deve exibir o número de acertos. */

        // Cria um objeto Scanner para receber a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Definir perguntas, opções e respostas corretas
        String[] perguntas = {
            "Qual é a capital da França?",
            "Qual é o maior planeta do sistema solar?",
            "Quem escreveu 'Dom Quixote'?",
            "Qual é o elemento químico representado pelo símbolo O?",
            "Em que ano o homem pisou na Lua pela primeira vez?"
        };

        String[][] opcoes = {
            {"1. Berlim", "2. Madrid", "3. Paris", "4. Roma"},
            {"1. Terra", "2. Júpiter", "3. Marte", "4. Saturno"},
            {"1. William Shakespeare", "2. Miguel de Cervantes", "3. Machado de Assis", "4. Jane Austen"},
            {"1. Ouro", "2. Oxigênio", "3. Ósmio", "4. Hidrogênio"},
            {"1. 1965", "2. 1969", "3. 1971", "4. 1973"}
        };

        int[] respostasCorretas = {3, 2, 2, 2, 2}; // índices das respostas corretas
        
        int acertos = 0;
        int erros = 0;
        
        
        /* A estrutura de controle de fluxo "for" é utilizada em java para repetir um bloco de código um número específico de vezes. Com isso, ele é extremamente útil quando o número de iterações é conhecido.
        SINTAXE

        A sintaxe básica de um loop "for" em java é a seguinte:

        for (inicialização; condição; atualização) {
        // Bloco de código a ser repetido
        }

        Inicialização: uma expressão que é executada apenas uma vez antes do início do loop. É utilizada para inicializar variáveis de controle do loop.
        Condição: uma expressão booleana que é avaliada antes de cada iteração do loop. Com isso, se a condição for verdadeira, o bloco de código dentro do loop é executado; senão, o loop é encerrado.
        Atualização: uma expressão que é executada após cada iteração do loop. É utilizada para atualizar as variáveis de controle do loop for. */

        // Loop para fazer as perguntas

        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i]);
            for (String opcao : opcoes[i]) {
                System.out.println(opcao);
            }
            System.out.print("Escolha a opção correta (1-4): ");
            int resposta = scanner.nextInt();
            
            if (resposta == respostasCorretas[i]) {
                acertos++;
                System.out.println("Resposta correta!");
            } else {
                erros++;
                System.out.println("Resposta errada!");
            }
            
            if (erros == 3) {
                System.out.println("Você errou 3 vezes. Fim de jogo!");
                break;
            }
            
            System.out.println();
        }
        
        // Exibir o número de acertos
        System.out.println("Você acertou " + acertos + " perguntas.");
        
        // Fechar Scarnner
        scanner.close();
    }

}
