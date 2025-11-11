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
            jogarCriativo(sc);
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
            jogar(sc);
            return;
        }
        errosTotais += errosFase1;

        // --- Fase 2: Laço for ---
        int errosFase2 = desafioBalancoAranha(sc);
        if (errosFase2 == -1) {
            System.out.println("\nVoce caiu durante o balanco! Retornando ao menu de niveis...\n");
            jogar(sc);
            return;
        }
        errosTotais += errosFase2;

        // --- Fase 3: Laçodo-while ---
        int errosFase3 = labirintoCastelo(sc);
        if (errosFase3 == -1) {
            System.out.println("\nVoce ficou preso no castelo! Retornando ao menu de niveis...\n");
            jogar(sc);
            return;
        }
        errosTotais += errosFase3;

        // --- Fase 4: Laçodo-while ---
        int errosFase4 = venenoWisteria(sc);
        if (errosFase4 == -1) {
            System.out.println("\n O veneno foi lançado! Retornando ao menu de niveis...\n");
            jogar(sc);
            return;
        }
        errosTotais += errosFase4;

        int errosFase5 = Combate1(sc);
        if (errosFase5 == -1) {
            System.out.println("\n  A poeira ainda esta descendo AUMENTANDO. \n");
            jogar(sc);
            return;
        }
        errosTotais += errosFase5;

        int errosFase6 = combate2(sc);
        if (errosFase6 == -1) {
            System.out.println("\n  A poeira ainda está descendo AUMENTANDO. \n");
            jogar(sc);
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

        System.out.println("\n--- FASE 3: O Labirinto do Castelo Infinito (Laco do-while) ---");
        System.out.println("Nezuko esta aprisionada no Castelo Infinito, onde as portas se movem incessantemente.");
        System.out.println("Ela tenta abrir uma porta, mesmo que nao tenha a chave. O laco do-while e usado para modelar sua primeira tentativa obrigatoria.");

        while (tentativas < 3) {
            tentativas++;
            System.out.println("\nPERGUNTA: Se a variavel booleana temChave for inicializada como false, o que acontecera com o codigo abaixo? (Tentativa" + tentativas + "/3)");
            System.out.println("A) O laco executa infinitamente, travando o jogo.");
            System.out.println("B) A mensagem \"Nezuko tenta abrir a porta.\" nao sera exibida.");
            System.out.println("C) A mensagem \"Nezuko tenta abrir a porta.\" sera exibida apenas uma vez.");
            System.out.println("D) A mensagem \"A porta nao abre.\" nunca sera exibida.");
            System.out.print("Sua resposta (A, B, C ou D): ");

            String respostaUsuario = sc.next().toUpperCase();

            if (respostaUsuario.equals(respostaCorreta)) {
                System.out.println("Correto! O 'do-while' sempre executa o bloco 'do' pelo menos uma vez antes de checar a condicao.\n");
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

        System.out.println("\n--- FASE 4: A Contagem Regressiva do Veneno de Wisteria (Laco for aninhado) ---");
        System.out.println("Para derrotar o Demonio, Kanao precisa aplicar 3 doses de veneno de Wisteria em 4 alvos diferentes.");
        System.out.println("O numero total de aplicacoes sera calculado por um laco for aninhado.");

        while (tentativas < 3) {
            tentativas++;
            System.out.println("\nPERGUNTA: No codigo a seguir, que representa o ataque, qual sera o ultimo valor exibido para a variavel aplicacoes apos a execucao completa dos lacos? (Tentativa" + tentativas + "/3)");
            System.out.println("A) 7");
            System.out.println("B) 12");
            System.out.println("C) 10");
            System.out.println("D) 4");
            System.out.print("Sua resposta (A, B, C ou D): ");

            String respostaUsuario = sc.next().toUpperCase();

            if (respostaUsuario.equals(respostaCorreta)) {
                System.out.println("Correto! O laco externo (4) multiplica as execucoes do laco interno (3). 4 * 3 = 12.\n");
                return erros;
            } else {
                erros++;
                if (respostaUsuario.matches("[A-D]")) {
                    System.out.println("INCORRETO! O veneno sera lancado a qualquer momento.");
                } else {
                    System.out.println("RESPOSTA INVALIDA! Digite apenas A, B, C ou D.");
                }
            }
        }

        System.out.println("\n Voce atingiu o limite de tentativas! O veneno de Wisteria foi lançado...");
        return -1;
    }
 // =================================== DESAFIO 5 =========================================
    public static int Combate1(Scanner sc) {

        int tentativas = 0;
        int erros = 0;
        System.out.println(" \nFASE5: No corredor do Castelo Infinito, voce percebe que o chao inteiro esta coberto por fios quase invisiveis.");
        System.out.println("Cada passo desperta um boneco controlado por Hisoka");
        System.out.println(" acertes as perguntas e tente derrotalo ");

        while (tentativas < 3) {
            tentativas++;
            String resposta;

            System.out.println(" voce tem 3 tentativas ");
            System.out.println(" Qual laco de repeticao executa pelo menos UMA! vez antes de testar a condicao?");
            System.out.println("a) for");
            System.out.println("b) while");
            System.out.println("c) do-while");
            resposta = sc.next().toUpperCase();

            if (resposta.equalsIgnoreCase("c")) {
                System.out.println(" Voce acerta a pergunta e consegue dar mais um passo ");

                return erros;
            } else {
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
 // =================================== DESAFIO 6 =========================================
    public static int combate2(Scanner sc) {

        String resposta;
        int tentativas = 0;
        int erros = 0;

        while (tentativas < 3) {
            tentativas++;
            System.out.println(" 2Round ");
            System.out.println(" voce tem 3 tentativas ");
            System.out.println(" Qual laco e ideal quando voce sabe exatamente quantas repeticoes deseja?");
            System.out.println("a) for");
            System.out.println("b) while");
            System.out.println("c) do-while");
            resposta = sc.next().toUpperCase();

            if (resposta.equalsIgnoreCase("a")) {
                System.out.println("Voce acerta a pergunta e consegue dar mais um passo");
                return erros;
            } else {
                erros++;
                if (resposta.matches("[A-C]")) {
                    System.out.println("INCORRETO! Voce da um passo errado e surge uns dos bonecos do Hisoka ");
                } else {
                    System.out.println("RESPOSTA INVALIDA! Digite apenas A, B, C ou D.");
                }

            }

        }
        System.out.println("\n Voce atingiu o limite de tentativas! Hisoka despertou muitos bonecos");
        return -1;
    }

    // =================================== CAMINHO CRIATIVO ===================================
    public static void jogarCriativo(Scanner sc) {

        System.out.println("========================================================");
        System.out.println("========== DESAFIO DE CRIATIVIDADE DO CACADOR ==========");
        System.out.println("========================================================");

        int errosTotais = 0;

            // --- Fase 1: Laço while ---
            int errosFase1 = desafioTeiaRepetitiva(sc);
            if (errosFase1 == -1) {
            System.out.println("Voce falhou no sentido aranha! Retornando ao menu de niveis...\n");
            jogar(sc);
            return;
        }
             errosTotais += errosFase1;

            //--- Fase 2: Laço for ---
            int errosFase2 = desafioContagemRespiracao(sc);{
            if (errosFase2 == -1) {
                System.out.println("Voce errou na contagem dos ataques! Retornando ao menu de niveis...\n");
                jogar(sc);
                return;
            }
            errosTotais += errosFase2;

            // --- Fase 3: Laço do-while ---
            int errosFase3 = desafioResgateVitimias(sc);
            if (errosFase3 == -1) {
                System.out.println("Voce falhou no resgate das vitimas! Retornando ao menu de niveis...\n");
                jogar(sc);
                return;
            }
            errosTotais += errosFase3;

            // --- Fase 4: Laço While ---
            int errosFase4 = desafioBalancoSpiderMan(sc);
            if (errosFase4 == -1) {
            System.out.println("Voce falhou no lancamento das teias! Retornando ao menu de niveis...\n");
            jogar(sc);
            return;
            }
            errosTotais += errosFase4;
            
            // --- Fase 5: Laco For ---
            int errosFase5 = desafioFormaDeRespiracao(sc);
            if (errosFase5 == -1) {
             System.out.println("Voce falhou na concentracao da respiracao! Retornando ao menu de niveis...\n");
            jogar(sc);
             return;
             }
            errosTotais += errosFase5;
            
            // --- Fase 6: Laco do-while ---
            //int errosFase6 = desafioProvaCasteloInfinito(sc);
            // if (errosFase6 == -1) {
            //  System.out.println("Voce caiu no ciclo do Castelo Infinito! Retornando ao menu de niveis...\n");
            //jogar(sc);
            //return;
            // }
            //errosTotais += errosFase6;
            System.out.println("\nPARABENS! Voce completou o Quiz de Criatividade do Cacador!\n");

            //--- Finalização e RANK ---
            exibirRanking(errosTotais);
        }
    }
    // =================================== DESAFIO 1 ===================================

    public static int desafioTeiaRepetitiva(Scanner sc) {

        final String respostaCorreta = "C";
        int tentativas = 0;
        int nivelPerigo = 5;
        int erros = 0;

        System.out.println("\n--- FASE 1: A Teia Repetitiva do Sentido-Aranha (Laco while) ---");
        System.out.println("Cenario: Seu Sentido-Aranha vibra com Nivel de Perigo em " + nivelPerigo + ".");
        System.out.println("O laco deve continuar ENQUANTO houver perigo.");

        System.out.println("\n--- Demonstracao da Acao (o laco se repete 5 vezes): ---\n");

        while (tentativas < 3) {
            tentativas++;
            System.out.println("[Sentido-Aranha] Alerta! Perigo atual: 5 ");
            System.out.println("[Sentido-Aranha] Alerta! Perigo atual: 4 ");
            System.out.println("[Sentido-Aranha] Alerta! Perigo atual: 3 ");
            System.out.println("[Sentido-Aranha] Alerta! Perigo atual: 2 ");
            System.out.println("[Sentido-Aranha] Alerta! Perigo atual: 1 ");

            System.out.println("[Sentido-Aranha] Perigo neutralizado.");
            System.out.println("---------------------------------------------------------\n");

            System.out.println("Pergunta: Qual codigo representa a CONDICAO correta para o laco while? (Tentativa " + tentativas + " /3)\n");
            System.out.println("A) while (true)");
            System.out.println("B) while (vilao.estaVivo())");
            System.out.println("C) while (nivelPerigo > 0)"); // Resposta correta
            System.out.println("D) while (contagem <= 10)\n");
            System.out.println("Sua resposta (A, B, C ou D):\n ");

            String respostaUsuario = sc.next().toUpperCase();

            if (respostaUsuario.equals(respostaCorreta)) {
                System.out.println("\nCORRETO! O perigo foi neutralizado");
                return erros;
            } else {
                erros++;
                if (respostaUsuario.matches("[A-D]")) {
                    System.out.println("INCORRETO! O perigo nao foi neutralizado. Tente novamente.\n");
                } else {
                    System.out.println("Resposta invalida! Por favor, digite apenas A, B, C ou D.\n");
                }
            }
        }
        System.out.println("\n Voce atingiu o limite de tentativas! Falha no Sentido-Aranha...\n");
        return -1;
    }

    // =================================== DESAFIO 2 ===================================
    public static int desafioContagemRespiracao(Scanner sc) {

        final String respostaCorreta = "C";
        int tentativas = 0;
        int erros = 0;

        while (tentativas < 3) {
            tentativas++;
            System.out.println("\n--- FASE 2: A Contagem das Formas de Respiracao (Laco for) ---");
            System.out.println("A Contagem das Formas de Respiracao (Laco FOR)");
            System.out.println("Cenario: Voce precisa usar as 10 Formas da Respiracao da Agua, da 1 a 10.");

            System.out.println("\nPergunta: Qual linha de codigo Java representa a INICIALIZACAO e a ITERACAO corretas (1 a 10)? (Tentativa " + tentativas + " /3)\n");
            System.out.println("A) int forma = 10; forma >= 1; forma--");
            System.out.println("B) int forma = 0; forma < 10; forma++");
            System.out.println("C) int forma = 1; forma <= 10; forma++"); // Resposta correta
            System.out.println("D) int forma = 1; forma <= 10; forma += 2\n");
            System.out.println("Sua resposta (A, B, C ou D):\n");

            String respostaUsuario = sc.next().toUpperCase();

            if (respostaUsuario.equals(respostaCorreta)) {
                System.out.println("\nCORRETO! Executando os ataques: \n");
                System.out.println("Primeira Forma (Corte d Agua Superficial) ");
                System.out.println("Segunda Forma (Roda d Agua) ");
                System.out.println("Terceira Forma (Danca dos Movimentos Rapidos Padronizados) ");
                System.out.println("Quarta Forma (Mare Impactante) ");
                System.out.println("Quinta Forma (Chuva Milagrosa em Dia Seco) ");
                System.out.println("Sexta Forma (Redemoinho Giratorio) ");
                System.out.println("Setima Forma (Ataque Curvo Perfurador de Ondas) ");
                System.out.println("Oitava Forma (Jarro de Cachoeira) ");
                System.out.println("Nona Forma (Respingo de Agua do Caos) ");
                System.out.println("Decima Forma (Dragao da Mudanca) \n");
                System.out.println("-----------------------------------------------------------");
                System.out.println("-------------------INIMIGO NEUTRALIZADO!-------------------");
                System.out.println("-----------------------------------------------------------");
                return erros;

            } else {
                erros++;
                if (respostaUsuario.matches("[A-D]")) {
                    System.out.println("INCORRETO! O Inimigo conseguiu escapar. Tente novamente.\n");
                } else {
                    System.out.println("Resposta invalida! Por favor, digite apenas A, B, C ou D.\n");
                }
            }

        }

        System.out.println("\n Voce atingiu o limite de tentativas! Falha na utilizacao dos ataques...\n");
        return -1;
    }
// =================================== DESAFIO 3 ===================================

    public static int desafioResgateVitimias(Scanner sc) {

        final String respostaCorreta = "B";
        int tentativas = 0;
        boolean tetoEstaCaindo = true;
        int erros = 0;

        while (tentativas < 3) {
            tentativas++;
            System.out.println("\n--- FASE 3: Resgate das Vitimas do Nivel (Laco do-while) ---");
            System.out.println("Cenario: O castelo esta desabando, mas voce deve tentar salvar UMA vitima ANTES de verificar se o teto ja desabou.");

            System.out.println("\nPergunta: Qual estrutura garante que a acao 'Salvar Vitima' ocorra pelo menos uma vez, mesmo se a condicao (teto caindo) ja for verdadeira de inicio? (Tentativa " + tentativas + " /3)\n");
            System.out.println("A) for");
            System.out.println("B) do-while"); // Resposta correta
            System.out.println("C) if-else");
            System.out.println("D) while\n");
            System.out.println("Sua resposta (A, B, C ou D):\n");

            String respostaUsuario = sc.next().toUpperCase();

            if (respostaUsuario.equals(respostaCorreta)) {
                System.out.println("\n--- Acao no Jogo (Resgate): ---");
                do {
                    System.out.println("[DO] Acao executada: Resgatando uma vitima!");
                } while (tetoEstaCaindo == false);

                System.out.println("[WHILE] Condicao Verificada: O Teto esta caindo! Missao 'Salvar pelo menos um' cumprida.");
                return erros;

            } else {
                erros++;
                if (respostaUsuario.matches("[A-D]")) {
                    System.out.println("INCORRETO! A vitima não conseguiu ser salva. Tente novamente\n.");
                } else {
                    System.out.println("Resposta invalida! Por favor, digite apenas A, B, C ou D.\n");
                }
            }
        }
        System.out.println("\n Voce atingiu o limite de tentativas! Falha no resgate das vitimas...\n");
        return -1;
    }
// =================================== DESAFIO 4 ===================================
    public static int desafioBalancoSpiderMan(Scanner sc) {

        final String respostaCorreta = "D";
        int tentativas = 0;
        int erros = 0;

        while (tentativas < 3) {
            tentativas++;
            System.out.println("\n--- Fase 4: O Balanco (Laco While) ---");
            System.out.println("O Spider-Man balanca enquanto houver energia na teia (> 0).");
            System.out.println("\nQual a sintaxe correta para um laco com numero de iteracoes incerto? (Tentativa " + tentativas + " /3)\n");
            System.out.println("A) for (int i = 5; i > 0; i--)");
            System.out.println("B) do");
            System.out.println("C) if (energiaTeia > 0)");
            System.out.println("D) while (energiaTeia > 0)\n"); // Resposta correta
            System.out.println("Sua resposta (A, B, C ou D):\n");

            String respostaUsuario = sc.next().toUpperCase();

            if (respostaUsuario.equals(respostaCorreta)) {
                System.out.println("Correto! O 'while' e o ideal para condicoes continuas.");
                return erros;
            } else {
                erros++;
                if (respostaUsuario.matches("[A-D]")) {
                    System.out.println("Incorreto! Voce sofreu 20 de dano. Tente novamente\n");
                } else {
                    System.out.println("Resposta invalida! Por favor, digite apenas A, B, C ou D.\n");

                }

            }

        }
        System.out.println("\n Voce atingiu o limite de tentativas! Falha no lancamento da teia...\n");
        return -1;

    }

    // =================================== DESAFIO 5 ===================================
    public static int desafioFormaDeRespiracao(Scanner sc) {

        final String respostaCorreta = "A";
        int tentativas = 0;
        int erros = 0;

        while (tentativas < 3) {
            tentativas++;
            System.out.println("\n--- Fase 5: Forma de respiracao (Laco For) ---");
            System.out.println("Tanjiro precisa realizar exatamente 10 cortes");
            System.out.println("\nQual laco permite controlar INICIALIZACAO, CONDICAO e INCREMENTO de forma concisa no cabecalho? (Tentativa " + tentativas + " /3)\n");
            System.out.println("A) int i = 1; i <= 10; i++"); // Resposta correta
            System.out.println("B) i <= 10");
            System.out.println("C) while (i < 10)");
            System.out.println("D) do { ... } while (i < 10)\n");
            System.out.println("Sua resposta (A, B, C ou D):\n");

            String respostaUsuario = sc.next().toUpperCase();

            if (respostaUsuario.equals(respostaCorreta)) {
                System.out.println("Correto! O 'for' e perfeito para contagens fixas.");
                return erros;
            } else {
                erros++;
                if (respostaUsuario.matches("[A-D]")) {
                    System.out.println("Incorreto! Voce sofreu 30 de dano. Tente novamente\n");
                } else {
                    System.out.println("Resposta invalida! Por favor, digite apenas A, B, C ou D.\n");

                }

            }

        }

        System.out.println("\n Voce atingiu o limite de tentativas! Falha na concentracao da respiração...\n");
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
