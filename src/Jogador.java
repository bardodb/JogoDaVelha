import java.util.Scanner;

public class Jogador {
    public static int getJogadas(Scanner sc, int[][] jogo, int jogador1, int jogadas) {
        int linha;
        int coluna;
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
        for (int[] value : jogo) {
            for (int i : value) {
                System.out.print(i + "|");
            }
            System.out.println();
        }
        return jogadas;
    }
}
