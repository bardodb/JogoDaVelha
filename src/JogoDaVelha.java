import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        char[] simbolos = {'X', 'O'};
        int posicao;
        int[] pontos = {0, 0};
        boolean ganhou = false;
        String tab = Tabuleiro.tabuleiro();
        Scanner leitor = new Scanner(System.in);
        char[] arrayTab;
        int n = 0;
        int j;

        inicializa();

        String[] jogadores = Jogador.getJogador(leitor, tab);
        Jogador.mostraJogardores(jogadores, simbolos);

        while (!ganhou) {
            n = n + 2;
            for (int i = 0; i < jogadores.length; i++) {
                String jogador = jogadores[i];
                char simbolo = simbolos[i];
                System.out.println("Vez da " + jogador);
                posicao = Jogador.getJogadas(leitor, tab);
                arrayTab = Tabuleiro.tabToArray(tab);


                if (posicao > 9 || posicao < 1) {
                    System.out.println("O jogo só aceita números entre 1 e 9");
                    i--;
                    continue;
                }

                j = posicao -1;
                while (arrayTab[j] == 'X' || arrayTab[j] == 'O') {
                    System.out.println("Posição já selecionada, tente outra");
                    posicao = Jogador.getJogadas(leitor, tab);
                    j = posicao -1;
                }

                tab = Tabuleiro.mudaTabuleiro(tab, posicao, simbolo);
                arrayTab = Tabuleiro.tabToArray(tab);
                ganhou = Ganhou.ganhou(arrayTab, jogador, tab);


                    if (ganhou) {
                        Ganhou.placar (ganhou, jogadores, pontos, i);
                        if(Jogador.simNao(leitor, jogadores, simbolos)) {
                                tab = Tabuleiro.tabuleiro();
                                n = 0;
                                ganhou =  false;
                            } else break;

                    }
                if (n == 10 && i == 0){
                    System.out.println(tab);
                    System.out.println("Deu velhaa!!");
                    if(Jogador.simNao(leitor, jogadores, simbolos)) {
                        tab = Tabuleiro.tabuleiro();
                        n = 0;
                        ganhou =  false;
                    } else break;

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



}