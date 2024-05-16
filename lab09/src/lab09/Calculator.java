package lab09;

public class Calculator {
	
	/**
	 * 반복문으로 base의 exponent 승 구하기
	 * @param base 밑
	 * @param exponent 지수
	 * @return base^exponent 값
	 */
	public double power(double base, int exponent) {
		double result = 1;
		for (int i = 0; i < exponent; i++) {
			result *= base;
		}

		return result;
	}

	/**
	 * 반복문으로 팩토리얼 계산하기
	 * @param n 팩토리얼 계산에 쓸 n값
	 * @return n! 값
	 */
	public double factorial(int n) {
		double result = 1;
		for (int i = 2; i <= n; i++) {
			result *= i;
		}

		return result;
	}
}
