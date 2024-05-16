package lab13;

public class StudentManager {
	private Student[] data;
	private int size;

	public StudentManager(int numStudents) {
		this.data = new Student[numStudents];
	}

	/**
	 * 배열에 학생 추가
	 * 
	 * @param s 배열에 추가할 학생 객체
	 * @return 성공 시 true, 배열이 full할 경우 false
	 */
	public boolean add(Student s) {
		if (size == data.length) {
			return false;
		}

		data[size++] = s;
		return true;
	}

	/**
	 * 학생들의 점수를 배열로 전환
	 * 
	 * @return 점수를 담은 double 배열
	 */
	public double[] getScores() {
		double[] scores = new double[this.size];
		for (int i = 0; i < size; i++) {
			scores[i] = data[i].score;
		}
		return scores;
	}

	/**
	 * 학생들의 키를 배열로 전환
	 * 
	 * @return 키를 담은 double 배열
	 */
	public double[] getHeights() {
		double[] heights = new double[this.size];
		for (int i = 0; i < size; i++) {
			heights[i] = data[i].height;
		}
		return heights;
	}

	/**
	 * 학생들의 몸무게를 배열로 전환
	 * 
	 * @return 몸무게를 담은 double 배열
	 */
	public double[] getWeights() {
		double[] weights = new double[this.size];
		for (int i = 0; i < size; i++) {
			weights[i] = data[i].weight;
		}
		return weights;
	}

	/**
	 * 학생들의 BMI를 배열로 전환
	 * 
	 * @return BMI를 담은 double 배열
	 */
	public double[] getBmis() {
		double[] bmis = new double[this.size];
		for (int i = 0; i < size; i++) {
			bmis[i] = data[i].getBmi();
		}
		return bmis;
	}
}
