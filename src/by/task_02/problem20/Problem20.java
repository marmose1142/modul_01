package by.task_02.problem20;

import java.util.Scanner;

//Определить, делителем каких чисел a,b,c является число k.

public class Problem20 {

	public static void main(String[] args) {
		int a, b, c, k;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value a");
		a = sc.nextInt();
		System.out.println("Please, insert value b");
		b = sc.nextInt();
		System.out.println("Please, insert value c");
		c = sc.nextInt();
		System.out.println("Please, insert value k");
		k = sc.nextInt();

		if (a % k == 0) {
			System.out.println("a divisor of number A");
		}
		if (b % k == 0) {
			System.out.println("a divisor of number B");
		}
		if (c % k == 0) {
			System.out.println("a divisor of number C");
		} else {
			System.out.println("no number");
		}

	}

}
