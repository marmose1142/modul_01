package by.task_03.problem24;

import java.util.Scanner;

/*Вводится натуральное число. Найти сумму четных цифр, входящих в его состав. Преобразовать его 
 * в другое число, цифры которого будут следовать в обратном порядке по сравнению с введенным числом.*/

public class Problem24 {

	public static void main(String[] args) {
		int n;
		int sum = 0;
		int trNum = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value n");
		n = sc.nextInt();

		while (n != 0) {

			if (n % 10 % 2 == 0) {
				sum = sum + n % 10;
			}

			trNum = trNum * 10 + n % 10;

			n = n / 10;
		}
		System.out.println("sum of even numbers = " + sum);
		System.out.println("transformed number = " + trNum);

	}

}
