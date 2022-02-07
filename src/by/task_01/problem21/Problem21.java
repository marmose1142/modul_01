package by.task_01.problem21;

import java.util.Scanner;

//Найти площадь кольца, внутренний радиус которого r, а внешний R (R>r). 

public class Problem21 {

	public static void main(String[] args) {
		double r;
		double R;
		double p = 3.14;
		double s;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value r");
		r = sc.nextDouble();
		System.out.println("Please, insert value R on condition that (R > r)");
		R = sc.nextDouble();

		s = p * (Math.pow(R, 2) - Math.pow(r, 2));
		System.out.println("area ring = " + s);

	}

}
