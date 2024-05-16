package lab07;

public class MaxCalculator extends MeanCalculator {

	public int getMaxValue() {
		return super.data[getIndexOfMaxValue()];
	}

	public int getIndexOfMaxValue() {
		int indexOfMaxValue = 0;
		for (int i = 1; i < super.data.length; ++i) {
			if (super.data[i] > super.data[indexOfMaxValue]) {
				indexOfMaxValue = i;
			}
		}

		return indexOfMaxValue;
	}
}
