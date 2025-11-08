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
 
            System.out.println("Escolha uma opcao:\n");
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
        System.out.println("Opcao 1: Criativo (Demon Slayer)");
        System.out.println("Opcao 2: Logico (Spider-Man)\n");
        System.out.println("Escolha uma opcao: ");
        int escolha = sc.nextInt();
 
        if (escolha == 1) {
            //jogarCriativo(sc);
        } else if (escolha == 2) {
            //jogarLogico(sc);
        } else {
            System.out.println("Opcao invalida! Escolha uma opcao de 1 a 2:");
        }
    }
}