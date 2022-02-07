package by.task_03.problem18;

import java.util.Scanner;

/*Даны числовой ряд и некоторое число e.Найти сумму тех членов ряда, модуль которых
*больше или равен заданному е. Общий член ряда имеет вид An=(-1)^(n-1) / n */

public class Problem18 {

	public static void main(String[] args) {
		double e;
		double An;
		double n;
		double sum;
		An = 1;
		n = 1;
		sum = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value e");
		e = sc.nextDouble();

		if (e < 1 & e > 0) {
			while (Math.abs(An) > e) {
				An = Math.pow(-1, n - 1) / n;
				sum = sum + An;
				System.out.println(sum);
				n++;
			}
		} else {
			System.out.println("try again");
		}
	}
}
