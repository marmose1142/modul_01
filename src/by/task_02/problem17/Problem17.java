package by.task_02.problem17;

import java.util.Scanner;

/*Даны целые числа m,n.Если числа не равны, то заменить каждое из них одним и тем же 
 * числом, равным большему из исходных, а если равны ,то заменить числа нулями*/

public class Problem17 {

	public static void main(String[] args) {
		int m, n;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert the value of the number m");
		m = sc.nextInt();
		System.out.println("Please, insert the value of the number n");
		n = sc.nextInt();

		if (m == n) {
			m = 0;
			n = 0;
			System.out.println("m = " + m + " n = " + n);
		} else {
			if (m > n) {
				n = m;
				System.out.println("m = " + m + " n = " + n);
			} else {
				m = n;
				System.out.println("m = " + m + " n = " + n);
			}
		}

	}
}
