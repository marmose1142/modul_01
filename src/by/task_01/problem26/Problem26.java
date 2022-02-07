package by.task_01.problem26;

import java.util.Scanner;

//Составить программу перевода радианной меры угла в градусы, минуты и секунды.

public class Problem26 {

	public static void main(String[] args) {
		double r, d, min, sec;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value r(in radians)");
		r = sc.nextDouble();

		d = Math.toDegrees(r);
		min = r * 3437.75;
		sec = r * 206264.99;

		System.out.println("Degrees = " + d);
		System.out.println("Minutes = " + min);
		System.out.println("Seconds = " + sec);
	}

}
