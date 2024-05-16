package lab13;

public class Main {
    public static void main(String[] args) {
        StudentManager m = new StudentManager(5);
        m.add(new Student(0, "kim", 100, 170, 100));
        m.add(new Student(1, "kim", 70, 180, 90));
        m.add(new Student(2, "kim", 68, 160, 100));
        m.add(new Student(3, "kim", 80, 160, 75));
        m.add(new Student(4, "kim", 90, 170, 72));

        System.out.println("키와 몸무게의 상관관계: " + StatisticalAnalyzer.getCorrBetween(m.getHeights(), m.getWeights()));
        System.out.println("몸무게와 BMI의 상관관계: " + StatisticalAnalyzer.getCorrBetween(m.getWeights(), m.getBmis()));
    }
}

