import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;
        System.out.println("Quantidade de MB consumidos");
        a = input.nextInt();
        if (a <= 100) {
            System.out.println("Valor a pagar é R$40");
        } else {
            b = 40 + (a - 100) * 2;
            System.out.println("O valor a ser pago é de R$ " + b + "");
        }
    }
}
