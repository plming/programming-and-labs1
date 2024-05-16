package lab07;

public class Main {
    public static void main(String[] args) {
        // 1. 지수승, 팩토리얼 계산
        {
            Calculator c = new Calculator();

            int num1 = 42;
            int num2 = 5;

            assert (c.add(num1, num2) == 47);
            assert (c.subtract(num1, num2) == 37);
            assert (c.multiply(num1, num2) == 210);
            assert (c.divide(num1, num2) == 8);

            assert (c.factorial(num2) == 120);
            assert (c.power(2, num2) == 32);
        }

        // 2. 조화평균, 기하평균 계산
        {
            MeanCalculator c = new MeanCalculator();

            assert (compareWithEpsilon(c.getArithmeticMean(3, 2), 2.5));
            assert (compareWithEpsilon(c.getHarmonicMean(3, 2), 2.4));
            assert (compareWithEpsilon(c.getGeometricMean(3, 2), 2.4495));
        }

        // 3. 여러 수의 조화평균과 기하평균 계산
        {
            System.out.println("# 테스트 3");
            MeanCalculator c = new MeanCalculator();

            c.setData(3);

            System.out.println(c.getArithmeticMean());
            System.out.println(c.getGeometricMean());
            System.out.println(c.getHarmonicMean());
        }

        // 4. 국어 성적 최대값, 수학 성적 최대값, 평균 최대값과 그 학생의 id를 출력하기
        {
            System.out.println("# 테스트 4");
            ScoreAnalyzer analyzer = new ScoreAnalyzer(3);

            analyzer.setScores();

            analyzer.printMaxKoreanScore();
            analyzer.printMaxMathScore();
            analyzer.printMaxAverage();
        }
    }

    public static boolean compareWithEpsilon(double a, double b) {
        return Math.abs(a - b) < 1e-4;
    }
}
