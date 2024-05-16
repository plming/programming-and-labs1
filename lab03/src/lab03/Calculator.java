package lab03;

public class Calculator {
    /**
     * 약수 여부 판별
     *
     * @param num     피제수
     * @param divisor 제수
     * @return divisor가 num의 약수일 경우 true, 아닐 경우 false
     */
    public boolean isDivisor(int num, int divisor) {
        return num % divisor == 0;
    }

    /**
     * 최대공약수 구하기
     *
     * @param num1 최대공약수를 구할 수
     * @param num2 최대공약수를 구할 수
     * @return num1과 num2의 최대공약수
     */
    public int getGreatestCommonDivisor(int num1, int num2) {
        int gcd = -1;
        for (int i = 1; i <= num1; ++i) {
            if (isDivisor(num1, i) && isDivisor(num2, i)) {
                gcd = i;
            }
        }
        return gcd;
    }

    /**
     * 최소공배수 구하기
     *
     * @param num1 최소공배수를 구할 수
     * @param num2 최소공배수를 구할 수
     * @return num1과 num2의 최소공배수
     */
    public int getLeastCommonMultiple(int num1, int num2) {
        return num1 * num2 / getGreatestCommonDivisor(num1, num2);
    }

    /**
     * 공약수 출력
     *
     * @param num1 공약수를 구할 수
     * @param num2 공약수를 구할 수
     */
    public void printCommonDivisors(int num1, int num2) {
        for (int i = 1; i <= num1; ++i) {
            if (isDivisor(num1, i) && isDivisor(num2, i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    /**
     * 공배수 출력
     *
     * @param num1   공배수를 구할 수
     * @param num2   공배수를 구할 수
     * @param length 출력할 공배수의 갯수
     */
    public void printCommonMultiples(int num1, int num2, int length) {
        for (int i = 1; i <= length; ++i) {
            System.out.print(getLeastCommonMultiple(num1, num2) * i + " ");
        }
        System.out.println();
    }
}
