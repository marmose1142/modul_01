package by.task_01.problem2;

import java.util.Scanner;

//Составить алгоритм нахождения среднего арифметического двух чисел.

public class Problem2 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert the number a");
		a = sc.nextDouble();
		System.out.println("Please, insert the number b");
		b = sc.nextDouble();
		sc.close();

		c = (a + b) / 2;
		System.out.println("arithmetic mean numbers a and b =" + c);

	}

}
