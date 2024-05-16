package lab06;

public class Circle implements IShape {

	private int radius;

	/**
	 * 원 생성자
	 * 
	 * @param radius 원의 반지름
	 */
	public Circle(int radius) {
		this.radius = radius;
	}

	/**
	 * radius getter
	 * 
	 * @return 원의 반지름
	 */
	public int getRadius() {
		return radius;
	}

	/**
	 * radius setter
	 * 
	 * @param radius 원의 반지름
	 */
	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public float getArea() {
		return PI * radius * radius;
	}
}
