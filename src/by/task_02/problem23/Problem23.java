package by.task_02.problem23;

import java.util.Scanner;

/*Определить правильность даты введенной с клавиатуры(число - от 1 до 31 и 
 * месяц - от 1 до 12).Если введены некорректные данные, то сообщить об этом.*/

public class Problem23 {

	public static void main(String[] args) {

		byte number, month;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert number");
		number = sc.nextByte();
		System.out.println("Please, insert month");
		month = sc.nextByte();

		if (number > 31 | number <= 0 | month > 12 | month <= 0) {
			System.out.println("incorrect data");
		} else {
			System.out.println("all right");
		}

	}
}
