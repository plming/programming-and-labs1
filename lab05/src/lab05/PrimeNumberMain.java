package lab05;

import java.util.Scanner;

public class PrimeNumberMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("범위 입력 (ex. 100): ");
        int range = scanner.nextInt();
        scanner.close();

        PrimeNumber primeNumber = new PrimeNumber();
        int sum = primeNumber.getSumOfPrimeNumbers(range);
        System.out.println("소수들의 합: " + sum);
    }
}
