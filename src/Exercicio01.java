import java.util.Scanner;

public class Exercicio01 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int valor;

        System.out.print("Informe um valor inteiro e positivo --> ");
        valor = sc.nextInt();
        if(valor <= 0) {
            System.out.println("o valor deve ser inteiro e positivo");
        }
        else {
            imprimir(valor);
        }
    }

    public static void imprimir(int valor) {
        for(int i = 1; i <= valor; i++) {
            if(valor % i == 0) {
                System.out.print(i + "  ");
            }
        }
    }
}
