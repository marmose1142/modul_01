package by.task_03.problem38;

import java.util.Scanner;

/*Для заданного натурального числа определить, образуют ли его цифры арифметическую прогресию.Предполагается,
 * что в числе не мение 3 цифр. Например:1357,963. */

public class Problem38 {

	public static void main(String[] args) {
		int naturalNum;
		int supportNum;
		int supportNum2;
		int distanceNum;
		int distanceNum2;
		boolean num = true;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value of natural number");
		naturalNum = sc.nextInt();

		supportNum = naturalNum % 10;
		supportNum2 = naturalNum % 100 / 10;
		distanceNum = supportNum - supportNum2;

		while (num) {
			while (naturalNum > 0) {
				supportNum = naturalNum % 10;
				supportNum2 = naturalNum % 100 / 10;
				distanceNum2 = supportNum - supportNum2;
				naturalNum = naturalNum / 10;

				if (distanceNum != distanceNum2 & supportNum2 > 0) {
					num = false;
				}
			}
			if (num) {
				System.out.println("yes");
				break;
			} else {
				System.out.println("no");
			}

		}

	}
}
