package by.task_02.problem32;

import java.util.Scanner;

/*Написать программу, которая по заданным трем числам определяет, является ли сумма 
 * каких нибудь из них положительной
 */

public class Problem32 {

	public static void main(String[] args) {

		int num1, num2, num3;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value num1");
		num1 = sc.nextInt();
		System.out.println("Please, insert value num2");
		num2 = sc.nextInt();
		System.out.println("Please, insert value num3");
		num3 = sc.nextInt();

		if (num1 + num2 > 0 | num1 + num3 > 0 | num2 + num3 > 0) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}

}
