package by.task_01.problem18;

import java.util.Scanner;

//Найдите значение функции z=2*x+(y-2)*5.

public class Problem18 {

	public static void main(String[] args) {
		int z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value x:");
		int x = sc.nextInt();
		System.out.println("Please, insert value y:");
		int y = sc.nextInt();
		sc.close();

		z = 2 * x + (y - 2) * 5;
		System.out.println("Result z  = " + z);
	}

}
