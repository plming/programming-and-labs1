package lab12;

public class ListQueue {

	private Student front;
	private Student rear;

	public boolean isEmpty() {
		return front == null;
	}

	public void add(Student s) {
		if (isEmpty()) {
			front = s;
			rear = s;
			s.next = null;
			return;
		}

		rear.next = s;
		rear = s;
	}

	public Student delete() {
		if (isEmpty()) {
			return null;
		}

		Student result = front;
		front = front.next;
		return result;
	}

	public Student find(String name) {
		Student cursor = front;
		while (cursor != null) {
			if (cursor.name.equals(name)) {
				return cursor;
			}
			
			cursor = cursor.next;
		}

		return null;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		Student cursor = front;
		while (cursor != null) {
			builder.append(cursor);
			builder.append(System.lineSeparator());
			cursor = cursor.next;
		}

		return builder.toString();
	}
}
