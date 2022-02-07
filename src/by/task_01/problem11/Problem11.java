package by.task_01.problem11;

import java.util.Scanner;

//Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.

public class Problem11 {

	public static void main(String[] args) {
		double r;
		double p = 3.14;
		double l;
		double s;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value r");
		r = sc.nextDouble();
		sc.close();

		s = p * Math.pow(r, 2);
		l = 2 * p * r;
		System.out.println("area of circle = " + s);
		System.out.println("perimeter of circle = " + l);
	}

}
