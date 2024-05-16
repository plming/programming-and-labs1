package lab12;

public class Student {

	int id;
	String name;
	int score;
	Student next;

	public Student(int id, String name, int score) {
		this.id = id;
		this.name = name;
		this.score = score;
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
		builder.append("]");
		return builder.toString();
	}
}
