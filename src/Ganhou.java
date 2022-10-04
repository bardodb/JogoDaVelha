public class Ganhou
{ public static boolean ganhou(char[] tabJogadas, String jogador, String tab) {
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
