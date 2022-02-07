package by.task_01.problem5;

import java.util.Scanner;

//Вычислить значение выражения по формуле x=(b±√(b^2+4ac))/2a-a^3*c+b^(-2).

public class Problem5 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;

		double d;
		double e;
		double f;
		double g;
		double k;

		double x;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert a");
		a = sc.nextDouble();
		System.out.println("Please, insert b");
		b = sc.nextDouble();
		System.out.println("Please, insert c");
		c = sc.nextDouble();
		sc.close();

		d = Math.pow(b, 2);
		e = Math.sqrt(d + 4 * a * c);
		f = Math.pow(a, 3);
		g = Math.pow(b, (-2));
		k = 2 * a - f * c + g;
		x = b + e / k;
		System.out.println("result = " + x);

	}

}
