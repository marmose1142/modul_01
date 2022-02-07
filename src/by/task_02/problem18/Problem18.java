package by.task_02.problem18;

import java.util.Scanner;

//Подсчитать количество отрицательных среди чисел ABC.

public class Problem18 {

	public static void main(String[] args) {
		int a, b, c;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value A");
		a = sc.nextInt();
		System.out.println("Please, insert value B");
		b = sc.nextInt();
		System.out.println("Please, insert value C");
		c = sc.nextInt();

		if ((a < 0 & b >= 0 & c >= 0) | (a >= 0 & b < 0 & c >= 0) | (a >= 0 & b >= 0 & c < 0)) {
			System.out.println("One minus number");
		} else if ((a < 0 & b < 0 & c >= 0) | (a < 0 & b >= 0 & c < 0) | (a >= 0 & b < 0 & c < 0)) {
			System.out.println("Two minus number");
		} else if (a < 0 & b < 0 & c < 0) {
			System.out.println("Three minus number");
		} else {
			System.out.println("No minus number");
		}
	}

}
