import java.util.Scanner;
import java.util.Arrays;
import java.lang.Character;


public class JogoDaVelha {
    public static void main(String[] args) {
        char[] simbolos = {'X', 'O'};
        int posicao = 0;
        boolean ganhou = false;
        String tab = Tabuleiro();
        Scanner leitor = new Scanner(System.in);
        char[] arrayTab;



        String[] jogadores = inicializa(tab);
        for (int i = 0; i < jogadores.length ; i++) {
            String jogador = jogadores[i];
            char simbolo = simbolos[i];

                System.out.println("O jogador " + jogador + " é o " +  simbolo);

        }


        while (!ganhou) {

            for (int i = 0; i < jogadores.length ; i++) {
                String jogador = jogadores[i];
                char simbolo = simbolos[i];
                System.out.println("Vez da " + jogador);
                posicao = Jogador.getJogadas(leitor);
                tab = MudaTabuleiro(tab, posicao, simbolo);
                arrayTab = tabToArray(tab);
                ganhou = Ganhou(arrayTab, jogador);
                    if (ganhou == true){
                        System.out.println("Quer jogar outra partida? s/n");
                        char resposta = leitor.next().charAt(0);
                            if(resposta == 's'){
                                System.out.println("|---------------Iniciando outra partida--------------|");
                                tab = Tabuleiro();
                            } else {
                                System.out.println("|---------------Encerrando Jogo--------------|");
                                break;
                            }
                    }
                System.out.println(tab);

            }
        }
 }

    private static String MudaTabuleiro(String tab, int posicao, char jogador) {
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

    private static boolean Ganhou (char[] tabJogadas, String jogador){
        boolean ganhou;
        if (tabJogadas[0] == tabJogadas [1] && tabJogadas [1] == tabJogadas[2] ||
                tabJogadas[3] == tabJogadas [4] && tabJogadas [4] == tabJogadas[5] ||
                tabJogadas[6] == tabJogadas [7] && tabJogadas [7] == tabJogadas[8] ||
                tabJogadas[0] == tabJogadas [3] && tabJogadas [3] == tabJogadas[6] ||
                tabJogadas[1] == tabJogadas [4] && tabJogadas [4] == tabJogadas[7] ||
                tabJogadas[2] == tabJogadas [5] && tabJogadas [5] == tabJogadas[8] ||
                tabJogadas[0] == tabJogadas [4] && tabJogadas [4] == tabJogadas[8] ||
                tabJogadas[2] == tabJogadas [4] && tabJogadas [4] == tabJogadas[6]){
            System.out.println("Parabéeennss " +jogador+ " vc ganhou");
            ganhou = true;
        } else {
            ganhou = false;
        }
        return ganhou;
    }

    private static char[] tabToArray(String tab){
        char[] tabuleiro = tab.toCharArray();
        char[] tabJogadas = {tabuleiro[21], tabuleiro[27],tabuleiro[33], tabuleiro[78], tabuleiro[84], tabuleiro[90], tabuleiro[135], tabuleiro[141], tabuleiro[147]};
        return tabJogadas;
    }
    
    private static String Tabuleiro(){
        String tab = "     |     |      \n" +
                     "  1  |  2  |  3   \n" +
                     "_____|_____|_____ \n" +
                     "     |     |      \n" +
                     "  4  |  5  |  6   \n" +
                     "_____|_____|_____ \n" +
                     "     |     |      \n" +
                     "  7  |  8  |  9   \n" +
                     "     |     |      " ;
        return tab;
    }

}