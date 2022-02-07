package by.task_01.problem6;

import java.util.Scanner;

//Вычислить значение выражения по формуле (a/c)*(b/d)-(a*b-c)/(c*d).

public class Problem6 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double d;

		double x;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value a");
		a = sc.nextDouble();
		System.out.println("Please, insert value b");
		b = sc.nextDouble();
		System.out.println("Please, insert value c");
		c = sc.nextDouble();
		System.out.println("Please, insert value d");
		d = sc.nextDouble();

		sc.close();

		x = (a / c) * (b / d) - (a * b - c) / (c * d);
		System.out.println("x = " + x);

	}

}
