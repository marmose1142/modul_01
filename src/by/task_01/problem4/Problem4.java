package by.task_01.problem4;

import java.util.Scanner;

/* Дан прямоугольник, ширина которого в 2 раза меньше длины. 
 * Найти площадь прямоугольника.*/

public class Problem4 {

	public static void main(String[] args) {
		double l;
		double s;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert the length");
		l = sc.nextDouble();
		sc.close();

		s = l / 2 * l;
		System.out.println(" the area of a rectangle = " + s);

	}

}
