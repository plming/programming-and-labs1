package lab06;

public class Student {

	protected int score;
	private int id;
	private String name;

	/**
	 * 학생 생성자
	 * 
	 * @param id    학생의 id
	 * @param name  학생의 이름
	 * @param score 학생의 점수
	 */
	public Student(int id, String name, int score) {
		this.id = id;
		this.name = name;
		this.score = Math.max(Math.min(100, score), 0);
	}

	/**
	 * 점수 변경하기
	 * 
	 * @param score 변경할 점수
	 */
	public void setScore(int score) {
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
