package by.task_01.problem35;

import java.util.Scanner;

/*Составить линейную программу печатающую true, если указанное высказывание
является истинным и false в противном случае.*/

public class Problem35 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		// 1)Целое число N является четным двузначным числом.

		int n;
		System.out.println("Please, insert value n");
		n = sc.nextInt();
		if (n > 9 & n < 100 & n % 2 == 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		/*
		 * 2)Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его
		 * последних цифр.
		 */

		int n2, x2_1, x2_2, x2_3, x2_4;
		System.out.println("Please,insert four-digit number");
		n2 = sc.nextInt();
		x2_4 = n2 % 10;
		x2_3 = n2 % 100 / 10;
		x2_2 = n2 % 1000 / 100;
		x2_1 = n2 / 1000;
		if (x2_1 + x2_2 == x2_3 + x2_4) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		// 3)Сумма цифр данного трехзначного числа N является четным числом.

		int n3, x3_1, x3_2, x3_3, sumn3;
		System.out.println("Please, insert three-digit number");
		n3 = sc.nextInt();
		x3_1 = n3 / 100;
		x3_2 = n3 / 10 % 10;
		x3_3 = n3 % 10;
		sumn3 = x3_1 + x3_2 + x3_3;
		if (sumn3 % 2 == 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		/*
		 * 4)Точка с координатами (x,y) принадлежит части плоскости лежащей между
		 * прямыми x = m, x = n (m < n).
		 */

		int x4, m4, n4;
		System.out.println("Please, insert value m4(m4 < n4)");
		m4 = sc.nextInt();
		System.out.println("Please, insert value n4(m4 < n4)");
		n4 = sc.nextInt();
		System.out.println("Please, insert value x4");
		x4 = sc.nextInt();

		if (x4 >= m4 & x4 <= n4) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		// 5)Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.

		int x5_1, x5_2, x5_3, x5_4, x5_5, sumx345;
		double x5_6;
		System.out.println("Please, insert three-digit number");
		x5_1 = sc.nextInt();

		x5_2 = x5_1 * x5_1;

		x5_3 = x5_1 / 100;
		x5_4 = x5_1 / 10 % 10;
		x5_5 = x5_1 % 10;
		sumx345 = x5_3 + x5_4 + x5_5;
		x5_6 = Math.pow(sumx345, 3);
		if (x5_2 == x5_6) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		// 6)Треугольник со сторонами a,b,c является равнобедренным.

		int x6_1, x6_2, x6_3;

		System.out.println("Please, insert value x6_1");
		x6_1 = sc.nextInt();
		System.out.println("Please, insert value x6_2");
		x6_2 = sc.nextInt();
		System.out.println("Please, insert value x6_3");
		x6_3 = sc.nextInt();

		if (x6_1 == x6_2 & x6_1 == x6_3) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		/*
		 * 7)Сумма каких-либо двух цифр заданного трехзначного натурального числа N
		 * равна третьей цифре.
		 */

		int x7_1, x7_2, x7_3, x7_4;
		System.out.println("Please, insert three-digit number");
		x7_1 = sc.nextInt();

		x7_2 = x7_1 / 100;
		x7_3 = x7_1 / 10 % 10;
		x7_4 = x7_1 % 10;

		if (x7_2 + x7_3 == x7_4 | x7_2 + x7_4 == x7_3 | x7_2 == x7_3 + x7_4) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		/*
		 * 8)Заданное число N является степенью числа А(показатель степени может
		 * находиться в диапазоне от 0 до 4).
		 */

		int n8, a8, pow8;
		double x8;
		System.out.println("Please, insert value n8");
		n8 = sc.nextInt();
		System.out.println("Please, insert value a8");
		a8 = sc.nextInt();
		System.out.println("Please, insert value pow8(<=4)");
		pow8 = sc.nextInt();

		x8 = Math.pow(a8, pow8);
		if (n8 == x8) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		/*
		 * 9)График функции (y = ax^2 + bx + c) проходит через точку с
		 * координатами(m,n).
		 */

		int a9, b9, c9, m9, n9;

		System.out.println("Please, insert value a9");
		a9 = sc.nextInt();
		System.out.println("Please, insert value b9");
		b9 = sc.nextInt();
		System.out.println("Please, insert value c9");
		c9 = sc.nextInt();
		System.out.println("Please, insert value m9");
		m9 = sc.nextInt();
		System.out.println("Please, insert value n9");
		n9 = sc.nextInt();

		if (m9 == a9 * n9 * n9 + b9 * n9 + c9) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
