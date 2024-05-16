package lab06;

public class StudentWithDepartment extends Student {

	private String department;

	/**
	 * 학과를 가진 학생 생성자
	 * 
	 * @param id         학생의 아이디
	 * @param name       학생의 이름
	 * @param score      학생의 점수
	 * @param department 학생의 학과
	 */
	public StudentWithDepartment(int id, String name, int score, String department) {
		super(id, name, score);
		this.department = department;
	}

	/**
	 * 학과 변경하기
	 * 
	 * @param department 변경할 학과
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" -> ");
		builder.append("StudentWithDepartment [department=");
		builder.append(department);
		builder.append("]");
		return builder.toString();
	}
}
