package by.task_02.problem34;

import java.util.Scanner;
/* Cоставить программу, реализующую эпизод применения компьютера в книжном магазине.Компьютер,
 * запрашивает стоимость книг, сумму денег, внесенную покупателем: если сдачи не требуется,печатает
 * на экране "спасибо"; если денег внесено больше, чем необходимо, печатает "возмите сдачу"
 * и указывает сумму сдачи;если денег не достаточно, то печатает сообщение об этом и указывает
 * размер недостоющей суммы*/

public class Problem34 {

	public static void main(String[] args) {
		int costbook, amountdeposited, oddmoney, deficientamount; // oddmoney = 0, deficientamount = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value costbook");
		costbook = sc.nextInt();
		System.out.println("Please, insert value amountdeposited");
		amountdeposited = sc.nextInt();

		if (costbook == amountdeposited & costbook > 0 & amountdeposited > 0) {
			System.out.println("спасибо");
		} else if (amountdeposited > costbook & amountdeposited > 0 & costbook > 0) {
			oddmoney = amountdeposited - costbook;
			System.out.println("ваша сдача " + oddmoney);
		} else if (costbook > amountdeposited & costbook > 0 & amountdeposited > 0) {
			deficientamount = costbook - amountdeposited;
			System.out.println("У вас не хватает суммы " + deficientamount);
		} else {
			System.out.println("Некорректный ввод суммы");
		}

	}

}
