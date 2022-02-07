package by.task_02.problem10;

import java.util.Scanner;

//Составить программу которая определит площадь какого круга меньше.

public class Problem10 {

	public static void main(String[] args) {
		int s1, s2;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value s1");
		s1 = sc.nextInt();
		System.out.println("Please, insert value s2");
		s2 = sc.nextInt();

		if (s1 > s2) {
			System.out.println("the area of ​​the first circle is greater than the second");
		} else if (s2 > s1) {
			System.out.println("the area of ​​the second circle is greater than the first");
		} else {
			System.out.println("areas are equal");
		}

	}

}
