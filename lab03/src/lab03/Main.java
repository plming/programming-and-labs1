package lab03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("공약수, 최대공약수, 공배수, 최대공약수를 구할 수 2개 입력: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        Calculator calculator = new Calculator();

        System.out.println(calculator.getGreatestCommonDivisor(num1, num2));

        calculator.printCommonDivisors(num1, num2);

        System.out.println(calculator.getLeastCommonMultiple(num1, num2));

        calculator.printCommonMultiples(num1, num2, 10);
    }
}
