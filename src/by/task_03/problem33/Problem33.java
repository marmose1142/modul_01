package by.task_03.problem33;

import java.util.Scanner;

//Найдите наибольшую цифру данного натурального числа.

public class Problem33 {

	public static void main(String[] args) {
		int num;
		int supportNum = 0;
		int biggestFigure = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value of natural number");
		num = sc.nextInt();

		while (num > 0) {
			supportNum = num % 10;
			num = num / 10;
			if (supportNum > num % 10 & supportNum > biggestFigure) {
				biggestFigure = supportNum;

			} else if (num % 10 > supportNum & num % 10 > biggestFigure) {
				biggestFigure = num % 10;
			}

		}
		System.out.println(biggestFigure);

	}
}
