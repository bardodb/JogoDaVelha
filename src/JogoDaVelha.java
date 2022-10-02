import java.util.Scanner;



public class JogoDaVelha {
    public static void main(String[] args) {
        char[] simbolos = {'X', 'O'};
        int posicao = 0;
        boolean ganhou = false;
        String tab = Tabuleiro.tabuleiro();
        Scanner leitor = new Scanner(System.in);
        char[] arrayTab;
        int n = 0;

        inicializa();

        String[] jogadores = Jogador.getJogador(leitor, tab);
        Jogador.mostraJogaroes(jogadores, simbolos);
//            for (int i = 0; i < jogadores.length; i++) {
//                String jogador = jogadores[i];
//                char simbolo = simbolos[i];
//
//                System.out.println("O jogador " + jogador + " é o " + simbolo);
//
//            }


        while (!ganhou) {
            n = n + 2;
            for (int i = 0; i < jogadores.length; i++) {
                String jogador = jogadores[i];
                char simbolo = simbolos[i];
                System.out.println("Vez da " + jogador);
                posicao = Jogador.getJogadas(leitor);
                tab = Tabuleiro.mudaTabuleiro(tab, posicao, simbolo);
                arrayTab = Tabuleiro.tabToArray(tab);
                ganhou = Ganhou(arrayTab, jogador, tab);
                    if (ganhou == true) {
                        System.out.println("Quer jogar outra partida? s/n");
                        char resposta = leitor.next().charAt(0);
                        if (resposta == 's') {
                            System.out.println("|---------------Iniciando outra partida--------------|");
                            Jogador.mostraJogaroes(jogadores, simbolos);
                            tab = Tabuleiro.tabuleiro();
                            n = 0;
                        } else {
                            System.out.println("|---------------Encerrando Jogo--------------|");
                            break;
                        }
                    }
                    if (n == 10 && i == 0) {
                        System.out.println(tab);
                        System.out.println("Deu velhaa!!");
                        System.out.println("Quer jogar outra partida? s/n");
                        char resposta = leitor.next().charAt(0);
                        if (resposta == 's') {
                            Jogador.mostraJogaroes(jogadores, simbolos);
                            System.out.println("|---------------Iniciando outra partida--------------|");
                            tab = Tabuleiro.tabuleiro();
                            n = 0;
                        } else {
                            System.out.println("|---------------Encerrando Jogo--------------|");
                            break;
                        }
                    }
                System.out.println(tab);

            }
        }
    }


    private static void inicializa() {
        System.out.println("|-----------------------------------------------------|");
        System.out.println("|--------------------JOGO DA VELHA--------------------|");
        System.out.println("|-----------------------------------------------------|");

    }


    private static boolean Ganhou(char[] tabJogadas, String jogador, String tab) {
        boolean ganhou;
        if (tabJogadas[0] == tabJogadas[1] && tabJogadas[1] == tabJogadas[2] ||
                tabJogadas[3] == tabJogadas[4] && tabJogadas[4] == tabJogadas[5] ||
                tabJogadas[6] == tabJogadas[7] && tabJogadas[7] == tabJogadas[8] ||
                tabJogadas[0] == tabJogadas[3] && tabJogadas[3] == tabJogadas[6] ||
                tabJogadas[1] == tabJogadas[4] && tabJogadas[4] == tabJogadas[7] ||
                tabJogadas[2] == tabJogadas[5] && tabJogadas[5] == tabJogadas[8] ||
                tabJogadas[0] == tabJogadas[4] && tabJogadas[4] == tabJogadas[8] ||
                tabJogadas[2] == tabJogadas[4] && tabJogadas[4] == tabJogadas[6]) {
            System.out.println(tab);
            System.out.println("Parabéeennss " + jogador + " vc ganhou");
            ganhou = true;
        } else {
            ganhou = false;
        }
        return ganhou;
    }
}



    
//    private static String Tabuleiro(){
//        String tab = "     |     |      \n" +
//                     "  1  |  2  |  3   \n" +
//                     "_____|_____|_____ \n" +
//                     "     |     |      \n" +
//                     "  4  |  5  |  6   \n" +
//                     "_____|_____|_____ \n" +
//                     "     |     |      \n" +
//                     "  7  |  8  |  9   \n" +
//                     "     |     |      " ;
//        return tab;
//    }
//
//}