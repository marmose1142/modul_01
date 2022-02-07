package by.task_02.problem15;

import java.util.Scanner;

/*Даны действительные числа x и y, не равные друг другу. Меньшее из этих двух чисел 
 * заменить половиной их суммы, а большее их удвоенным произведением*/

public class Problem15 {

	public static void main(String[] args) {
		double x, y, bigger, smaller;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value x");
		x = sc.nextDouble();
		System.out.println("Please, insert value y");
		y = sc.nextDouble();

		if (x < y) {
			smaller = (x + y) / 2;
			System.out.println("smaller x  = " + smaller);
			bigger = x * y * 2;
			System.out.println("bigger y = " + bigger);
		} else if (y < x) {
			smaller = (x + y) / 2;
			System.out.println("smaller y = " + smaller);
			bigger = x * y * 2;
			System.out.println("bigger x = " + bigger);
		} else {
			System.out.println("try again");
		}
	}
}
