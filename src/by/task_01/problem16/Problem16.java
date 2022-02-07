package by.task_01.problem16;

import java.util.Scanner;

/*Дана сторона равностороннего треугольника.Найти площадь этого треугольника, его высоту, 
радиус вписанной и описанной окружности.*/

public class Problem16 {

	public static void main(String[] args) {
		double a;
		double s;
		double h;
		double r1;
		double r2;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value a");
		a = sc.nextDouble();
		sc.close();

		s = a * a * Math.sqrt(3) / 4;
		System.out.println("Area = " + s);
		h = a * Math.sqrt(3) / 2;
		System.out.println("Height = " + h);
		r1 = a * Math.sqrt(3) / 6;
		System.out.println("Radius of inscribed circle = " + r1);
		r2 = a * Math.sqrt(3) / 3;
		System.out.println("Radius of a circumscribed circle = " + r2);

	}

}
