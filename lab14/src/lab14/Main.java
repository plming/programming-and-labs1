package lab14;

public class Main {
	public static void main(String[] args) {
		// Binary Search Tree
		String[] names = { "kim", "lee", "kang", "hwang" };

		BinarySearchTree t = new BinarySearchTree();
		for (String n : names) {
			t.add(new Student(0, n, 100));
		}

		System.out.println("== PreOrder ==");
		t.traversal(BinarySearchTree.Order.PRE);
		
		System.out.println("== InOrder ==");
		t.traversal(BinarySearchTree.Order.IN);
		
		System.out.println("== PostOrder ==");
		t.traversal(BinarySearchTree.Order.POST);

		for (String n : names) {
			assertTrue(t.search(n) != null);
		}
	}

	public static void assertTrue(boolean expression) {
		if (!expression) {
			throw new AssertionError();
		}
	}
}
