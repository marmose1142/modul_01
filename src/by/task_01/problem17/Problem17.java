package by.task_01.problem17;

import java.util.Scanner;

//Известна длина окружности.Найти площадь круга, ограниченного этой окружностью.

public class Problem17 {

	public static void main(String[] args) {
		double a;
		double r;
		double s;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please,insert value a");
		a = sc.nextDouble();
		sc.close();

		r = a / 2 * 3.14;
		s = 3.14 * r * r;

		System.out.println("Area = " + s);

	}

}
