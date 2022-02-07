package by.task_01.problem8;

import java.util.Scanner;

//Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов.

public class Problem8 {

	public static void main(String[] args) {
		double a;
		double b;
		double hyp;
		double p;
		double s;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value a");
		a = sc.nextDouble();
		System.out.println("Please, insert value b");
		b = sc.nextDouble();
		sc.close();

		s = a * b / 2;
		System.out.println("area of a triangle " + s);
		hyp = Math.pow(a, 2) + Math.pow(b, 2);
		p = a + b + hyp;
		System.out.println("perimeter of a triangle " + p);
	}

}
