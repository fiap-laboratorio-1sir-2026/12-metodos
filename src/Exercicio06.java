import java.util.Random;

public class Exercicio06 {
    static void main() {
        int[][] x = new int[4][4];
        int[] maior;

        lerDados(x);
        System.out.println("Matriz");
        imprimir(x);
        maior = maiorValor(x);
        System.out.println("\nMaior valor de cada linha");
        imprimirMaioValor(maior);

    }

    static void imprimirMaioValor(int[] maior) {
        for(int i = 0; i < maior.length; i++) {
            System.out.print(maior[i] + "  ");
        }
    }

    static int[] maiorValor(int[][] x) {
        int[] maior = new int[x.length];
        for(int i = 0; i < x.length; i++) {
            for(int j = 0; j < x.length; j++) {
                if(x[i][j] > maior[i]) {
                    maior[i] = x[i][j];
                }
            }
        }
        return maior;
    }

    static void lerDados(int[][] x) {
        Random random = new Random();
        for(int i = 0; i < x.length; i++) {
            for(int j = 0; j < x.length; j++) {
                x[i][j] = random.nextInt(1, 150);
            }
        }
    }

    static void imprimir(int[][] x) {
        for(int i = 0; i < x.length; i++) {
            for(int j = 0; j < x.length; j++) {
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
