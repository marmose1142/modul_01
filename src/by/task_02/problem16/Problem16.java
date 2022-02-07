package by.task_02.problem16;

import java.util.Scanner;

/*На плоскости ХОУ задана своими координатами точка А. Указать где она
 *  расположена(на какой оси или в каком координатном угле)*/

public class Problem16 {

	public static void main(String[] args) {
		int x, y;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert coordinate value x");
		x = sc.nextInt();
		System.out.println("Please, insert coordinate value y");
		y = sc.nextInt();

		if ((x < 0 | x > 0) & y == 0) {
			System.out.println("the point is located on the axis x");
		} else if ((y < 0 | y > 0) & x == 0) {
			System.out.println("the point is located on the axis y");
		} else if (x > 0 & y > 0) {
			System.out.println("first quarter");
		} else if (x < 0 & y > 0) {
			System.out.println("second quarter");
		} else if (x < 0 & y < 0) {
			System.out.println("third quarter");
		} else if (x > 0 & y < 0) {
			System.out.println("fourth quarter");
		} else {
			System.out.println("x = o and y = 0");
		}

	}
}
