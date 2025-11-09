/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RPGCasteloInfinito;

import java.util.Scanner;

/**
 *
 * @author henrique.gespindola
 */
public class CasteloInfinito {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao;

        // ================================= MENU DO JGO =================================
        do {

            System.out.println("==========================");
            System.out.println("==== Castelo Infinito ====");
            System.out.println("==========================\n");
            System.out.println("(1) Instrucoes");
            System.out.println("(2) Jogar");
            System.out.println("(3) Creditos");
            System.out.println("(4) Sair\n");

            System.out.println("Escolha uma opcao: ");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("\n Instrucoes: \n");
                    System.out.println("Voce esta preso no Castelo Infinito, um lugar onde o codigo ganha vida!");
                    System.out.println("Escolha seu caminho: Criativo (Demon Slayer) ou Logico (Spider-Man).");
                    System.out.println("Responda corretamente as perguntas sobre lacos de repeticao para avancar.");
                    System.out.println("Ganhe ranks de acordo com sua performance e desbloqueie salas bonus!\n");

                    break;
                case 2:
                    jogar(sc); //===== Puxa para outra tela ======
                    break;
                case 3:
                    System.out.println("Desenvolvido pelo GRUPO 7 Turma A pelos alunos: \n"
                            + "\nEduardo Alcantara; "
                            + "\nFlavio Batista; "
                            + "\nHenrique Espindola; "
                            + "\nLeonardo Bacelar; "
                            + "\nGiovani Teles;"
                            + "\n");

                    break;
                case 4:
                    System.out.println("Saindo do jogo, ate mais!");
                    break;
                default:
                    System.out.println("Opcao Invalida! Escolha uma opcao de 1 a 5: ");

            }

        } while (opcao != 4);

    }

    // ================================= ESCOLHA DO NÍVEL =================================
    public static void jogar(Scanner sc) {

        System.out.println("\nEscolha uma opcao para seguir \n");
        System.out.println("Opcao 1: Logico");
        System.out.println("Opcao 2: Criativo\n");
        System.out.println("Escolha uma opcao: ");
        int escolha = sc.nextInt();

        if (escolha == 1) {
            jogarLogico(sc);
        } else if (escolha == 2) {
            //jogarCriativo(sc);
        } else {
            System.out.println("Opcao invalida! Escolha uma opcao de 1 a 2:");
        }
    }

    // =================================== CAMINHO LÓGICO ===================================
    /*
     * Desafio 1 (Laço while).
     * O usuário só avança se responder a pergunta corretamente (Alternativa A).
     */
    public static void jogarLogico(Scanner sc) {

        System.out.println("==================================================");
        System.out.println("========== DESAFIO DE LÓGICA DO HERÓI ==========");
        System.out.println("==================================================");

        // --- Fase 1: Laço while ---
        System.out.println("\n--- FASE 1: O Desafio da Respiração Concentrada (Laço while) ---");
        desafioRespiracaoConcentrada(sc);

        // --- Fase 2: Laço for ---
        System.out.println("\n--- FASE 2: A Sequência de Balanço do Aranha (Laço for) ---");
        desafioBalancoAranha(sc);

        System.out.println("\nPARABÉNS! Você completou o Quiz de Lógica do Herói!");
    }

    // =================================== DESAFIO 1 =========================================
    public static void desafioRespiracaoConcentrada(Scanner sc) {

        String respostaCorreta = "A";
        int tentativas = 0;
        boolean faseConcluida = false;

        System.out.println("Para ativar sua Concentração Total, você precisa prever o resultado:");
        System.out.println("O laço é: 'int turnosFoco = 10;' e 'while (turnosFoco > 0) { turnosFoco = turnosFoco - 2; }'");

        while (!faseConcluida) {
            tentativas++;
            System.out.println("\nPERGUNTA: Quantas vezes a Respiração Concentrada será 'Ativada'? (Tentativa " + tentativas + ")");
            System.out.println("A) 5 vezes"); // Resposta correta
            System.out.println("B) 6 vezes");
            System.out.println("C) 4 vezes");
            System.out.println("D) 10 vezes");
            System.out.print("Sua resposta (A, B, C ou D): ");

            String respostaUsuario = sc.next().toUpperCase();

            if (respostaUsuario.equals(respostaCorreta)) {
                System.out.println("CORRETO! O resultado é **5 ativações**.");
                faseConcluida = true;
            } else if (respostaUsuario.matches("[A-D]")) {
                System.out.println("INCORRETO! O foco não foi atingido. Tente novamente.");
            } else {
                System.out.println("Resposta inválida! Por favor, digite apenas A, B, C ou D.");
            }
        }
    }

    // =================================== DESAFIO 2 =========================================
    public static void desafioBalancoAranha(Scanner sc) {

        String respostaCorreta = "C";
        int tentativas = 0;
        boolean faseConcluida = false;

        System.out.println("Você está balançando para alcançar a distância total.");
        System.out.println("O laço 'for' é: 'for (int distancia = 0; distancia <= 25; distancia = distancia + 5)'");

        while (!faseConcluida) {
            tentativas++;
            System.out.println("\nPERGUNTA: Incluindo a teia inicial (distância 0), quantas teias serão disparadas no TOTAL? (Tentativa " + tentativas + ")");
            System.out.println("A) 5 teias");
            System.out.println("B) 7 teias");
            System.out.println("C) 6 teias"); // Resposta correta
            System.out.println("D) 25 teias");
            System.out.print("Sua resposta (A, B, C ou D): ");

            String respostaUsuario = sc.next().toUpperCase();

            if (respostaUsuario.equals(respostaCorreta)) {
                System.out.println("CORRETO! O total é **6 teias** disparadas.");
                faseConcluida = true;
            } else if (respostaUsuario.matches("[A-D]")) {
                System.out.println("INCORRETO! A sequência do balanço está errada. Tente novamente.");
            } else {
                System.out.println("Resposta inválida! Por favor, digite apenas A, B, C ou D.");
            }
        }
    }
}
