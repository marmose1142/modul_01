package by.task_01.problem30;

import java.util.Scanner;

/*Текущее показание электронных часов: m часов (0<=m<=23) n мин(0<=n<=59), 
k ceк(0<=k<=59). Какое время будут показывать часы через p часов, q мин, r cекунд?*/

public class Problem30 {

	public static void main(String[] args) {
		int m, n, k, m2, n2, k2, m3, n3, k3;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value m (0<=m<=23)");
		m = sc.nextInt();
		System.out.println("Please, insert value n (0<=n<=59)");
		n = sc.nextInt();
		System.out.println("Please, insert value k (0<=k<=59)");
		k = sc.nextInt();
		System.out.println("Please, insert value m2");
		m2 = sc.nextInt();
		System.out.println("Please, insert value n2");
		n2 = sc.nextInt();
		System.out.println("Please, insert value k2");
		k2 = sc.nextInt();

		k3 = (k + k2) % 60;
		n3 = (k + k2) / 60;
		n3 = (n3 + n2 + n) % 60;
		m3 = (n3 + n2 + n) / 60;
		m3 = (m3 + m2 + m) % 24;

		System.out.println("Time " + m3 + " : " + n3 + " : " + k3);

	}

}