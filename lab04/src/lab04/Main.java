package lab04;

public class Main {
    public static void main(String[] args) {
        ScoreManager manager = new ScoreManager();

        manager.inputScores(3);
        manager.printAverageByStudent();
        manager.printAverageBySubject();
    }
}
