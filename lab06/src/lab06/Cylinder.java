package lab06;

public class Cylinder extends Circle {

	private int height;

	/**
	 * 원기둥 생성
	 * 
	 * @param radius 밑면의 반지름
	 * @param height 원기둥의 높이
	 */
	public Cylinder(int radius, int height) {
		super(radius);
		this.height = height;
	}

	/**
	 * 원기둥의 높이를 반환
	 * 
	 * @return 원기둥의 높이
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * 원기둥의 부피를 반환
	 * 
	 * @return 원기둥의 부피
	 */
	public float getVolume() {
		return super.getArea() * height;
	}

	/**
	 * 원기둥의 높이를 변경
	 * 
	 * @param height 변경할 원기둥의 높이
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public float getArea() {
		return super.getArea() * 2 + 2 * PI * getRadius() * height;
	}
}
