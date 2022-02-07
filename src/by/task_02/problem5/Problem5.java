package by.task_02.problem5;

import java.util.Scanner;

//Cоставить программу определения наименьшего из двух чисел A и B.

public class Problem5 {

	public static void main(String[] args) {
		int a, b;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert valeu a");
		a = sc.nextInt();
		System.out.println("Please insert value b");
		b = sc.nextInt();

		if (a < b) {
			System.out.println(a);
		} else if (b < a) {
			System.out.println(b);
		} else {
			System.out.println("a aquals b");
		}
	}
}
