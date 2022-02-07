package by.task_01.problem13;

import java.util.Scanner;

//Найти произведение цифр заданного четырехзначного числа.

public class Problem13 {
	public static void main(String[] args) {
		int num;
		int a;
		int b;
		int c;
		int d;
		int res;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert number");
		num = sc.nextInt();
		sc.close();
		if (num >= 1000 && num <= 9999) {
			d = num % 10;
			c = num % 100 / 10;
			b = num % 1000 / 100;
			a = num / 1000;
			res = a * b * c * d;
			System.out.println("Result = " + res);
		} else {
			System.out.println("You entered a number in the wrong format, try again");
		}
	}
}
