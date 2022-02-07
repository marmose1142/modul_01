package by.task_01.problem32;

import java.util.Scanner;

/*Дана величина А , выражающая обьем информации в байтах. Перевести А в более крупные
единицы информации*/

public class Problem32 {

	public static void main(String[] args) {

		Double a, kb, mb, gb;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value A in byte");
		a = sc.nextDouble();

		kb = a / 1024;
		System.out.println("Kbyte = " + kb);
		mb = a / 1024 / 1024;
		System.out.println("Mbyte = " + mb);
		gb = a / 1024 / 1024 / 1024;
		System.out.println("Gbyte = " + gb);

	}

}
