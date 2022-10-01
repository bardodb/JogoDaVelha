import java.util.Scanner;


public class JogoDaVelha {
    public static void main(String[] args) {
        char[] simbolos = {'X', 'O'};
        int posicao = 0;
        boolean ganhou = false;
        String tab = "     |     |      \n" +
                     "  1  |  2  |  3   \n" +
                     "_____|_____|_____ \n" +
                     "     |     |      \n" +
                     "  4  |  5  |  6   \n" +
                     "_____|_____|_____ \n" +
                     "     |     |      \n" +
                     "  7  |  8  |  9   \n" +
                     "     |     |      " ;
        Scanner leitor = new Scanner(System.in);

        String[] jogadores = inicializa(tab);
        for (int i = 0; i < jogadores.length ; i++) {
            String jogador = jogadores[i];
            char simbolo = simbolos[i];

                System.out.println("O jogador " + jogador + " é o " +  simbolo);

        }


        while (!ganhou) {
//            for (String jogador : jogadores) {
//                for (char simbolo : simbolos) {
//                    System.out.println("Vez da " + jogador + "");
//                    posicao = Jogador.getJogadas(leitor);
//                    tab = Tabuleiro(tab, posicao, simbolo);
//
//                }
//            }
            for (int i = 0; i < jogadores.length ; i++) {
                String jogador = jogadores[i];
                char simbolo = simbolos[i];
                System.out.println("Vez da " + jogador);
                posicao = Jogador.getJogadas(leitor);
                tab = Tabuleiro(tab, posicao, simbolo);
                System.out.println(tab);


            }


//            if (jogo[0][0] == 1 && jogo[0][1] == 1 && jogo[0][2] == 1) {
//                ganhou = true;
//                System.out.println("Jogadora " + nome1 + " ganhou!");
//            } else if (jogo[1][0] == 1 && jogo[1][1] == 1 && jogo[1][2] == 1) {
//                ganhou = true;
//                System.out.println("Jogadora " + nome1 + " ganhou!");
//            } else if (jogo[2][0] == 1 && jogo[2][1] == 1 && jogo[2][2] == 1) {
//                ganhou = true;
//                System.out.println("Jogadora " + nome1 + " ganhou!");
//            } else if (jogo[0][0] == 1 && jogo[1][0] == 1 && jogo[2][0] == 1) {
//                ganhou = true;
//                System.out.println("Jogadora " + nome1 + " ganhou!");
//            } else if (jogo[0][1] == 1 && jogo[1][1] == 1 && jogo[2][1] == 1) {
//                ganhou = true;
//                System.out.println("Jogadora " + nome1 + " ganhou!");
//            } else if (jogo[0][2] == 1 && jogo[1][2] == 1 && jogo[2][2] == 1) {
//                ganhou = true;
//                System.out.println("Jogadora " + nome1 + " ganhou!");
//            } else if (jogo[0][0] == 1 && jogo[1][1] == 1 && jogo[2][2] == 1) {
//                ganhou = true;
//                System.out.println("Jogadora " + nome1 + " ganhou!");
//            } else if (jogo[0][2] == 1 && jogo[1][1] == 1 && jogo[2][0] == 1) {
//                ganhou = true;
//                System.out.println("Jogadora " + nome1 + " ganhou!");
//            }

//            if (!ganhou) {
//                System.out.println("Vez do jogador 2");
//                jogadas = Jogador.getJogadas(sc, jogo, jogador2, jogadas);
//                if (jogo[0][0] == 2 && jogo[0][1] == 2 && jogo[0][2] == 2) {
//                    ganhou = true;
//                    System.out.println("A jogadora" + nome2 + "ganhou!");
//                } else if (jogo[1][0] == 2 && jogo[1][1] == 2 && jogo[1][2] == 2) {
//                    ganhou = true;
//                    System.out.println("A jogadora" + nome2 + "ganhou!");
//                } else if (jogo[2][0] == 2 && jogo[2][1] == 2 && jogo[2][2] == 2) {
//                    ganhou = true;
//                    System.out.println("A jogadora" + nome2 + "ganhou!");
//                } else if (jogo[0][0] == 2 && jogo[1][0] == 2 && jogo[2][0] == 2) {
//                    ganhou = true;
//                    System.out.println("A jogador" + nome2 + "ganhou!");
//                } else if (jogo[0][1] == 2 && jogo[1][1] == 2 && jogo[2][1] == 2) {
//                    ganhou = true;
//                    System.out.println("A jogador" + nome2 + "ganhou!");
//                } else if (jogo[0][2] == 2 && jogo[1][2] == 2 && jogo[2][2] == 2) {
//                    ganhou = true;
//                    System.out.println("A jogador" + nome2 + "ganhou!");
//                } else if (jogo[0][0] == 2 && jogo[1][1] == 2 && jogo[2][2] == 2) {
//                    ganhou = true;
//                    System.out.println("A jogador" + nome2 + "ganhou!");
//                } else if (jogo[0][2] == 2 && jogo[1][1] == 2 && jogo[2][0] == 2) {
//                    ganhou = true;
//                    System.out.println("A jogador" + nome2 + "ganhou!");
//                }
//            }
        }
    }

    private static String Tabuleiro(String tab, int posicao, char jogador) {

        switch (posicao){
            case 1: tab = tab.replace('1', jogador);
                break;
            case 2: tab = tab.replace('2', jogador);
                break;
            case 3: tab = tab.replace('3', jogador);
                break;
            case 4: tab = tab.replace('4', jogador);
                break;
            case 5: tab = tab.replace('5', jogador);
                break;
            case 6: tab = tab.replace('6', jogador);
                break;
            case 7: tab = tab.replace('7', jogador);
                break;
            case 8: tab = tab.replace('8', jogador);
                break;
            case 9: tab = tab.replace('9', jogador);
                break;
            case 0: break;
            default:
                System.out.println("posição não existe");
        }

        return tab;
    }

    private static String[] inicializa(String tab){
        System.out.println("|-----------------------------------------------------|");
        System.out.println("|--------------------JOGO DA VELHA--------------------|");
        System.out.println("|-----------------------------------------------------|");

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do jogador 1: ");
        String nome1 = sc.nextLine();
        System.out.println("Digite o nome do jogador 2: ");
        String nome2 = sc.nextLine();
        String[] lista = {nome1, nome2};
        System.out.println(tab);

        return lista;
    }

}