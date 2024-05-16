package lab09;

public class Taylor extends Calculator {
	private int level;

	/**
	 * Taylor 급수의 n값 정하기
	 * 
	 * @param level Taylor 급수의 n값
	 */
	public Taylor(int level) {
		this.level = level;
	}

	/**
	 * Taylor 급수를 이용하여 e^x의 근사값 구하기
	 * 
	 * @param x 지수
	 * @return e^x의 근사값
	 */
	public double exponent(double x) {
		double result = 1;
		for (int i = 1; i <= level; i++) {
			double current = power(x, i) / factorial(i);
			result += current;
		}
		return result;
	}

	/**
	 * 팩토리얼을 통해 조합 계산하기
	 * 
	 * @param n 조합의 n값
	 * @param r 조합의 r값
	 * @return nCr 값
	 */
	public int combination(int n, int r) {
		return (int) (factorial(n) / factorial(r) / factorial(n - r));
	}

}
