package by.task_02.problem22;

import java.util.Scanner;

/*Перераспределить значение переменных x и y так, чтобы в x оказалось большее из 
 *этих значений, а в у - меньшее*/

public class Problem22 {

	public static void main(String[] args) {
		int x, y, h;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value x");
		x = sc.nextInt();
		System.out.println("Please, insert value y");
		y = sc.nextInt();

		if (x > y) {
			System.out.println("x = " + x + " and " + "y = " + y);
		} else if (x == y) {
			System.out.println("x equals y");
		} else {
			h = x;
			x = y;
			y = h;
			System.out.println("x = " + x + " and " + "y = " + y);
		}

	}

}
