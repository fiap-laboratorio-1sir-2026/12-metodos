import java.util.Random;

public class Exercicio07 {
    static void main() {
        int[][] x = new int[4][4];

        lerDados(x);
        imprimir(x);

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
