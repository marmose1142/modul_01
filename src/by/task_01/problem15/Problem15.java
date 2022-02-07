package by.task_01.problem15;

import java.util.Scanner;

//Дана длина ребра куба.Найти площадь грани, площадь полной поверхности и объем этого куба.

public class Problem15 {

	public static void main(String[] args) {
		double len;
		double s1;
		double s2;
		double s3;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert length");
		len = sc.nextDouble();
		sc.close();

		s1 = len * len;
		System.out.println("Face area = " + s1);
		s2 = len * len * 6;
		System.out.println("Surface area = " + s2);
		s3 = Math.pow(len, 3);
		System.out.println("The volume of a cube =  " + s3);
	}

}
