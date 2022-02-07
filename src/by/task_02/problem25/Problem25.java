package by.task_02.problem25;

import java.util.Scanner;

/*Написать программу - модель анализа пожарного датчика в помещении, которая выводит
 *сообщение "пожароопасная ситуация", если температура в комнате превысила 60 градусов.*/

public class Problem25 {

	public static void main(String[] args) {
		int t;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value temperature");
		t = sc.nextInt();

		if (t > 60) {
			System.out.println("пожарная ситуация");
		} else {
			System.out.println("all right, watching tv");
		}

	}

}
