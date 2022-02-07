package by.task_03.problem35;

import java.util.Scanner;

//Найти количество четных цифр данного натурального числа.

public class Problem35 {

	public static void main(String[] args) {
		int num;
		int supportNum;
		int result = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value of natural number");
		num = sc.nextInt();

		while (num > 0) {
			supportNum = num % 10;
			num = num / 10;
			if (supportNum % 2 == 0) {
				result = result + 1;
			}

		}
		System.out.println("result = " + result);

	}

}
