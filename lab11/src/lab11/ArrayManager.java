package lab11;

import java.util.Scanner;

public class ArrayManager {
	private Student[] data;

	/**
	 * 일정 크기의 배열을 지닌 객체 생성자
	 * 
	 * @param arraySize 배열의 크기
	 */
	public ArrayManager(int arraySize) {
		this.data = new Student[arraySize];
	}

	/**
	 * 배열에 데이터 입력
	 */
	public void input() {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < data.length; i++) {
			data[i] = new Student(scanner.nextInt(), scanner.next(), scanner.nextInt());
		}
	}

	/**
	 * 객체가 지닌 배열에 대해 삽입 정렬을 수행
	 */
	public void insertionSort() {
		int j;
		for (int i = 1; i < data.length; i++) {
			Student temp = data[i];
			for (j = i - 1; j >= 0; j--) {
				if (data[j].getId() > temp.getId()) {
					data[j + 1] = data[j];
				} else {
					break;
				}
			}
			data[j + 1] = temp;
		}
	}

	/**
	 * 배열 중 일치하는 Student 검색
	 * 
	 * @param name 검색할 이름
	 * @return 처음으로 이름이 일치하는 Student, 없을 경우 null
	 */
	public Student find(String name) {
		for (int i = 0; i < data.length; i++) {
			if (data[i].getName().equals(name)) {
				return data[i];
			}
		}

		return null;
	}

	/**
	 * id가 일치하는 모든 학생 삭제
	 * 
	 * @param id 학번
	 */
	public void removeAll(String name) {
		// 1. 삭제할 원소의 갯수 확인
		int numFound = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i].getName().equals(name)) {
				numFound++;
			}
		}

		// 2. 삭제할 원소를 제외하고 기존 배열에 복사
		int dest = 0;
		Student[] temp = new Student[data.length - numFound];
		for (int src = 0; src < data.length; src++) {
			if (data[src].getName().equals(name)) {
				continue;
			}

			temp[dest] = data[src];
			dest++;
		}
		data = temp;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < data.length; i++) {
			builder.append(String.format("[%2d] %s%n", i, data[i]));
		}
		return builder.toString();
	}

}
