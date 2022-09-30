import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] jogo = new int[3][3];
        int jogador1 = 1;
        int jogador2 = 2;
        int jogadas = 0;
        boolean ganhou = false;
        Scanner leitor = new Scanner(System.in);

        String[] jogadores = inicializa();



        while (!ganhou) {
            for (String jogador : jogadores) {
                System.out.println("Vez da " + jogador);
                jogadas = Jogador.getJogadas(sc, jogo, jogador1, jogadas);
            }


            if (jogo[0][0] == 1 && jogo[0][1] == 1 && jogo[0][2] == 1) {
                ganhou = true;
                System.out.println("Jogadora " + nome1 + " ganhou!");
            } else if (jogo[1][0] == 1 && jogo[1][1] == 1 && jogo[1][2] == 1) {
                ganhou = true;
                System.out.println("Jogadora " + nome1 + " ganhou!");
            } else if (jogo[2][0] == 1 && jogo[2][1] == 1 && jogo[2][2] == 1) {
                ganhou = true;
                System.out.println("Jogadora " + nome1 + " ganhou!");
            } else if (jogo[0][0] == 1 && jogo[1][0] == 1 && jogo[2][0] == 1) {
                ganhou = true;
                System.out.println("Jogadora " + nome1 + " ganhou!");
            } else if (jogo[0][1] == 1 && jogo[1][1] == 1 && jogo[2][1] == 1) {
                ganhou = true;
                System.out.println("Jogadora " + nome1 + " ganhou!");
            } else if (jogo[0][2] == 1 && jogo[1][2] == 1 && jogo[2][2] == 1) {
                ganhou = true;
                System.out.println("Jogadora " + nome1 + " ganhou!");
            } else if (jogo[0][0] == 1 && jogo[1][1] == 1 && jogo[2][2] == 1) {
                ganhou = true;
                System.out.println("Jogadora " + nome1 + " ganhou!");
            } else if (jogo[0][2] == 1 && jogo[1][1] == 1 && jogo[2][0] == 1) {
                ganhou = true;
                System.out.println("Jogadora " + nome1 + " ganhou!");
            }

            if (!ganhou) {
                System.out.println("Vez do jogador 2");
                jogadas = Jogador.getJogadas(sc, jogo, jogador2, jogadas);
                if (jogo[0][0] == 2 && jogo[0][1] == 2 && jogo[0][2] == 2) {
                    ganhou = true;
                    System.out.println("A jogadora" + nome2 + "ganhou!");
                } else if (jogo[1][0] == 2 && jogo[1][1] == 2 && jogo[1][2] == 2) {
                    ganhou = true;
                    System.out.println("A jogadora" + nome2 + "ganhou!");
                } else if (jogo[2][0] == 2 && jogo[2][1] == 2 && jogo[2][2] == 2) {
                    ganhou = true;
                    System.out.println("A jogadora" + nome2 + "ganhou!");
                } else if (jogo[0][0] == 2 && jogo[1][0] == 2 && jogo[2][0] == 2) {
                    ganhou = true;
                    System.out.println("A jogador" + nome2 + "ganhou!");
                } else if (jogo[0][1] == 2 && jogo[1][1] == 2 && jogo[2][1] == 2) {
                    ganhou = true;
                    System.out.println("A jogador" + nome2 + "ganhou!");
                } else if (jogo[0][2] == 2 && jogo[1][2] == 2 && jogo[2][2] == 2) {
                    ganhou = true;
                    System.out.println("A jogador" + nome2 + "ganhou!");
                } else if (jogo[0][0] == 2 && jogo[1][1] == 2 && jogo[2][2] == 2) {
                    ganhou = true;
                    System.out.println("A jogador" + nome2 + "ganhou!");
                } else if (jogo[0][2] == 2 && jogo[1][1] == 2 && jogo[2][0] == 2) {
                    ganhou = true;
                    System.out.println("A jogador" + nome2 + "ganhou!");
                }
            }
        }
    }

    private static String Tabuleiro(int posicao, char jogador) {
        String tab = "     |     |     |\n" +
                     "  1  |  2  |  3  |\n" +
                     "_____|_____|_____|\n" +
                     "     |     |     |\n" +
                     "  4  |  5  |  6  |\n" +
                     "_____|_____|_____|\n" +
                     "     |     |     |\n" +
                     "  7  |  8  |  9  |\n" +
                     "_____|_____|_____|" ;
        switch (posicao){
            case 1: tab.replace('1', jogador);
            case 2: tab.replace('2', jogador);
            case 3: tab.replace('3', jogador);
            case 4: tab.replace('4', jogador);
            case 5: tab.replace('5', jogador);
            case 6: tab.replace('6', jogador);
            case 7: tab.replace('7', jogador);
            case 8: tab.replace('8', jogador);
            case 9: tab.replace('9', jogador);
            default:
                System.out.println("posição não existe");
        }
        return tab;
    }

    private static String[] inicializa(){
        System.out.println("|-----------------------------------------------------|");
        System.out.println("|--------------------JOGO DA VELHA--------------------|");
        System.out.println("|-----------------------------------------------------|");

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do jogador 1: ");
        String nome1 = sc.nextLine();
        System.out.println("Digite o nome do jogador 2: ");
        String nome2 = sc.nextLine();
        String[] lista = {nome1, nome2};

        return lista;
    }

}