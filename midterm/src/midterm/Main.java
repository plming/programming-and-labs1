package midterm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1번 문제
		{
			Scanner scanner = new Scanner(System.in);
			System.out.print("학생 수 입력: ");
			int numStudents = scanner.nextInt();

			BmiCalculator c = new BmiCalculator();

			c.inputData(numStudents);
			c.printBmiList();

			System.out.println("BMI 평균: " + c.getBmiAverage());
			System.out.println("BMI 최대값: " + c.getMaxBmi());
			System.out.println("BMI 최소값: " + c.getMinBmi());
		}

		// 2번 문제
		{
			SqrtCalculator c = new SqrtCalculator();

			System.out.println("expected: " + c.getSquareRoot(2) + ", real: " + Math.sqrt(2));
			System.out.println("expected: " + c.getSquareRoot(3) + ", real: " + Math.sqrt(3));
			System.out.println("expected: " + c.getSquareRoot(5) + ", real: " + Math.sqrt(5));
			System.out.println("expected: " + c.getSquareRoot(999) + ", real: " + Math.sqrt(999));
			System.out.println("expected: " + c.getSquareRoot(37.24) + ", real: " + Math.sqrt(37.24));
		}
	}
}
