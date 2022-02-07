package by.task_02.problem28;

import java.util.Scanner;

/* Даны три числа a,b,c. Определить, какое из них равно d.Если ни одно не равно d,
 * то найти max(d-a,d-b,d-c).*/

public class Problem28 {

	public static void main(String[] args) {
		int a, b, c, d;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value a");
		a = sc.nextInt();
		System.out.println("Please, insert value b");
		b = sc.nextInt();
		System.out.println("Please, insert value c");
		c = sc.nextInt();
		System.out.println("Please, insert value d");
		d = sc.nextInt();

		if (a != d & b != d & c != d) {
			if (d > a) {
				System.out.println("max d-a " + d);
			} else if (a > d) {
				System.out.println("max d-a " + a);
			} else {
				System.out.println("numbers d and a equals");
			}
			if (d > b) {
				System.out.println("max d-b " + d);
			} else if (b > d) {
				System.out.println("max d-b " + b);
			} else {
				System.out.println("numbers d and b equals");
			}
			if (d > c) {
				System.out.println("max d-c " + d);
			} else if (c > d) {
				System.out.println("max d-a " + c);
			} else {
				System.out.println("numbers d and a equals");
			}
		} else if (d == a & d != b & d != c) {
			System.out.println("d equals a");
		} else if (d == b & d != a & d != c) {
			System.out.println("d equals b");
		} else if (d == c & d != a & d != b) {
			System.out.println("d equals c");
		} else {
			System.out.println("all numbers equals");
		}

	}

}
