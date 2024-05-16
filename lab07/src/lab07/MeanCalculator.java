package lab07;

import java.util.Scanner;

public class MeanCalculator extends Calculator {
	protected int[] data;

	public void setData(int size) {
		data = new int[size];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < data.length; i++) {
			data[i] = scanner.nextInt();
		}
		scanner.close();
	}

	public void setData(int[] data) {
		this.data = data;
	}

	public double getArithmeticMean() {
		double sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum = add(sum, data[i]);
		}

		return divide(sum, data.length);
	}

	public double getArithmeticMean(int num1, int num2) {
		return divide(add(num1, num2), 2.0);
	}

	public double getGeometricMean() {
		double product = 1;
		for (int i = 0; i < data.length; i++) {
			product = multiply(product, data[i]);
		}

		return Math.pow(product, 1.0 / data.length);
	}

	public double getGeometricMean(int num1, int num2) {
		return Math.sqrt(multiply(num1, num2));
	}

	public double getHarmonicMean() {
		double sumOfInverse = 0;
		for (int i = 0; i < data.length; i++) {
			sumOfInverse = add(sumOfInverse, 1.0 / data[i]);
		}

		return 1.0 / divide(sumOfInverse, data.length);
	}

	public double getHarmonicMean(int num1, int num2) {
		return divide(multiply(2.0, num1, num2), add(num1, num2));
	}
}
