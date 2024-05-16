package lab10;

public class Sequence {
	private int a;
	private int r;

	/**
	 * 등비수열 생성자
	 * 
	 * @param a 초항
	 * @param r 공비
	 */
	public Sequence(int a, int r) {
		this.a = a;
		this.r = r;
	}

	/**
	 * 등비수열의 합 구하기
	 * 
	 * @param n 합을 구할 항의 갯수
	 * @return 등비수열의 합
	 */
	public double sum(int n) {
		int result = 0;
		int current = a;
		for (int i = 0; i < n; i++) {
			result += current;
			current *= r;
		}

		return result;
	}
}
