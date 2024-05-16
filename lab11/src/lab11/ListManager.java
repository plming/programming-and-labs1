package lab11;

import java.util.Scanner;

public class ListManager {
	private Student head;

	/**
	 * 리스트에 입력
	 * 
	 * @param numStudents 입력할 학생 수
	 */
	public void input(int numStudents) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < numStudents; i++) {
			insert(new Student(scanner.nextInt(), scanner.next(), scanner.nextInt()));
		}
	}

	/**
	 * 리스트에 학생 객체 삽입
	 * 
	 * @param student 삽입할 학생 객체
	 */
	public void insert(Student student) {
		// 1. 리스트가 비어있을 경우 & 리스트의 첫 노드로 삽입해야 하는 경우
		if (head == null || student.getId() < head.getId()) {
			student.setNext(head);
			head = student;
			return;
		}

		// 2. 첫 노드 이후에 삽입해야 하는 경우
		Student prev = head;
		Student current = head.getNext();
		while (current != null) {
			if (student.getId() > prev.getId() && student.getId() < current.getId()) {
				break;
			}

			prev = current;
			current = current.getNext();
		}

		student.setNext(current);
		prev.setNext(student);
	}

	/**
	 * 리스트에서 특정 이름의 학생 객체 검색
	 * 
	 * @param name 찾을 학생의 이름
	 * @return 이름이 같은 학생 객체, 없을 시 null
	 */
	public Student find(String name) {
		Student cursor = head;
		while (cursor != null) {
			if (cursor.getName().equals(name)) {
				return cursor;
			}
		}

		return null;
	}

	/**
	 * 학생 객체 제거
	 * 
	 * @param name 제거할 학생의 이름
	 */
	public void remove(String name) {
		// 1. 첫 노드가 삭제할 노드일 경우
		if (head.getName().equals(name)) {
			head = head.getNext();
			return;
		}

		// 2. 첫 노드 이후 노드가 삭제할 노드일 경우
		Student old = head;
		Student current = head.getNext();
		while (current != null) {
			if (current.getName().equals(name)) {
				current = current.getNext();
				old.setNext(current);
				return;
			}

			old = current;
			current = current.getNext();
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		Student cursor = head;
		while (cursor != null) {
			builder.append(cursor);
			builder.append(System.lineSeparator());
			cursor = cursor.getNext();
		}
		return builder.toString();
	}

}
