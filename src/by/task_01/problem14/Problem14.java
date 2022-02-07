package by.task_01.problem14;

import java.util.Scanner;

/*Даны два числа.Найти среднее арифметическое кубов этих чисел и среднее геометрическое
модулей этих чисел.*/

public class Problem14 {

	public static void main(String[] args) {
		int num1;
		int num2;
		double res1;
		double res2;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert number one");
		num1 = sc.nextInt();
		System.out.println("Please, insert number two");
		num2 = sc.nextInt();
		sc.close();

		res1 = Math.pow(num1, 3) + Math.pow(num2, 3) / 2;
		System.out.println("The arithmetic mean of the cubes =  " + res1);
		res2 = Math.sqrt(Math.abs(num1) + Math.abs(num2));
		System.out.println("The geometric mean of the modules = " + res2);

	}

}
