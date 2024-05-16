package lab06;

public class ProfessorWithDepartment extends Professor {

	private String department;

	/**
	 * 학과 정보를 가진 교수 생성자
	 * 
	 * @param id         교수의 id
	 * @param name       교수의 이름
	 * @param department 교수의 학과
	 */
	public ProfessorWithDepartment(int id, String name, String department) {
		super(id, name);
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
		builder.append("ProfessorWithDepartment [department=");
		builder.append(department);
		builder.append("]");
		return builder.toString();
	}
}
