package by.task_02.problem12;

import java.util.Scanner;

/*Даны три действительных числа.Возвести в квадрат те из них, значение которых 
 *неотрицательны, и в четвертую степень - отрицательные.*/

public class Problem12 {

	public static void main(String[] args) {
		double a, b, c;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert number");
		a = sc.nextDouble();
		System.out.println("Please, insert number");
		b = sc.nextDouble();
		System.out.println("Please, insert number");
		c = sc.nextDouble();

		if (a > 0) {
			a = Math.pow(a, 2);
			System.out.println("the numbers in the square " + a);
		} else {
			a = Math.pow(a, 4);
			System.out.println("fourth degree number " + a);
		}
		if (b > 0) {
			b = Math.pow(b, 2);
			System.out.println("the numbers in the square " + b);
		} else {
			b = Math.pow(b, 4);
			System.out.println("fourth degree number " + b);
		}
		if (c > 0) {
			c = Math.pow(c, 2);
			System.out.println("the numbers in the square " + c);
		} else {
			c = Math.pow(c, 4);
			System.out.println("fourth degree number " + c);
		}
	}

}
