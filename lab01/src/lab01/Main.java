package lab01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner 개체 생성
        Scanner scanner = new Scanner(System.in);

        // 두 수를 입력받음
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // 사칙연산 수행(나눗셈은 double형으로 캐스팅)
        System.out.printf("%d + %d = %d\n", a, b, add(a, b));
        System.out.printf("%d - %d = %d\n", a, b, a - b);
        System.out.printf("%d * %d = %d\n", a, b, a * b);
        System.out.printf("%d / %d = %f\n", a, b, divide(a, b));

        // 평균 계산
        System.out.printf("avg: %f\n", divide(add(a, b), 2));

        scanner.close();
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static double divide(int num1, int num2) {
        return (double) num1 / num2;
    }
}