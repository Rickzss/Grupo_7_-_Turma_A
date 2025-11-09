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
                    System.out.println("Instrucoes: \n");
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
                    System.out.println("Opcao Invalida! Escolha uma opcao de 1 a 4: ");

            }

        } while (opcao != 4);

    }

    // ================================= ESCOLHA DO CAMINHO =================================
    public static void jogar(Scanner sc) {

        System.out.println("\nEscolha uma opcao para seguir: \n");
        System.out.println("1 - Logico");
        System.out.println("2 - Criativo\n");
        System.out.print("Escolha uma opcao: ");
        int escolha = sc.nextInt();

        if (escolha == 1) {
            jogarLogico(sc);
        } else if (escolha == 2) {
            System.out.println("\nModo Criativo em desenvolvimento! Volte em breve.\n");
        } else {
            System.out.println("Opcao invalida! Escolha 1 ou 2.\n");
        }
    }

    // =================================== CAMINHO LÓGICO ===================================
    public static void jogarLogico(Scanner sc) {

        System.out.println("==================================================");
        System.out.println("=========== DESAFIO DE LOGICA DO HEROI ===========");
        System.out.println("==================================================");

        int errosTotais = 0;

        // --- Fase 1: Laço while ---
        int errosFase1 = desafioRespiracaoConcentrada(sc);
        if (errosFase1 == -1) {
            System.out.println("\nVoce falhou em manter a respiracao! Retornando ao menu de niveis...\n");
            return;
        }
        errosTotais += errosFase1;

        // --- Fase 2: Laço for ---
        int errosFase2 = desafioBalancoAranha(sc);
        if (errosFase2 == -1) {
            System.out.println("\nVoce caiu durante o balanco! Retornando ao menu de niveis...\n");
            return;
        }
        errosTotais += errosFase2;

        // --- Finalização e RANK ---
        exibirRanking(errosTotais);
    }

    // =================================== DESAFIO 1 =========================================
    public static int desafioRespiracaoConcentrada(Scanner sc) {

        final String respostaCorreta = "A";
        int tentativas = 0;
        int erros = 0;

        System.out.println("\n--- FASE 1: O Desafio da Respiracao Concentrada (Laco while) ---");
        System.out.println("Para ativar sua Concentracao Total, voce precisa prever o resultado:");
        System.out.println("O laco e: 'int turnosFoco = 10;' e 'while (turnosFoco > 0) { turnosFoco = turnosFoco - 2; }'");

        while (tentativas < 3) {
            tentativas++;
            System.out.println("\nPERGUNTA: Quantas vezes a Respiracao Concentrada sera 'Ativada'? (Tentativa " + tentativas + "/3)");
            System.out.println("A) 5 vezes");
            System.out.println("B) 6 vezes");
            System.out.println("C) 4 vezes");
            System.out.println("D) 10 vezes");
            System.out.print("Sua resposta (A, B, C ou D): ");

            String respostaUsuario = sc.next().toUpperCase();

            if (respostaUsuario.equals(respostaCorreta)) {
                System.out.println("CORRETO! O resultado e **5 ativacoes**.");
                return erros;
            } else {
                erros++;
                if (respostaUsuario.matches("[A-D]")) {
                    System.out.println("INCORRETO! O foco nao foi atingido.");
                } else {
                    System.out.println("RESPOSTA INVALIDA! (Contabilizada como tentativa/erro). Digite apenas A, B, C ou D.");
                }
            }
        }

        System.out.println("\nVoce atingiu o limite de tentativas! Falha na Respiracao Concentrada...");
        return -1;
    }

    // =================================== DESAFIO 2 =========================================
    public static int desafioBalancoAranha(Scanner sc) {

        final String respostaCorreta = "C";
        int tentativas = 0;
        int erros = 0;

        System.out.println("\n--- FASE 2: A Sequencia de Balanco do Aranha (Laco for) ---");
        System.out.println("O laco e: 'for (int distancia = 0; distancia <= 25; distancia = distancia + 5)'");

        while (tentativas < 3) {
            tentativas++;
            System.out.println("\nPERGUNTA: Incluindo a teia inicial (distancia 0), quantas teias serao disparadas no TOTAL? (Tentativa " + tentativas + "/3)");
            System.out.println("A) 5 teias");
            System.out.println("B) 7 teias");
            System.out.println("C) 6 teias");
            System.out.println("D) 25 teias");
            System.out.print("Sua resposta (A, B, C ou D): ");

            String respostaUsuario = sc.next().toUpperCase();

            if (respostaUsuario.equals(respostaCorreta)) {
                System.out.println("CORRETO! O total e **6 teias** disparadas.");
                return erros;
            } else {
                erros++;
                if (respostaUsuario.matches("[A-D]")) {
                    System.out.println("INCORRETO! A sequencia do balanco esta errada.");
                } else {
                    System.out.println("RESPOSTA INVALIDA! (Contabilizada como tentativa/erro). Digite apenas A, B, C ou D.");
                }
            }
        }

        System.out.println("\nVoce atingiu o limite de tentativas! O Aranha perdeu o balanco...");
        return -1;
    }

    // =================================== RANKING FINAL =====================================
    public static void exibirRanking(int errosTotais) {

        System.out.println("\n================ RESULTADO FINAL ================");
        System.out.println("Total de erros cometidos: " + errosTotais);

        if (errosTotais == 0) {
            System.out.println("RANK OURO - Voce dominou a logica perfeitamente!");
        } else if (errosTotais == 1) {
            System.out.println("RANK PRATA - Excelente! Apenas um pequeno deslize.");
        } else if (errosTotais == 2) {
            System.out.println("RANK BRONZE - Voce venceu, mas pode treinar mais um pouco!");
        } else {
            System.out.println("SEM RANK - O castelo ainda te venceu desta vez...");
        }

        System.out.println("=================================================\n");
    }
}
