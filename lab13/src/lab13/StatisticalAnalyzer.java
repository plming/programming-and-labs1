package lab13;

public class StatisticalAnalyzer {

	/**
	 * 평균 구하기
	 * 
	 * @param data 평균을 구할 데이터
	 * @return data의 평균
	 */
	public static double getAverage(double[] data) {
		double sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}

		return sum / data.length;
	}

	/**
	 * 표준편차 구하기
	 * 
	 * @param data 표준편차를 구할 데이터
	 * @return data의 표준편차
	 */
	public static double getStdDev(double[] data) {
		double average = getAverage(data);
		double sum = 0;
		for (int i = 0; i < data.length; i++) {
			double deviation = data[i] - average;
			sum += deviation * deviation;
		}

		return Math.sqrt(sum / (data.length - 1));
	}

	/**
	 * x와 y의 상관계수 구하기
	 * 
	 * @param x 변인 x
	 * @param y 변인 y
	 * @return x와 y의 상관계수, x와 y의 length가 다를 경우 NaN
	 */
	public static double getCorrBetween(double[] x, double[] y) {
		if (x.length != y.length) {
			return Double.NaN;
		}

		double sum = 0;
		double xAverage = getAverage(x);
		double yAverage = getAverage(y);
		for (int i = 0; i < x.length; i++) {
			sum += (x[i] - xAverage) * (y[i] - yAverage);
		}

		return sum / (x.length - 1) / (getStdDev(x) * getStdDev(y));
	}
}
