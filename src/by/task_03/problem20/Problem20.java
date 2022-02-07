package by.task_03.problem20;

import java.util.Scanner;

/*Даны числовой ряд и некоторое число e.Найти сумму тех членов ряда, модуль которых
*больше или равен заданному е. Общий член ряда имеет вид An = 1 / ((3n-2) * (3n + 1)) */

public class Problem20 {

	public static void main(String[] args) {
		double An;
		double n;
		double e;
		double intermediateSumOne;
		double intermediateSumTwo;
		double sum;
		An = 1;
		n = 1;
		intermediateSumOne = 0;
		intermediateSumTwo = 0;
		sum = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value e");
		e = sc.nextDouble();

		if (e < 1 & e > 0) {
			while (Math.abs(An) >= e) {
				intermediateSumOne = 3 * n - 2;
				intermediateSumTwo = 3 * n + 1;
				An = 1 / (intermediateSumOne * intermediateSumTwo);
				sum = sum + An;
				System.out.println("sum = " + sum);
				n++;

			}
		} else {
			System.out.println("try again");
		}

	}

}
