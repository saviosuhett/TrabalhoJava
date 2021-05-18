package controller;
import java.util.*;

public class Q09 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int a, b, c;
        double x2;
        double x1;
        double delta;

        System.out.println("Digite o valor dos coeficientes A, B e C");
        System.out.println("Valor de A: " );
        a = ler.nextInt();
        System.out.println("Valor de B: " );
        b = ler.nextInt();
        System.out.println("Valor de C: " );
        c = ler.nextInt();

        delta = Math.pow(b, 2) - 4 * a * c;

        
        x1 = (-(b) + Math.sqrt(delta)) / 2 * a;
        x2 = (-(b) - Math.sqrt(delta)) / 2 * a;

        if(delta < 0) {
            System.out.println("Nenhuma raiz real. ");
        }

        else if(delta == 0) {
            System.out.println("Uma única raiz real ");
            System.out.println(" X' " + x1);
            System.out.println(" ");
            System.out.println(" X'' " + x2);
        }
        else {
            System.out.println("Duas raízes reais.\n ");
            System.out.println(" x1 " + x1);
            System.out.println(" ");
            System.out.println(" x2 " + x2);
        }

    }
}







