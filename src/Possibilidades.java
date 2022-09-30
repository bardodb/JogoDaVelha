import java.util.Scanner;
public class Possibilidades {

    public static String ganhou(int[][] jogo, String nome1, String nome2) {
        switch (jogo[0][0]) {

            case 1:
                if (jogo[0][1] == 1 && jogo[0][2] == 1) {
                    return "Jogadora " + nome1 + " ganhou!";
                } else if (jogo[1][0] == 1 && jogo[2][0] == 1) {
                    return "Jogadora " + nome1 + " ganhou!";
                } else if (jogo[1][1] == 1 && jogo[2][2] == 1) {
                    return "Jogadora " + nome1 + " ganhou!";
                }
                break;

            case 2:
                if (jogo[0][1] == 2 && jogo[0][2] == 2) {
                    return "Jogadora " + nome2 + " ganhou!";
                } else if (jogo[1][0] == 2 && jogo[2][0] == 2) {
                    return "Jogadora " + nome2 + " ganhou!";
                } else if (jogo[1][1] == 2 && jogo[2][2] == 2) {
                    return "Jogadora " + nome2 + " ganhou!";
                }
                break;

            case 3:
                if (jogo[0][1] == 3 && jogo[0][2] == 3) {
                    return "Jogadora " + nome2 + " ganhou!";
                } else if (jogo[1][0] == 3 && jogo[2][0] == 3) {
                    return "Jogadora " + nome2 + " ganhou!";
                } else if (jogo[1][1] == 3 && jogo[2][2] == 3) {
                    return "Jogadora " + nome2 + " ganhou!";
                }
                break;
        }
        return "";
    }
}

