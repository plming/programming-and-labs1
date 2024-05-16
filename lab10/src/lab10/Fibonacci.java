package lab10;

public class Fibonacci {

	/**
	 * 피보나치 수열의 일반항 구하기
	 * 
	 * @param n 수열의 일반항
	 * @return 피보나치 수열의 n번항
	 */
	public int get(int n) {
		if (n == 1 || n == 2 || n == 3) {
			return 1;
		}

		return 2 * get(n - 1) + 3 * get(n - 2) + get(n - 3);
	}

	/**
	 * 피보나치 수열의 합을 구하기
	 * 
	 * @param n 합을 구할 원소의 갯수
	 * @return 수열의 합
	 */
	public int getSum(int n) {
		int result = 0;
		for (int i = 1; i <= n; i++) {
			result += get(i);
		}

		return result;
	}
}
