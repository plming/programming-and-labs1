package lab06;

public class StudentWithInformations extends StudentWithDepartment {

	private String address;

	/**
	 * 학과, 주소 정보를 가진 학생 생성
	 * 
	 * @param id         학생의 id
	 * @param name       학생의 이름
	 * @param score      학생의 점수
	 * @param department 학생의 학과
	 * @param address    학생의 주소
	 */
	public StudentWithInformations(int id, String name, int score, String department, String address) {
		super(id, name, score, department);
		this.address = address;
	}

	/**
	 * 점수를 통해 학생의 성적 반환
	 * 
	 * @return 학생의 성적
	 */
	public String getGrade() {
		if (super.score > 95) {
			return "A+";
		} else if (super.score > 90) {
			return "A0";
		} else if (super.score > 85) {
			return "B+";
		} else if (super.score > 80) {
			return "B0";
		} else if (super.score > 75) {
			return "C+";
		} else if (super.score > 70) {
			return "C0";
		} else if (super.score > 65) {
			return "D+";
		} else if (super.score > 60) {
			return "D0";
		} else {
			return "F";
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" -> ");
		builder.append("StudentWithInformations [grade=");
		builder.append(getGrade());
		builder.append(", address=");
		builder.append(address);
		builder.append("]");
		return builder.toString();
	}
}
