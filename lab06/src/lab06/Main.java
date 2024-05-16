package lab06;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		{
			StudentWithInformations s1 = new StudentWithInformations(1, "kim", 87, "CE", "Andong");
			System.out.println(s1);
		}

		{
			System.out.print("[사각뿔] 밑변, 높이 입력: ");
			int width = scanner.nextInt();
			int height = scanner.nextInt();
			Pyramid p = new Pyramid(width, height);
			System.out.printf("겉넓이: %f, 부피: %f%n", p.getArea(), p.getVolume());
		}

		{
			System.out.print("[원뿔] 반지름, 높이 입력: ");
			int radius = scanner.nextInt();
			int height = scanner.nextInt();
			Cone c = new Cone(radius, height);
			System.out.printf("겉넓이: %f, 부피: %f%n", c.getArea(), c.getVolume());
		}
		
		scanner.close();
	}
}