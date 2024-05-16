package lab11;

public class Main {

	public static void main(String[] args) {
		// 1. 배열로 구현한 정렬, 삭제, 검색
		{
			ArrayManager m = new ArrayManager(5);

			m.input();
			System.out.println(m);

			m.insertionSort();
			System.out.println(m);

			System.out.println(m.find("kim"));

			m.removeAll("lee");
			System.out.println(m);
		}

		// 2. 리스트로 구현한 정렬, 삭제, 검색
		{
			ListManager m = new ListManager();

			m.insert(new Student(25, "kim", 100));
			m.insert(new Student(42, "kim", 100));
			m.insert(new Student(94, "kim", 100));
			m.insert(new Student(11, "kim", 100));
			m.insert(new Student(120, "kim", 100));

			m.remove("kim");
			System.out.println(m);
		}
	}

}
