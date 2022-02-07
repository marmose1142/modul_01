package by.task_01.problem39;

import java.util.Scanner;

//Даны два действительных числа x и y. Найти их сумму, разность и произведение.

public class Problem39 {

	public static void main(String[] args) {

		int x, y, sum, res, pro;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value x ");
		x = sc.nextInt();
		System.out.println("Please, insert value y ");
		y = sc.nextInt();
		sum = x + y;
		res = x - y;
		pro = x * y;
		System.out.println("Sum = " + sum + " Residual = " + res + " Product = " + pro);
	}

}
