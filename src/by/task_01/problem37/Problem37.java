package by.task_01.problem37;

import java.util.Scanner;

/*
 * Дано действительное число х, не пользуясь никакими другими арифметическими
 * операциями, кроме умножения, сложения и вычитания, вычислить за минимальное
 * число операций: 2x^4 - 3x^3 + 4x^2 - 5x + 6;
 */

public class Problem37 {

	public static void main(String[] args) {

		int x, sum;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value x ");
		x = sc.nextInt();
		sum = ((((2 * x - 3) * x + 4) * x - 5) * x + 6);
		System.out.println("sum = " + sum);
	}

}
