package lab06;

public class Cone extends Circle {

	private int height;

	/**
	 * 원뿔 생성자
	 * 
	 * @param radius 밑면의 반지름
	 * @param height 원뿔의 높이
	 */
	public Cone(int radius, int height) {
		super(radius);
		this.height = height;
	}

	/**
	 * 원뿔의 부피를 반환
	 * 
	 * @return 원뿔의 부피
	 */
	public float getVolume() {
		return super.getArea() * height / 3.0F;
	}

	@Override
	public float getArea() {
		int r = getRadius();
		return super.getArea() + PI * r * (float) Math.sqrt(r * r + height * height);
	}
}
