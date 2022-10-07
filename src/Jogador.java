import java.util.Scanner;
import static java.lang.Character.toLowerCase;


public class Jogador {
    private static String tab;

    public static String[] getJogador(Scanner leitor, String tab){
        System.out.println("Digite o nome do jogador 1: ");
        String nome1 = leitor.nextLine();
        System.out.println("Digite o nome do jogador 2: ");
        String nome2 = leitor.nextLine();
        String[] lista = {nome1, nome2};
        System.out.println(tab);

        return lista;
    }

    public static int getJogadas(Scanner sc, String tab) {

        Jogador.tab = tab;
        System.out.println("Digite a posição: ");
        if (sc.hasNextInt()) {
            return sc.nextInt();
        }
        else {
            System.out.println("Digite um número");
            sc.next();
            return getJogadas(sc, tab);
        }

    }


    public static void mostraJogardores(String[] jogadores, char[] simbolos){
        for (int i = 0; i < jogadores.length; i++) {
            String jogador = jogadores[i];
            char simbolo = simbolos[i];

            System.out.println("O jogador " + jogador + " é o " + simbolo);
        }


    }
    public static boolean simNao(Scanner leitor, String[] jogadores, char[] simbolos){
        System.out.println("Quer jogar outra partida? s/n");
        char resposta = leitor.next().charAt(0);
        resposta = toLowerCase(resposta);
        if (resposta == 's') {
            Jogador.mostraJogardores(jogadores, simbolos);
            System.out.println("|---------------Iniciando outra partida--------------|");
            return true;
        } else if (resposta == 'n') {
            System.out.println("|---------------Encerrando Jogo--------------|");
            return false;
        } else {
            System.out.println("Não entendi, apenas digite 's' para jogar outra rodada, ou 'n' para finalizar!");
            return simNao(leitor, jogadores, simbolos);
        }
    }

}