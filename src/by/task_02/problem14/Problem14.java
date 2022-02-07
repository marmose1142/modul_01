package by.task_02.problem14;

import java.util.Scanner;

/*Даны два угла треугольника в градусах.Опредилить, существует ли такой треугольник, 
 *и если да, то будет ли он прямоугольным.*/

public class Problem14 {

	public static void main(String[] args) {
		int a, b;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value a");
		a = sc.nextInt();
		System.out.println("Please, insert value b");
		b = sc.nextInt();

		if (a + b >= 180) {
			System.out.println("the figure is not a triangle");
		} else if (a == 90 | b == 90 | a + b == 90) {
			System.out.println("Right triangle");
		} else {
			System.out.println("the figure is not right triangle");
		}

	}

}
