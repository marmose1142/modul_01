package by.task_01.problem22;

import java.util.Scanner;

/*Найти площадь равнобедренной трапеции с основаниями a и b и углом A при большем 
основании a.*/

public class Problem22 {

	public static void main(String[] args) {
		double a;
		double b;
		double ang;
		double rad;
		double h;
		double s;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please,insert value a on condition that (a > b)");
		a = sc.nextDouble();
		System.out.println("Please,insert value b");
		b = sc.nextDouble();
		System.out.println("Please,insert value A(acute angle < 90)");
		ang = sc.nextDouble();

		rad = Math.toRadians(ang);
		h = (a - b) / 2 * Math.tan(rad);
		s = (a + b) / 2 * h;
		System.out.println("Area trapezium = " + s);
	}

}
