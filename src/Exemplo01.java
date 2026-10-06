public class Exemplo01 {
    static void main() {
        int a = 10;
        int[] x = {2, 1, 3, 4, 7};

        qq(x);
        for(int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }

    }

    static void qq(int[] x) {
        for(int i = 0; i < x.length; i++) {
            x[i] = 2 * x[i];
        }
    }

}
