package lab10;

public class Student {
	private int id;
	private String name;
	private int score;
	private Student next;

	public Student(int id, String name, int score) {
		this.id = id;
		this.name = name;
		this.score = score;
	}

	public Student getNext() {
		return next;
	}

	public void setNext(Student next) {
		this.next = next;
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

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Student)) {
			return false;
		}

		Student s = (Student) obj;
		return s.id == id && s.name.equals(name) && s.score == score;
	}

}
