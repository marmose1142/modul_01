package by.task_03.problem31;

import java.util.Scanner;

/*Компьютер генерирует пять чисел в диапазон от 1 до 15 включительно.Человек пытается их угадать.Программа должна выводить
 * угаданные и неугаданные числа из тех, что сгенерировала программа, а также ошибочные числа пользователя. */

public class Problem31 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		int num4;
		int num5;
		int playerNum;

		num1 = 1 + (int) (Math.random() * 15);
		num2 = 1 + (int) (Math.random() * 15);
		num3 = 1 + (int) (Math.random() * 15);
		num4 = 1 + (int) (Math.random() * 15);
		num5 = 1 + (int) (Math.random() * 15);

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value number (1 - 15)");
		playerNum = sc.nextInt();

		if (playerNum == num1) {
			System.out.println("you guessed the number " + num1);
			System.out.println("all the others numbers " + num2 + " " + num3 + " " + num4 + " " + num5);
		} else if (playerNum == num2) {
			System.out.println("you guessed the number " + num2);
			System.out.println("all the others numbers " + num1 + " " + num3 + " " + num4 + " " + num5);
		} else if (playerNum == num3) {
			System.out.println("you guessed the number " + num3);
			System.out.println("all the others numbers " + num1 + " " + num2 + " " + num4 + " " + num5);
		} else if (playerNum == num4) {
			System.out.println("you guessed the number " + num4);
			System.out.println("all the others numbers " + num1 + " " + num2 + " " + num3 + " " + num5);
		} else if (playerNum == num5) {
			System.out.println("you guessed the number " + num5);
			System.out.println("all the others numbers " + num1 + " " + num2 + " " + num3 + " " + num4);
		} else {
			System.out.println("you entered a value " + playerNum + " and you didn't guess");
		}
	}

}
