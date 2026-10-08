import java.util.Random;

public class Exercicio07 {
    static void main() {
        int[] y = new int[10];
        double media, desvio;

        lerDados(y);
        System.out.println("Dados do vetor");
        imprimir(y);
        media = calcularMedia(y);
        System.out.println("Média do vetor = " + media);
        desvio = calcularDesvio(y, media);
        System.out.println("Desvio padrão = " + desvio);
    }

    static double calcularDesvio(int[] v, double m) {
        double soma = 0;
        for(int i = 0; i < v.length; i++) {
            soma += Math.pow(v[i] - m, 2);
        }
        return Math.sqrt(1.0/(v.length - 1) * soma);
    }
    static void lerDados(int[] y) {
        Random random = new Random();
        for(int i = 0; i < y.length; i++) {
            y[i] = random.nextInt(101);
        }
    }

    static void imprimir(int[] y) {
        for(int i = 0; i < y.length; i++) {
            System.out.print(y[i] + "  ");
        }
    }

    static double calcularMedia(int[] y) {
        double media = 0;
        for(int i = 0; i < y.length; i++) {
            media += y[i];
        }
        media = media / y.length;
        return media;
    }

}
