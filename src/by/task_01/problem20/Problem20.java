package by.task_01.problem20;

import java.util.Scanner;

/*Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
Вывести данноне значение длительности в часах, минутахи секундах в следующей форме:
ННч ММмин SSс */

public class Problem20 {

	public static void main(String[] args) {
		int t;
		int hh;
		int mm;
		int ss;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value T");
		t = sc.nextInt();

		hh = t / 3600;
		mm = (t % 3600) / 60;
		ss = t % 60;
		System.out.println(hh + " hh " + mm + " mm " + ss + " ss ");

	}

}
