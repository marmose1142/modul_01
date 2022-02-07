package by.task_01.problem28;

import java.util.Scanner;

//Три сопротивления R1, R2, R3 соединены параллельно. Найдите сопротивление соединения.

public class Problem28 {

	public static void main(String[] args) {
		double r1, r2, r3, cr;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value r1");
		r1 = sc.nextDouble();
		System.out.println("Please, insert value r2");
		r2 = sc.nextDouble();
		System.out.println("Please, insert value r3");
		r3 = sc.nextDouble();

		cr = 1 / (1 / r1 + 1 / r2 + 1 / r3);
		System.out.println("connection resistance  = " + cr);

	}

}
