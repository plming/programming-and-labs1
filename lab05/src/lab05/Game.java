package lab05;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private final Random random;
    private int targetValue;
    private int currentScore;

    public Game() {
        this.random = new Random();
    }

    /**
     * 게임 제목 출력
     */
    public void printTitle() {
        System.out.println("=====수 맞추기 게임=====");
    }

    /**
     * 1회 게임을 플레이 함
     *
     * @param maxCount 시도할 수 있는 횟수
     * @param score    이번 회의 점수 성공 시 점수를 얻고, 실패 시 점수를 잃는다
     */
    public void play(int maxCount, int score) {
        Scanner scanner = new Scanner(System.in);
        setTargetValue();
        for (int i = 0; i < maxCount; ++i) {
            System.out.print("1부터 100 사이의 수 입력: ");
            int guessedValue = scanner.nextInt();

            if (isTargetValue(guessedValue)) {
                this.currentScore += score;
                System.out.printf("[%2d Win] score: %d", i + 1, this.currentScore);
                System.out.println();
                return;
            }

            System.out.printf("[%2d Fail] score: %d", i + 1, this.currentScore);
            System.out.println();
        }

        this.currentScore -= score;
        System.out.printf("[Lose] score: %d", this.currentScore);
        System.out.println();
    }

    /**
     * targetValue인지 확인하기
     *
     * @param value targetValue와 비교할 값
     * @return value가 targetValue일 경우 true, 그렇지 않을 경우 false
     */
    public boolean isTargetValue(int value) {
        return value == this.targetValue;
    }

    /**
     * targetValue를 [1, 100]에서 무작위로 선택함
     */
    private void setTargetValue() {
        this.targetValue = this.random.nextInt(100) + 1;
    }
}
