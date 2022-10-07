public class Tabuleiro {
    private static String tab;
    private static int posicao;
    private static char jogador;

    public static String tabuleiro(){
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

    public static String mudaTabuleiro(String tab, int posicao, char jogador) {
        Tabuleiro.tab = tab;
        Tabuleiro.posicao = posicao;
        Tabuleiro.jogador = jogador;

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

    public static char[] tabToArray(String tab){
        char[] tabuleiro = tab.toCharArray();
        return new char[]{tabuleiro[21], tabuleiro[27],tabuleiro[33], tabuleiro[78], tabuleiro[84], tabuleiro[90], tabuleiro[135], tabuleiro[141], tabuleiro[147]};
        
    }

}

