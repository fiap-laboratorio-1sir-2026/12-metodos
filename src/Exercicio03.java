import java.util.Scanner;

public class Exercicio03 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int valor1, valor2, valor3, maior;

        System.out.print("Primeiro valor --> ");
        valor1 = sc.nextInt();
        System.out.print("Segundo valor --> ");
        valor2 = sc.nextInt();
        System.out.print("Terceiro valor --> ");
        valor3 = sc.nextInt();

        maior = acharMaior(valor1, valor2, valor3);
        System.out.println("maior = " + maior);

    }

    static int acharMaior(int v1, int v2, int v3) {
        int maior = v1;
        if(v2 > maior) {
            maior = v2;
        }
        if(v3 > maior) {
            maior = v3;
        }
        return maior;
    }


}
