package lab02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("a = ");
        long a = scanner.nextLong();
        System.out.print("b = ");
        long b = scanner.nextLong();
        scanner.close();

        System.out.printf("%dC%d = %d", a, b, calculator.combination(a, b));
    }
}
