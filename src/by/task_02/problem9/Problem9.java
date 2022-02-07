package by.task_02.problem9;

import java.util.Scanner;

/*Составить программу, которая по трем введенным сторонам определит, является ли 
 *данный треугольник равносторонним*/

public class Problem9 {

	public static void main(String[] args) {
		int a, b, c;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value a");
		a = sc.nextInt();
		System.out.println("Please, insert value b");
		b = sc.nextInt();
		System.out.println("Please, insert value c");
		c = sc.nextInt();

		if (a == b & a == c & b == c) {
			System.out.println("equilateral triangle");
		} else {
			System.out.println("not equilateral triangle");
		}
	}

}
