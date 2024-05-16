package lab07;

public class Calculator {

	public int add(int num1, int num2) {
		return num1 + num2;
	}

	public double add(double num1, double num2) {
		return num1 + num2;
	}

	public int subtract(int num1, int num2) {
		return num1 - num2;
	}

	public double subtract(double num1, double num2) {
		return num1 - num2;
	}

	public int multiply(int num1, int num2) {
		int result = 0;
		for (int i = 0; i < num2; i++) {
			result = add(result, num1);
		}

		return result;
	}

	public double multiply(double num1, double num2) {
		return num1 * num2;
	}

	public double multiply(double num1, double num2, double num3) {
		return multiply(num1, multiply(num2, num3));
	}

	public int divide(int num1, int num2) {
		int quotient = 0;
		while (num1 > num2) {
			num1 = subtract(num1, num2);
			quotient++;
		}

		return quotient;
	}

	public double divide(double num1, double num2) {
		return num1 / num2;
	}

	public int factorial(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result = multiply(result, i);
		}

		return result;
	}

	public int power(int base, int exponent) {
		int result = 1;
		for (int i = 0; i < exponent; ++i) {
			result = multiply(result, base);
		}

		return result;
	}
}
