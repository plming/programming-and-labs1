package lab06;

public class Pyramid implements IShape {

	private int width;
	private int height;

	/**
	 * 사각뿔 생성자
	 * 
	 * @param width  사각뿔의 밑면의 길이
	 * @param height 사각뿔의 높이
	 */
	public Pyramid(int width, int height) {
		this.width = width;
		this.height = height;
	}

	/**
	 * 사각뿔의 부피를 반환
	 * 
	 * @return 사각뿔의 부피
	 */
	public float getVolume() {
		return (float) 1 / 3 * width * width * height;
	}

	@Override
	public float getArea() {
		return width * width + height * (float) Math.sqrt(width * width + 4 * height * height);
	}

}
