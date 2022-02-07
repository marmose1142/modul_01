package by.task_03.problem36;

/*Два двузначных числа, записанных одно за другим, образуют четырехзначное число, которое делится на их произведение.
*Найти эти числа.*/

public class Problem36 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int num4;
		int productNum;

		for (num1 = 10; num1 < 100; num1++) {
			for (num2 = 10; num2 < 100; num2++) {
				productNum = num1 * num2;
				num4 = num1 * 100 + num2;

				if (num4 % productNum == 0) {
					System.out.println("numbers " + num1 + " and " + num2);

				}

			}

		}

	}
}
