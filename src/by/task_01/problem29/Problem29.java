package by.task_01.problem29;

import java.util.Scanner;

/*Cоставить программу для вычисления пути, пройденного лодкой, если ее скорость
 *  в стоячей воде v км в час, скорость течения реки vr км в час, время движения по озеру
 *t1 часов, а против течния реки t2 часов.*/

public class Problem29 {

	public static void main(String[] args) {
		double v, vr, t1, t2, w;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value v");
		v = sc.nextDouble();
		System.out.println("Please, insert value vr");
		vr = sc.nextDouble();
		System.out.println("Please, insert value t1");
		t1 = sc.nextDouble();
		System.out.println("Please, insert value t2");
		t2 = sc.nextDouble();

		w = t1 * v + t2 * (v - vr);
		System.out.println("Way = " + w);
	}

}
