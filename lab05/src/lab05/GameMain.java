package lab05;

import java.util.Scanner;

public class GameMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();

        game.printTitle();
        System.out.print("게임을 플레이할 횟수 입력: ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; ++i) {
            System.out.print("맞출 횟수 입력: ");
            int maxCount = scanner.nextInt();
            System.out.print("이번 게임의 점수 입력: ");
            int score = scanner.nextInt();

            game.play(maxCount, score);
        }
    }
}
