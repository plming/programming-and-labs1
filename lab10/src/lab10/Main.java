package lab10;

public class Main {

    public static void main(String[] args) {
        // 1. 스택 리스트 검색
        {
            Stack s = new Stack();
            s.push(new Student(0, "kim", 100));
            s.push(new Student(1, "lee", 90));
            s.push(new Student(2, "park", 80));

            System.out.println(s.find(new Student(1, "lee", 90)));
        }

        // 2. 등비수열의 합
        {
            Sequence s = new Sequence(1, 2);
            assert (s.sum(5) == 31);
        }

        // 3. 피보나치 수열의 합
        {
            Fibonacci f = new Fibonacci();
            assert (f.get(4) == 6);
            assert (f.getSum(4) == 9);
        }

    }
}
