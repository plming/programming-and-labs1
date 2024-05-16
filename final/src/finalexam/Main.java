package finalexam;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		// 1�� ����
		{
			Correlation p = new Correlation(5);
			p.set();
			System.out.println(p.cor1());
			System.out.println(p.cor2());
		}

		// 2�� ����
		{
			// �л� �� �Է�
			System.out.print("�л� �� �Է�: ");
			int numStudents = s.nextInt();

			StudentManager m = new StudentManager(numStudents);
			for (int i = 0; i < numStudents; i++) {
				System.out.printf("[%d/%d] �̸� ��� Ű ü�� �Է�: ", i + 1, numStudents);
				// �������� ����, �迭�� ����
				m.insertByRecord(new Student(s.next(), s.nextDouble(), s.nextInt(), s.nextInt()));
			}

			// ��ü���
			System.out.println("[��ü �л� ���� ���]");
			System.out.println(m);

			// �л� Ű�� �˻��� ��� ���
			System.out.print("�˻��� �л��� Ű �Է�: ");
			int height = s.nextInt();
			System.out.println(m.searchByHeight(height));
		}
	}

}
