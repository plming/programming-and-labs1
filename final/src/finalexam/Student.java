package finalexam;

public class Student {
	String name;
	double record;
	int height;
	int weight;

	public Student(String name, double record, int height, int weight) {
		this.name = name;
		this.record = record;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [name=");
		builder.append(name);
		builder.append(", record=");
		builder.append(record);
		builder.append(", height=");
		builder.append(height);
		builder.append(", weight=");
		builder.append(weight);
		builder.append("]");
		return builder.toString();
	}
}
