package by.task_01.problem9;

import java.util.Scanner;

//Вычислить расстояние между двумя точками, с данными координатами (x1,y1) и (x2,y2).

public class Problem9 {

	public static void main(String[] args) {
		double x1;
		double y1;
		double x2;
		double y2;
		double dist;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value x1");
		x1 = sc.nextDouble();
		System.out.println("Please, insert value y1");
		y1 = sc.nextDouble();
		System.out.println("Please, insert value x2");
		x2 = sc.nextDouble();
		System.out.println("Please, insert value y2");
		y2 = sc.nextDouble();
		sc.close();

		dist = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		System.out.println("distance = " + dist);
	}

}
