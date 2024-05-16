package finalexam;

import java.util.Scanner;

public class Correlation {
    private Student[] students;

    public Correlation(int numStudents) {
        students = new Student[numStudents];
    }

    public void set() {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(s.next(), s.nextDouble(), s.nextInt(), s.nextInt());
        }
    }

    public double cor1() {
        return getCorr(getRecords(), getHeights());
    }

    public double cor2() {
        return getCorr(getRecords(), getWeights());
    }

    private double[] getHeights() {
        double[] result = new double[students.length];
        for (int i = 0; i < students.length; i++) {
            result[i] = students[i].height;
        }

        return result;
    }

    private double[] getRecords() {
        double[] result = new double[students.length];
        for (int i = 0; i < students.length; i++) {
            result[i] = students[i].record;
        }

        return result;
    }

    private double[] getWeights() {
        double[] result = new double[students.length];
        for (int i = 0; i < students.length; i++) {
            result[i] = students[i].weight;
        }

        return result;
    }

    private static double getAverage(double[] x) {
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }

        return sum / x.length;
    }

    private static double getStdv(double[] x) {
        double sum = 0;
        double average = getAverage(x);
        for (int i = 0; i < x.length; i++) {
            sum += (x[i] - average) * (x[i] - average);
        }

        return Math.sqrt(sum / (x.length - 1));
    }

    private static double getCorr(double[] x, double[] y) {
        if (x.length != y.length) {
            return Double.NaN;
        }

        final double xAverage = getAverage(x);
        final double yAverage = getAverage(y);
        final double xStdv = getStdv(x);
        final double yStdv = getStdv(y);
        double sum = 0;

        for (int i = 0; i < x.length; i++) {
            sum += (x[i] - xAverage) * (y[i] - yAverage);
        }

        return sum / (x.length - 1) / (xStdv * yStdv);
    }
}
