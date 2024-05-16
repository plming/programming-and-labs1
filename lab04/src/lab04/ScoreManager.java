package lab04;

import java.util.Scanner;

public class ScoreManager {
    private int[] koreanScores;
    private int[] mathScores;
    private int[] englishScores;

    /**
     * 학생의 성적 입력
     *
     * @param numStudents 학생의 수
     */
    public void inputScores(int numStudents) {
        this.koreanScores = new int[numStudents];
        this.mathScores = new int[numStudents];
        this.englishScores = new int[numStudents];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numStudents; ++i) {
            System.out.printf("%2d번 학생 성적 입력(국어 수학 영어): ", i + 1);
            this.koreanScores[i] = scanner.nextInt();
            this.mathScores[i] = scanner.nextInt();
            this.englishScores[i] = scanner.nextInt();
        }
        scanner.close();
    }

    /**
     * 학생별 평균 성적 출력
     */
    public void printAverageByStudent() {
        final int numStudents = this.koreanScores.length;
        for (int i = 0; i < numStudents; ++i) {
            float average = (float) (this.koreanScores[i] + this.englishScores[i] + this.mathScores[i]) / 3;
            System.out.printf("%2d번 학생 평균: %.2f", i + 1, average);
            System.out.println();
        }
    }

    /**
     * 과목별 평균 성적 출력
     */
    public void printAverageBySubject() {
        final int numStudents = this.koreanScores.length;

        int koreanScoreSum = 0;
        for (int i = 0; i < this.koreanScores.length; ++i) {
            koreanScoreSum += this.koreanScores[i];
        }

        int mathScoreSum = 0;
        for (int i = 0; i < this.mathScores.length; ++i) {
            mathScoreSum += this.mathScores[i];
        }

        int englishScoreSum = 0;
        for (int i = 0; i < this.englishScores.length; ++i) {
            englishScoreSum += this.englishScores[i];
        }

        System.out.println("국어 평균: " + (float) koreanScoreSum / numStudents);
        System.out.println("수학 평균: " + (float) mathScoreSum / numStudents);
        System.out.println("영어 평균: " + (float) englishScoreSum / numStudents);
    }
}
