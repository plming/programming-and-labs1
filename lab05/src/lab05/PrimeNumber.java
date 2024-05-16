package lab05;

public class PrimeNumber {
    /**
     * 소수들의 합 구하기
     *
     * @param range 소수를 구할 구간
     * @return [1, range] 구간 내 소수들의 합
     */
    public int getSumOfPrimeNumbers(int range) {
        int sum = 0;
        for (int number = 1; number <= range; ++number) {
            if (isPrimeNumber(number)) {
                sum += number;
            }
        }
        return sum;
    }

    /**
     * 주어진 수의 소수 여부를 확인함
     *
     * @param number 소수인지 확인할 수
     * @return number가 소수일 경우 true, 그렇지 않을 경우 false
     */
    public boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i * i <= number; ++i) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}

