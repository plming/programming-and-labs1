package lab07;

import java.util.Scanner;

public class ScoreAnalyzer {

	private int[] koreanScores;
	private int[] mathScores;

	public ScoreAnalyzer(int numStudents) {
		koreanScores = new int[numStudents];
		mathScores = new int[numStudents];
	}

	public void setScores() {
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < koreanScores.length; i++) {
			System.out.printf("%2d번 학생의 국어 성적 입력: ", i);
			koreanScores[i] = scanner.nextInt();

			System.out.printf("%2d번 학생의 수학 성적 입력: ", i);
			mathScores[i] = scanner.nextInt();
		}
	}

	public void printMaxKoreanScore() {
		MaxCalculator c = new MaxCalculator();

		c.setData(koreanScores);

		int id = c.getIndexOfMaxValue();
		System.out.printf("국어 성적 최댓값: %3d (id: %2d)%n", koreanScores[id], id);
	}

	public void printMaxMathScore() {
		MaxCalculator c = new MaxCalculator();

		c.setData(mathScores);

		int id = c.getIndexOfMaxValue();
		System.out.printf("수학 성적 최댓값: %3d (id: %2d)%n", mathScores[id], id);
	}

	public void printMaxAverage() {
		MeanCalculator c = new MeanCalculator();

		c.setData(koreanScores);
		double koreanAverage = c.getArithmeticMean();

		c.setData(mathScores);
		double mathAverage = c.getArithmeticMean();

		if (koreanAverage > mathAverage) {
			System.out.printf("국어 평균이 더 큽니다: %.2f%n", koreanAverage);
		} else {
			System.out.printf("수학 평균이 더 큽니다: %.2f%n", mathAverage);
		}
	}
}
