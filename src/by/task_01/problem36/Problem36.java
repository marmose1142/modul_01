package by.task_01.problem36;

import java.util.Scanner;

/*Для данных областей составить линейную программу, которая печатает true, если
* точка с координатами (x,y) принадлежит закрашенной области , и false в
* противном случае.*/

public class Problem36 {

	public static void main(String[] args) {

		int x, y;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value x ");
		x = sc.nextInt();
		System.out.println("Please, insert value y ");
		y = sc.nextInt();

		if (y + Math.abs(x) <= 4 && y >= 0) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		if ((y >= 0 && y <= 4 && x >= -2 && x <= 2) || (y >= -3 && y <= 0 && x >= -4 && x <= 4)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		if (((x * x + y * y <= 16) && y >= 0 && x >= 0) || ((x * x + y * y <= 25) && y <= 0 && x >= 0)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

}
