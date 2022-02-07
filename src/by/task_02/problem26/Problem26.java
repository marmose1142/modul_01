package by.task_02.problem26;

import java.util.Scanner;

public class Problem26 {

	public static void main(String[] args) {
		int n1, n2, n3, sum;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value first number");
		n1 = sc.nextInt();
		System.out.println("Please, insert value second number");
		n2 = sc.nextInt();
		System.out.println("Please, insert value third number");
		n3 = sc.nextInt();

		if (n1 > n2 & n1 > n3 & n2 < n3) {
			sum = n1 + n2;
			System.out.println("sum = " + sum);
		} else if (n1 > n2 & n1 > n3 & n3 < n2) {
			sum = n1 + n3;
			System.out.println("sum = " + sum);
		} else if (n2 > n1 & n2 > n3 & n1 < n3) {
			sum = n2 + n1;
			System.out.println("sum + " + sum);
		} else if (n2 > n1 & n2 > n3 & n3 < n2) {
			sum = n2 + n3;
			System.out.println("sum = " + sum);
		} else if (n3 > n1 & n3 > n2 & n1 < n2) {
			sum = n3 + n1;
			System.out.println("sum = " + sum);
		} else if (n3 > n1 & n3 > n2 & n2 < n1) {
			sum = n3 + n2;
			System.out.println("sum + " + sum);
		} else {
			System.out.println("two or three numbers entered are equal");
		}

	}
}
