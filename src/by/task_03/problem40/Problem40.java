package by.task_03.problem40;

import java.util.Scanner;

//Получить все числа не превышающие заданного числа N, которые делятся без остатка на все свои цифры.

public class Problem40 {

	public static void main(String[] args) {
		int n;
		int x;
		int supportX;
		int remainder;
		boolean b = true;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value N");
		n = sc.nextInt();

		for (x = 1; x < n; x++) {
			supportX = x;
			while (supportX > 0) {
				remainder = supportX % 10;
				supportX = supportX / 10;
				if (remainder == 0) {
					b = false;
					break;
				}

				if (x % remainder == 0) {
					b = true;
				} else {
					b = false;
					break;
				}
			}
			if (b == true) {
				System.out.println(x);
			}

		}
	}
}
