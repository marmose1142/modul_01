package by.task_02.problem35;

import java.util.Scanner;

//Вычислить число и месяц в невисокосном году по номеру дня.

public class Problem35 {

	public static void main(String[] args) {
		int day;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		day = sc.nextInt();

		if (day > 0 & day <= 31) {
			System.out.println("January " + day);
		} else if (day > 31 & day <= 59) {
			day = day - 31;
			System.out.println("February " + day);
		} else if (day > 59 & day <= 90) {
			day = day - 59;
			System.out.println("March " + day);
		} else if (day > 90 & day <= 120) {
			day = day - 90;
			System.out.println("April " + day);
		} else if (day > 120 & day <= 151) {
			day = day - 120;
			System.out.println("May " + day);
		} else if (day > 151 & day <= 181) {
			day = day - 151;
			System.out.println("June " + day);
		} else if (day > 181 & day <= 212) {
			day = day - 181;
			System.out.println("July " + day);
		} else if (day > 212 & day <= 243) {
			day = day - 212;
			System.out.println("August " + day);
		} else if (day > 243 & day <= 273) {
			day = day - 243;
			System.out.println("September " + day);
		} else if (day > 273 & day <= 304) {
			day = day - 273;
			System.out.println("October " + day);
		} else if (day > 304 & day <= 334) {
			day = day - 304;
			System.out.println("November " + day);
		} else if (day > 334 & day <= 365) {
			day = day - 334;
			System.out.println("December " + day);
		} else {
			System.out.println("try again");
		}
	}
}
