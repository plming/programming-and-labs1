package finalexam;

public class StudentManager {
	private Student[] students;
	
	// 현재 students 배열에 있는 학생의 수
	private int numStudents;

	public StudentManager(int size) {
		students = new Student[size];
	}

	public boolean insertByRecord(Student s) {
		// 배열이 full한 경우 false 반환
		if (numStudents >= students.length) {
			return false;
		}

		if (numStudents == 0) {
			students[numStudents++] = s;
			return true;
		}

		students[numStudents] = s;
		for (int i = numStudents - 1; i >= 0; i--) {
			if (students[i].record > students[i + 1].record) {
				Student temp = students[i + 1];
				students[i + 1] = students[i];
				students[i] = temp;
			} else {
				break;
			}
		}

		numStudents++;
		return true;
	}

	public Student searchByHeight(int height) {
		for (int i = 0; i < numStudents; i++) {
			if (students[i].height == height) {
				return students[i];
			}
		}

		return null;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < numStudents; i++) {
			sb.append(students[i]);
			sb.append(System.lineSeparator());
		}

		return sb.toString();
	}
}
