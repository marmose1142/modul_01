package by.task_02.problem27;

import java.util.Scanner;

//Найти max{min(a,b),min(c,d)}

public class Problem27 {

	public static void main(String[] args) {
		int a, b, c, d, minab = 0, mincd = 0;

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

		if (a < b) {
			minab = a;
			System.out.println("min a,b = " + a);
		} else if (b < a) {
			minab = b;
			System.out.println("min a,b = " + b);
		} else {
			System.out.println("numbers are equal, retype");
		}
		if (c < d) {
			mincd = c;
			System.out.println("min c,d = " + c);
		} else if (d < c) {
			mincd = d;
			System.out.println("min c,d = " + d);
		} else {
			System.out.println("numbers are equal, retype");
		}
		if (minab > mincd) {
			System.out.println("max{min(a,b),min(c,d) = " + minab);
		} else if (mincd > minab) {
			System.out.println("max{min(a,b),min(c,d) = " + mincd);
		} else {
			System.out.println("numbers are equal, retype");
		}
	}

}
