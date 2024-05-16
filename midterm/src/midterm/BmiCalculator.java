package midterm;

import java.util.Scanner;

public class BmiCalculator {
    private float[] weights;
    private float[] heights;

    public void inputData(int numStudents) {
        weights = new float[numStudents];
        heights = new float[numStudents];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%2d번째 학생의 몸무게를 입력하세요(단위 kg): ", i + 1);
            weights[i] = scanner.nextFloat();

            System.out.printf("%2d번째 학생의 키를 입력하세요(단위 m): ", i + 1);
            heights[i] = scanner.nextFloat();
        }
        scanner.close();
    }

    public float getBmiAverage() {
        float[] bmi = getBmi();
        float sumOfBmi = 0;
        for (int i = 0; i < bmi.length; i++) {
            sumOfBmi += bmi[i];
        }

        return sumOfBmi / bmi.length;
    }

    public float getMaxBmi() {
        float[] bmi = getBmi();
        float maxBmi = -Float.MAX_VALUE;

        for (int i = 0; i < bmi.length; i++) {
            maxBmi = Math.max(bmi[i], maxBmi);
        }

        return maxBmi;
    }

    public float getMinBmi() {
        float[] bmi = getBmi();
        float minBmi = Float.MAX_VALUE;

        for (int i = 0; i < bmi.length; i++) {
            minBmi = Math.min(bmi[i], minBmi);
        }

        return minBmi;
    }

    public void printBmiList() {
        float[] bmi = getBmi();

        for (int i = 0; i < bmi.length; i++) {
            System.out.printf("%2d번째 학생의 bmi값: %f%n", i + 1, bmi[i]);
        }
    }

    private float[] getBmi() {
        float[] result = new float[weights.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = weights[i] / heights[i] / heights[i];
        }

        return result;
    }
}
