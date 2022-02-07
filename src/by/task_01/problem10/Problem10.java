package by.task_01.problem10;

import java.util.Scanner;

/*Заданы координаты трех вершин треугольника (x1,y1),(x2,y2),(x3,y3).Найти его периметр
и площадь.*/

public class Problem10 {

	public static void main(String[] args) {
		double x1;
		double x2;
		double x3;
		double y1;
		double y2;
		double y3;

		double ab;
		double bc;
		double ac;

		double p;
		double s;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert x1");
		x1 = sc.nextDouble();
		System.out.println("Please, insert y1");
		y1 = sc.nextDouble();
		System.out.println("Please, insert x2");
		x2 = sc.nextDouble();
		System.out.println("Please, insert y2");
		y2 = sc.nextDouble();
		System.out.println("Please, insert x3");
		x3 = sc.nextDouble();
		System.out.println("Please, insert y3");
		y3 = sc.nextDouble();
		sc.close();

		ab = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		ac = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
		bc = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));

		p = (ab + ac + bc) / 2;
		System.out.println("perimeter of a triangle " + p);

		s = Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
		System.out.println("area of a triangle = " + s);

	}

}
