package lab14;

public class BinarySearchTree {
	private Node root;

	/**
	 * 이진 탐색 트리에 객체를 삽입함
	 * 
	 * @param o 삽입할 객체
	 * @return 삽입 성공 시 true, 이미 트리에 존재하여 실패시 false
	 */
	public boolean add(Student o) {
		if (root == null) {
			root = new Node(null, o, null);
			return true;
		}

		Node current = root;
		while (true) {
			int compare = current.data.name.compareTo(o.name);
			if (compare == 0) {
				return false;
			} else if (compare > 0) {
				if (current.left == null) {
					current.left = new Node(null, o, null);
					return true;
				}

				current = current.left;
			} else {
				if (current.right == null) {
					current.right = new Node(null, o, null);
					return true;
				}

				current = current.right;
			}
		}
	}

	/**
	 * 트리를 초기화함
	 */
	public void clear() {
		root = null;
	}

	/**
	 * 이진 탐색을 수행함
	 * 
	 * @param name 찾고자 하는 학생의 이름
	 * @return 찾을 시 해당 객체, 없을 시 null
	 */
	public Student search(String name) {
		Node current = root;
		while (current != null) {
			int compare = current.data.name.compareTo(name);
			if (compare == 0) {
				return current.data;
			} else if (compare > 0) {
				current = current.left;
			} else {
				current = current.right;
			}
		}

		return null;
	}

	/**
	 * 트리를 순회함
	 * 
	 * @param how "pre", "in", "post"
	 */
	public void traversal(Order how) {
		switch (how) {
		case PRE:
			printPreorder(root);
			break;
		case IN:
			printInorder(root);
			break;
		case POST:
			printPostorder(root);
			break;
		default:
			break;
		}
	}

	/**
	 * 트리 n에 대해 중위 순회를 하며 출력함
	 * 
	 * @param n 중위 순회할 트리
	 */
	private void printInorder(Node n) {
		if (n == null) {
			return;
		}

		printInorder(n.left);
		System.out.println(n.data);
		printInorder(n.right);
	}

	/**
	 * 트리 n에 대해 전위 순회를 하며 출력함
	 * 
	 * @param n 전위 순회할 트리
	 */
	private void printPreorder(Node n) {
		if (n == null) {
			return;
		}

		System.out.println(n.data);
		printPreorder(n.left);
		printPreorder(n.right);
	}

	/**
	 * 트리 n에 대해 후위 순회를 하며 출력함
	 * 
	 * @param n 후위 순회할 트리
	 */
	private void printPostorder(Node n) {
		if (n == null) {
			return;
		}

		printPostorder(n.left);
		printPostorder(n.right);
		System.out.println(n.data);
	}

	/**
	 * 객체를 트리로 표현하기 위한 inner class
	 */
	private class Node {
		private Node left;
		private Student data;
		private Node right;

		private Node(Node left, Student data, Node right) {
			this.left = left;
			this.data = data;
			this.right = right;
		}
	}

	public enum Order {
		PRE, IN, POST
	}
}
