import java.util.Random;

public class Exercicio06 {
    static void main() {
        int[] x = new int[10];
        lerDados(x);
        System.out.println("Antes da inversão");
        imprimir(x);
        inverter(x);
        System.out.println("Depois da inversão");
        imprimir(x);
    }

    static void lerDados(int[] x) {
        Random random = new Random();
        for(int i = 0; i < x.length; i++) {
            x[i] = random.nextInt(25);
        }
    }

    static void imprimir(int[] x) {
        for(int i = 0; i < x.length; i++) {
            System.out.print(x[i] + "  ");
        }
    }

    static void inverter(int[] x) {
        int aux;
        int j = x.length - 1;
        for(int i = 0; i < x.length / 2; i++) {
            aux = x[i];
            x[i] = x[j];
            x[j] = aux;
            j--;
        }
    }

}
