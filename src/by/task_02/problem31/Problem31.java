package by.task_02.problem31;

import java.util.Scanner;

/*Заданы размеры A,B прямоугольного отверстия и размеры x,y,z кирпича. Определить, пройдет 
 * ли кирпич через отверстие*/

public class Problem31 {

	public static void main(String[] args) {
		int a, b, x, y, z;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value a");
		a = sc.nextInt();
		System.out.println("Please, insert value b");
		b = sc.nextInt();
		System.out.println("Please, insert value x");
		x = sc.nextInt();
		System.out.println("Please, insert value y");
		y = sc.nextInt();
		System.out.println("Please, insert value z");
		z = sc.nextInt();

		if ((x < a & y < b) | (y < a & x < b) | (x < a & z < b) | (z < a & x < b) | (z < a & y < b) | (y < a & z < b)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}
}
