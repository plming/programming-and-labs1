package lab12;

public class ArrayQueue {

	private final int size;
	private Student[] arr;
	private int front;
	private int rear;

	public ArrayQueue(int size) {
		this.size = size + 1;
		this.arr = new Student[this.size];
	}

	/**
	 * 큐에 원소 삽입
	 * 
	 * @param s 삽입할 원소
	 * @return 삽입 성공 시 true, 큐가 full해서 실패 시 false
	 */
	public boolean add(Student s) {
		if ((rear + 1) % size == front) {
			return false;
		}

		rear = (rear + 1) % size;

		arr[rear] = s;
		return true;
	}

	/**
	 * 큐에 원소 삭제
	 * 
	 * @return 삭제 성공 시 삭제된 원소, 큐가 empty해서 실패 시 null
	 */
	public Student delete() {
		if (front == rear) {
			return null;
		}

		front = (front + 1) % size;
		return arr[front];
	}

	/**
	 * 큐에서 원소 검색
	 * 
	 * @param name 검색할 원소의 이름
	 * @return 검색을 해서 찾아낸 원소, 없을 시 null
	 */
	public Student search(String name) {
		if (front < rear) {
			for (int i = front + 1; i <= rear; i++) {
				if (arr[i].name.equals(name)) {
					return arr[i];
				}
			}
		} else {
			for (int i = front + 1; i < size; i++) {
				if (arr[i].name.equals(name)) {
					return arr[i];
				}
			}
			for (int i = 0; i <= rear; i++) {
				if (arr[i].name.equals(name)) {
					return arr[i];
				}
			}
		}
		
		return null;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		if (front < rear) {
			for (int i = front + 1; i <= rear; i++) {
				builder.append(arr[i]);
				builder.append(System.lineSeparator());
			}

			return builder.toString();
		} else {
			for (int i = front + 1; i < size; i++) {
				builder.append(arr[i]);
				builder.append(System.lineSeparator());
			}
			for (int i = 0; i <= rear; i++) {
				builder.append(arr[i]);
				builder.append(System.lineSeparator());
			}

			return builder.toString();
		}
	}
}
