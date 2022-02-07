package by.task_01.problem7;

import java.util.Scanner;

//Вычислить значение выражения по формуле (sinx+cosy)/(cosx-siny)*tgxy.

public class Problem7 {
	public static void main(String[] args) {
		double x;
		double y;
		double a;
		double b;

		double sum;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value x");
		x = Math.toRadians(sc.nextDouble());
		System.out.println("Please, insert value y");
		y = Math.toRadians(sc.nextDouble());
		sc.close();

		a = Math.sin(x) + Math.cos(y);
		b = Math.cos(x) - Math.sin(y);

		sum = Math.toDegrees(a / b * Math.tan(x * y));
		System.out.println("sum = " + sum);

	}

}
