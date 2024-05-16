package midterm;

public class SqrtCalculator {
	public double getSquareRoot(double number) {
		if (number < 0) {
			return Double.NaN;
		}

		final int MAX_EPOCH = 10000;
		final double RATE = 0.001F;

		double expected = 0;

		for (int epoch = 0; epoch < MAX_EPOCH; epoch++) {
			double cost = expected * expected - number;

			expected += RATE * -cost;
		}

		return expected;
	}
}
