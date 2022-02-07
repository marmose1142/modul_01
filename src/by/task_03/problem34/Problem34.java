package by.task_03.problem34;

//Найти все четерехзначные числа, сумма цифр каждого из которых равна 15.

public class Problem34 {

	public static void main(String[] args) {
		int n;
		int n1;
		int n2;
		int n3;
		int n4;
		int result;

		for (n = 1000; n < 10000; n++) {
			n1 = n % 100 % 10;
			n2 = n % 100 / 10;
			n3 = n % 1000 / 100;
			n4 = n / 1000;
			result = n1 + n2 + n3 + n4;
			if (result == 15) {
				System.out.println(n);
			}
		}

	}

}
