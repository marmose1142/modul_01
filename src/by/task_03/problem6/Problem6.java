package by.task_03.problem6;

import java.util.Scanner;

/*Напишите программу где пользователь вводит любое целое положительное число.
 * А программа суммирует все числа от 1 до введенного пользователем числа.*/

public class Problem6 {

	public static void main(String[] args) {
		int x = 0, number;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value number");
		number = sc.nextInt();

		int i = 1;
		while (i < number) {
			x = x + i;
			System.out.println(x);
			i++;
		}

	}

}
