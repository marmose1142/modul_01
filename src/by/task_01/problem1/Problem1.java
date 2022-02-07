package by.task_01.problem1;

import java.util.Scanner;

//Найдите значение функции z=((a-3)*b/2)+c.

public class Problem1 {
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double z;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert the number a");
		a = sc.nextInt();
		System.out.println("Please, insert the number b");
		b = sc.nextInt();
		System.out.println("Please, insert the number c");
		c = sc.nextInt();
		sc.close();

		z = ((a - 3) * b / 2) + c;

		System.out.println("result z = " + z);
	}
}
