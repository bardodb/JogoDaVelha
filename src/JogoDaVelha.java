import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] jogo = new int[3][3];
        int jogador1 = 1;
        int jogador2 = 2;
        int jogadas = 0;
        int linha, coluna;
        System.out.println("Digite o nome do jogador 1: ");
        String nome1 = sc.nextLine();
        System.out.println("Digite o nome do jogador 2: ");
        String nome2 = sc.nextLine();

        boolean ganhou = false;
        while (ganhou == false) {
            System.out.println("Vez da " + nome1);
            System.out.println("Digite a linha: ");
            linha = sc.nextInt();
            System.out.println("Digite a coluna: ");
            coluna = sc.nextInt();
            if (jogo[linha][coluna] == 0) {
                jogo[linha][coluna] = jogador1;
                jogadas++;
            } else {
                System.out.println("Jogada inválida");
            }

            for (int i = 0; i < jogo.length; i++) {
                for (int j = 0; j < jogo[i].length; j++) {
                    System.out.print(jogo[i][j] + "|");
                }
                System.out.println();
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
            if (jogadas == 9) {
                ganhou = true;
                System.out.println("Deu velha!");
            }

            if (ganhou == false) {
                System.out.println("Vez do jogador 2");
                System.out.println("Digite a linha: ");
                linha = sc.nextInt();
                System.out.println("Digite a coluna: ");
                coluna = sc.nextInt();
                if (jogo[linha][coluna] == 0) {
                    jogo[linha][coluna] = jogador2;
                    jogadas++;
                } else {
                    System.out.println("Jogada inválida");
                }
                for (int i = 0; i < jogo.length; i++) {
                    for (int j = 0; j < jogo[i].length; j++) {
                        System.out.print(jogo[i][j] + "|");
                    }
                    System.out.println();
                }
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

}

