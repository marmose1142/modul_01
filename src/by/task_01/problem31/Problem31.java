package by.task_01.problem31;

import java.util.Scanner;

/*Ввести любой символ и опредилить его порядковый номер, а также указать
 * предидущий и последующий символы*/

public class Problem31 {

	public static void main(String[] args) {
		char n, n1, n2;
		int x1, x2, x3;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value n ");
		n = sc.next().charAt(0);

		x1 = (int) n;
		x2 = (int) n + 1;
		x3 = (int) n - 1;
		n1 = (char) x2;
		n2 = (char) x3;
		System.out.println(x1 + " " + n1 + " " + n2);

	}

}
