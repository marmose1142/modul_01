package by.task_02.problem29;

import java.util.Scanner;

/*Даны три точки A(x1,y1),B(x2,y2),C(x3,y3).Определить будут ли они расположены
 *  на одной прямой.*/

public class Problem29 {

	public static void main(String[] args) {
		int x1, y1, x2, y2, x3, y3;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value x1");
		x1 = sc.nextInt();
		System.out.println("Please, insert value y1");
		y1 = sc.nextInt();
		System.out.println("Please, insert value x2");
		x2 = sc.nextInt();
		System.out.println("Please, insert value y2");
		y2 = sc.nextInt();
		System.out.println("Please, insert value x3");
		x3 = sc.nextInt();
		System.out.println("Please, insert value y3");
		y3 = sc.nextInt();

		if (y1 == 0 & y2 == 0 & y3 == 0) {
			System.out.println("located on the same straight line ");
		} else if (x1 == 0 & x2 == 0 & x3 == 0) {
			System.out.println("located on the same straight line ");
		} else {
			System.out.println("not located on the same straight line ");
		}

	}
}