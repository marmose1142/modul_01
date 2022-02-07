package by.task_02.problem6;

import java.util.Scanner;

//Составить программу определения наибольшего из двух чисел А и B.

public class Problem6 {

	public static void main(String[] args) {
		int a, b;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value a");
		a = sc.nextInt();
		System.out.println("Please, insert value b");
		b = sc.nextInt();

		if (a > b) {
			System.out.println(a);
		} else if (b > a) {
			System.out.println(b);
		} else {
			System.out.println("A aquals B");
		}

	}

}
