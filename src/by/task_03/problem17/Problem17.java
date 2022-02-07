package by.task_03.problem17;

import java.util.Scanner;

//Даны действительное (a) и натуральноe (n).Вычислить:a*(a+1)...(a+n-1).

public class Problem17 {

	public static void main(String[] args) {
		double a, n, intermedResult, result;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value real number a");
		a = sc.nextDouble();
		System.out.println("Please, insert value natural number n");
		n = sc.nextDouble();

		for (int i = 1; i <= (n - 1); i++) {
			intermedResult = a + i;
			result = a * intermedResult;
			System.out.println(result);
		}

	}

}
