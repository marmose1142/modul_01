package by.task_02.problem33;

import java.util.Scanner;

/*Написать программу, которая по паролю будет определять уровень доступа сотрудника к секретной информации
 * в базе данных. Доступ к базе данных имеют шесть человек,разбитых на три группы по степени доступа
 * Они имеют следующие пароли:9583,1747-доступны модули баз A,B,C;3331,7922-доступны модули баз B,C;
 * 9455,8997-доступен модуль базы C.*/

public class Problem33 {

	public static void main(String[] args) {
		int person;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert password");
		person = sc.nextInt();

		if (person == 9583 | person == 1747) {
			System.out.println("databases ABC are available to you ");
		} else if (person == 3331 | person == 7922) {
			System.out.println("databases BC are available to you ");
		} else if (person == 9455 | person == 8997) {
			System.out.println("databases C are available to you ");
		} else {
			System.out.println("databases are not available to you ");
		}
	}
}
