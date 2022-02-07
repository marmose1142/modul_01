package by.task_02.problem21;

import java.util.Scanner;

/*Программа-льстец. На экране высвечивается вопрос "Кто ты: мальчик или девочка?
 * Введи М или Д".В зависимости от ответа на экране должен появиться текст "Мне нравятся
 * мальчики" или "Мне нравятся девочки".*/

public class Problem21 {

	public static void main(String[] args) {
		String answer;
		String m = "м";
		String d = "д";

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Кто ты: мальчик или девочка?Введи м или д");
		answer = sc.nextLine();

		if (answer.equals(m)) {
			System.out.println("Мне нравятся мальчики");
		} else if (answer.equals(d)) {
			System.out.println("Мне нравятся девочки");
		} else {
			System.out.println("неправильный ввод");
		}

	}

}
