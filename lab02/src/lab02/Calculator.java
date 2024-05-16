package lab02;

public class Calculator {
    public Calculator() {
    }

    public long multiply(long num1, long num2) {
        return num1 * num2;
    }

    public long factorial(long n) {
        long result = 1;

        for (int i = 1; i <= n; ++i) {
            result = multiply(result, i);
        }

        return result;
    }

    public long combination(long n, long r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }
}
