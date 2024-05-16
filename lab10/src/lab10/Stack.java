package lab10;

public class Stack {
	private Student top;

	/**
	 * 스택에 push
	 * 
	 * @param element push할 원소
	 * @return push가 되면 true, 그렇지 않을 경우 false
	 */
	public boolean push(Student element) {
		if (element == null) {
			return false;
		}

		element.setNext(top);
		top = element;
		return true;
	}

	/**
	 * 스택에서 pop
	 * 
	 * @return pop된 원소, 스택에 원소가 없을 경우 null
	 */
	public Student popOrNull() {
		Student result = top;
		top.setNext(top.getNext());
		return result;
	}

	/**
	 * 스택에서 원소 찾기
	 * 
	 * @param element 찾을 원소
	 * @return 일치하는 가장 처음으로 만나는 원소
	 */
	public Student find(Student element) {
		Student cursor = top;
		while (cursor != null) {
			if (cursor.equals(element)) {
				return cursor;
			}

			cursor = cursor.getNext();
		}

		return null;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		Student cursor = top;
		while (cursor != null) {
			builder.append(cursor);
			builder.append(System.lineSeparator());
			cursor = cursor.getNext();
		}

		return builder.toString();
	}
}
