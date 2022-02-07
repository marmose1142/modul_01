package by.task_02.problem24;

import java.util.Scanner;

/*Составить программу, определяющую результат гадания на ромашке - "любит - не любит",
взяв за исходное данное количество лепестков n.*/

public class Problem24 {

	public static void main(String[] args) {
		int n;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert vulue n");
		n = sc.nextInt();

		if (n % 2 == 0) {
			System.out.println("doesn't love me");
		} else {
			System.out.println("she loves me!!!");
		}

	}

}
