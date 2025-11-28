import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double a = input.nextInt();
        double b = input.nextInt();

        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a - b);
        if (b != 0) System.out.println(a / b);
        System.out.println(pow(a,b));


    }
}