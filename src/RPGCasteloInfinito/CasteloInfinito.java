package RPGCasteloInfinito;

import java.util.Scanner;

public class CasteloInfinito {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao;

        // ================================= MENU DO JOGO =================================
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
       
        // --- Fase 3: Laçodo-while ---
        int errosFase3 = labirintoCastelo(sc);
        if (errosFase3 == -1) {
            System.out.println("\nVoce ficou preso no castelo! Retornando ao menu de niveis...\n");
            return;
        }
        errosTotais += errosFase3;
       
         // --- Fase 4: Laçodo-while ---
        int errosFase4 = venenoWisteria(sc);
        if (errosFase4 == -1) {
            System.out.println("\n O veneno foi lançado! Retornando ao menu de niveis...\n");
            return;
        }
        errosTotais += errosFase4;
       
        int errosFase5 = Combate1(sc);
        if (errosFase5 == -1) {
            System.out.println("\n  A poeira ainda está descendo AUMENTANDO. \n");
            return;
        }
        errosTotais += errosFase5;
       
        int errosFase6 = combate2(sc);
        if (errosFase6 == -1) {
            System.out.println("\n  A poeira ainda está descendo AUMENTANDO. \n");
            return;
        }        

        errosTotais += errosFase6;

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
                    System.out.println("RESPOSTA INVALIDA! Digite apenas A, B, C ou D.");
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
                    System.out.println("RESPOSTA INVALIDA! Digite apenas A, B, C ou D.");
                }
            }
        }

        System.out.println("\nVoce atingiu o limite de tentativas! O Aranha perdeu o balanco...");
        return -1;
    }
        // =================================== DESAFIO 3 =========================================
         public static int labirintoCastelo(Scanner sc) {
          final String respostaCorreta = "C";
          int tentativas = 0;
          int erros = 0;
         
          System.out.println("\n--- FASE 3: O Labirinto do Castelo Infinito (Laço do-while) ---");
          System.out.println("Nezuko está aprisionada no Castelo Infinito, onde as portas se movem incessantemente.");
          System.out.println("Ela tenta abrir uma porta, mesmo que não tenha a chave. O laço do-while é usado para modelar sua primeira tentativa obrigatória.");
   
          while (tentativas < 3) {
              tentativas++;
            System.out.println("\nPERGUNTA: Se a variável booleana temChave for inicializada como false, o que acontecerá com o código abaixo? (Tentativa" + tentativas + "/3)");
            System.out.println("A) O laço executa infinitamente, travando o jogo.");
            System.out.println("B) A mensagem \"Nezuko tenta abrir a porta.\" não será exibida.");
            System.out.println("C) A mensagem \"Nezuko tenta abrir a porta.\" será exibida apenas uma vez.");
            System.out.println("D) A mensagem \"A porta não abre.\" nunca será exibida.");
            System.out.print("Sua resposta (A, B, C ou D): ");

            String respostaUsuario = sc.next().toUpperCase();

            if (respostaUsuario.equals(respostaCorreta)) {
                System.out.println("Correto! O 'do-while' sempre executa o bloco 'do' pelo menos uma vez antes de checar a condição.\n");
                return erros;
            } else {
                erros++;
                if (respostaUsuario.matches("[A-D]")) {
                    System.out.println("INCORRETO! Tente outra vez.");
                } else {
                    System.out.println("RESPOSTA INVALIDA! Digite apenas A, B, C ou D.");
                }
            }
        }
          System.out.println("\nVoce atingiu o limite de tentativas! A Nezuko ficou presa no castelo...");
        return -1;
         }

         // =================================== DESAFIO 4 =========================================
            public static int venenoWisteria(Scanner sc) {
              final String respostaCorreta = "B";
              int tentativas = 0;
              int erros = 0;
             
             System.out.println("\n--- FASE 4: A Contagem Regressiva do Veneno de Wisteria (Laço for aninhado) ---");
             System.out.println("Para derrotar o Demonio, Kanao precisa aplicar 3 doses de veneno de Wisteria em 4 alvos diferentes.");
             System.out.println("O número total de aplicações será calculado por um laço for aninhado.");
             
              while (tentativas < 3) {
              tentativas++;
            System.out.println("\nPERGUNTA: No código a seguir, que representa o ataque, qual será o último valor exibido para a variável aplicacoes após a execução completa dos laços? (Tentativa" + tentativas + "/3)");
            System.out.println("A) 7");
            System.out.println("B) 12");
            System.out.println("C) 10");
            System.out.println("D) 4");
            System.out.print("Sua resposta (A, B, C ou D): ");

            String respostaUsuario = sc.next().toUpperCase();

            if (respostaUsuario.equals(respostaCorreta)) {
                System.out.println("Correto! O laço externo (4) multiplica as execuções do laço interno (3). 4 * 3 = 12.\n");
                return erros;
            } else {
                erros++;
                if (respostaUsuario.matches("[A-D]")) {
                    System.out.println("INCORRETO! O veneno será lançado a qualquer momento.");
                } else {
                    System.out.println("RESPOSTA INVALIDA! Digite apenas A, B, C ou D.");
                }
            }
        }
           
         
              System.out.println("\n Voce atingiu o limite de tentativas! O veneno de Wisteria foi lançado...");
        return -1;
            }
         
            public static int Combate1(Scanner sc) {
              
       
       
        int tentativas = 0 ;
        int erros = 0;
                System.out.println(" \nFASE5: No corredor do Castelo Infinito, você percebe que o chão inteiro está coberto por fios quase invisíveis.");
                System.out.println("Cada passo desperta um boneco controlado por Hisoka");
                System.out.println(" acertes as perguntas e tente derrotalo ");
       
        while ( tentativas < 3){
            tentativas++;
      String resposta;
       
            System.out.println(" voce tem 3 tentativas ");
        System.out.println(" Qual laço de repetição executa pelo menos UMA! vez antes de testar a condição?");
        System.out.println("a) for");
        System.out.println("b) while");
        System.out.println("c) do-while");
        resposta = sc.next().toUpperCase();
       

        if (resposta.equalsIgnoreCase("c")) {
            System.out.println(" voçê acerta a pergunta e consegue dar mais um passo ");
           
            return erros;
        }  else  {
            erros++;
            if (resposta.matches("[A-C]")) {
                    System.out.println("INCORRETO! voce da um passo errado e surge uns dos bonecos do Hisoka");
                } else {
                    System.out.println("RESPOSTA INVALIDA! Digite apenas A, B, C ou D.");
                }
           
        }
       
        }
         System.out.println("\n Voce atingiu o limite de tentativas! Hisoka despertou muitos bonecos");
        return -1;
            }
           
            public static int combate2(Scanner sc){
               
                String resposta;
                int tentativas = 0;
                int erros = 0;
               
                while (tentativas < 3){
                    tentativas++;
                 System.out.println(" 2Round ");
                    System.out.println(" voce tem 3 tentativas ");
        System.out.println(" Qual laço é ideal quando você sabe exatamente quantas repetições deseja?");
        System.out.println("a) for");
        System.out.println("b) while");
        System.out.println("c) do-while");
        resposta = sc.next().toUpperCase();

        if (resposta.equalsIgnoreCase("a")) {
            System.out.println("voçê acerta a pergunta e consegue dar mais um passo");
           return erros;
        } else {
            erros++;
            if (resposta.matches("[A-C]")) {
                    System.out.println("INCORRETO! voce da um passo errado e surge uns dos bonecos do Hisoka ");
                } else {
                    System.out.println("RESPOSTA INVALIDA! Digite apenas A, B, C ou D.");
                }
         
       

        }
       
       
                }
                System.out.println("\n Voce atingiu o limite de tentativas! Hisoka despertou muitos bonecos");
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