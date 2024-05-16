package lab13;

public class Student {
	int id;
	String name;
	int score;
	int height;
	int weight;

	public Student(int id, String name, int score, int height, int weight) {
		this.id = id;
		this.name = name;
		this.score = score;
		this.height = height;
		this.weight = weight;
	}

	/**
	 * 학생의 BMI 계산
	 * @return 학생의 BMI
	 */
	public double getBmi() {
		double heightInMeter = height / 100.0;
		return weight / heightInMeter / heightInMeter;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", score=");
		builder.append(score);
		builder.append(", height=");
		builder.append(height);
		builder.append(", weight=");
		builder.append(weight);
		builder.append("]");
		return builder.toString();
	}
}
