package lab12;

public class Main {

    public static void main(String[] args) {
        {
            ArrayQueue q = new ArrayQueue(3);

            // 1. 큐에 삽입이 성공적으로 수행됨
            assertTrue(q.add(new Student(1, "kim", 12)));
            assertTrue(q.add(new Student(2, "lee", 12)));
            assertTrue(q.add(new Student(3, "park", 12)));

            // 2. full한 큐에 삽입 시도
            assertTrue(!q.add(new Student(4, "lee", 12)));
            assertTrue(!q.add(new Student(5, "lee", 12)));

            // 3. 큐 toString으로 내부 원소들 보여주기
            System.out.println(q);

            // 4. 큐에서 검색
            System.out.println(q.search("park"));
            System.out.println();

            // 5. 큐에서 삭제를 수행
            System.out.println(q.delete());
            System.out.println(q.delete());
            System.out.println();

            // 6. 큐에 다시 삽입
            assertTrue(q.add(new Student(6, "kim", 12)));

            // 7. 원소를 삭제해서 큐를 비움
            assertTrue(q.delete() != null);
            assertTrue(q.delete() != null);

            // 6. empty한 큐에서 삭제 시도
            assertTrue(q.delete() == null);
        }

        {
            ListQueue q = new ListQueue();

            assertTrue(q.isEmpty());

            // 1. 큐에 삽입
            q.add(new Student(1, "kim", 90));
            q.add(new Student(2, "lee", 90));
            q.add(new Student(3, "park", 90));

            // 2. 큐 상태 확인
            System.out.println(q);

            // 3. 큐 삭제
            System.out.println("Deleted: " + q.delete());
            System.out.println("Deleted: " + q.delete());

            // 4. 큐에 다시 삽입
            q.add(new Student(4, "kim", 90));

            // 5. 큐에 다시 삭제
            System.out.println("Deleted: " + q.delete());
            System.out.println("Deleted: " + q.delete());

            // 6. 큐가 비어있는지 확인
            assertTrue(q.isEmpty());
        }
    }

    public static void assertTrue(boolean expression) {
        if (!expression) {
            throw new AssertionError();
        }
    }

}
