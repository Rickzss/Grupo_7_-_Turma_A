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
            System.out.println("(1) Instruções");
            System.out.println("(2) Jogar");
            System.out.println("(3) Créditos");
            System.out.println("(4) Sair\n");

            System.out.println("Escolha uma opção:");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("\n Instruções: \n");
                    System.out.println("Você está preso no Castelo Infinito, um lugar onde o código ganha vida!");
                    System.out.println("Escolha seu caminho: Criativo (Demon Slayer) ou Lógico (Spider-Man).");
                    System.out.println("Responda corretamente às perguntas sobre laços de repetição para avançar.");
                    System.out.println("Ganhe ranks de acordo com sua performance e desbloqueie salas bônus!\n");

                    break;
                case 2:
                    //jogar(sc); //===== Puxa para outra tela ======
                    break;
                case 3:
                    System.out.println("Desenvolvido pelo GRUPO 7 Turma A pelos alunos: \n"
                            + "\nEduardo Alcantara; "
                            + "\nFlavio Batista; "
                            + "\nHenrique Espíndola; "
                            + "\nLeonardo Bacelar; "
                            + "\nGiovani Teles;"
                            + "\n");

                    break;
                case 4:
                    System.out.println("Saíndo do jogo, até mais!");
                    break;
                default:
                    System.out.println("Opção Inválida! Escolha uma opção de 1 a 5: ");

            }

        } while (opcao != 4);

    }   
}

