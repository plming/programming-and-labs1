package finalexam;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		// 1번 문제
		{
			Correlation p = new Correlation(5);
			p.set();
			System.out.println(p.cor1());
			System.out.println(p.cor2());
		}

		// 2번 문제
		{
			// 학생 수 입력
			System.out.print("학생 수 입력: ");
			int numStudents = s.nextInt();

			StudentManager m = new StudentManager(numStudents);
			for (int i = 0; i < numStudents; i++) {
				System.out.printf("[%d/%d] 이름 기록 키 체중 입력: ", i + 1, numStudents);
				// 오름차순 삽입, 배열로 구현
				m.insertByRecord(new Student(s.next(), s.nextDouble(), s.nextInt(), s.nextInt()));
			}

			// 전체출력
			System.out.println("[전체 학생 정보 출력]");
			System.out.println(m);

			// 학생 키로 검색한 결과 출력
			System.out.print("검색할 학생의 키 입력: ");
			int height = s.nextInt();
			System.out.println(m.searchByHeight(height));
		}
	}

}
