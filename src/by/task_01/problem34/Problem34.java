package by.task_01.problem34;

import java.util.Scanner;

//Найти частное произведений четных и нечетных цифр четырехзначного числа.

public class Problem34 {

	public static void main(String[] args) {
		int n, n1, n2, n3, n4;
		double n13, n24, x;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please,insert a four-digit number n");
		n = sc.nextInt();

		n1 = n / 1000;
		n2 = n / 100 % 10;
		n3 = n % 100 / 10;
		n4 = n % 10;

		n24 = n2 * n4;
		n13 = n1 * n3;
		x = n24 / n13;
		System.out.println("result =  " + x);
	}

}
