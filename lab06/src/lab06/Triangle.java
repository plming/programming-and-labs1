package lab06;

public class Triangle implements IShape {

	private int height;
	private int width;

	/**
	 * 삼각형 생성자
	 * 
	 * @param height 삼각형의 높이
	 * @param width  삼각형의 너비
	 */
	public Triangle(int height, int width) {
		this.height = height;
		this.width = width;
	}

	/**
	 * 삼각형의 높이 반환
	 * 
	 * @return 삼각형의 높이
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * 삼각형의 너비 반환
	 * 
	 * @return 삼각형의 너비
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * 삼각형의 높이 설정
	 * 
	 * @param height 삼각형의 높이
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * 삼각형의 너비 설정
	 * 
	 * @param width 삼각형의 너비
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public float getArea() {
		return (float) height * width / 2;
	}

}
