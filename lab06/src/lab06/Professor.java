package lab06;

public class Professor {

	private int id;
	private String name;

	/**
	 * 교수 생성자
	 * 
	 * @param id   교수의 id
	 * @param name 이름
	 */
	public Professor(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Professor [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
}
