import java.util.Scanner;

public class Jogador {

    public static String[] getJogador(Scanner leitor, String tab){
        System.out.println("Digite o nome do jogador 1: ");
        String nome1 = leitor.nextLine();
        System.out.println("Digite o nome do jogador 2: ");
        String nome2 = leitor.nextLine();
        String[] lista = {nome1, nome2};
        System.out.println(tab);

        return lista;
    }

    public static int getJogadas(Scanner sc) {
            System.out.println("Digite a posição: ");
            return sc.nextInt();
    }

    public static void mostraJogardores(String[] jogadores, char[] simbolos){
        for (int i = 0; i < jogadores.length; i++) {
            String jogador = jogadores[i];
            char simbolo = simbolos[i];

            System.out.println("O jogador " + jogador + " é o " + simbolo);
        }


        }

    }

