package by.task_01.problem25;

import java.util.Scanner;

/*Дано значение а. Не используя никаких функций и никаких операций , кроме умножения, 
получить значение а^8 за три операции и a^10 за четыре операции*/

public class Problem25 {

	public static void main(String[] args) {
		double a, a2, a4, a8, a10;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value a");
		a = sc.nextDouble();

		a2 = a * a;
		a4 = a2 * a2;
		a8 = a4 * a4;
		a10 = a8 * a2;

		System.out.println("a^8 =" + a8);
		System.out.println("a^10 = " + a10);

	}

}
