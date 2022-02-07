package by.task_03.problem30;

import java.util.Scanner;

//Написать программу переводящую римские цифры в арабские.

public class Problem30 {

	public static void main(String[] args) {
		String roma;
		byte arabic;

		while (true) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("Please, insert value of the roman number");
			roma = sc.nextLine();

			if (roma.equals("I") | roma.equals("II") | roma.equals("III") | roma.equals("IV") | roma.equals("V")
					| roma.equals("VI") | roma.equals("VII") | roma.equals("VIII") | roma.equals("IX")) {
				switch (roma) {
				case "I":
					arabic = 1;
					System.out.println(" I = " + arabic);
					break;
				case "II":
					arabic = 2;
					System.out.println(" II = " + arabic);
					break;
				case "III":
					arabic = 3;
					System.out.println(" III = " + arabic);
					break;
				case "IV":
					arabic = 4;
					System.out.println(" IV = " + arabic);
					break;
				case "V":
					arabic = 5;
					System.out.println(" V = " + arabic);
					break;
				case "VI":
					arabic = 6;
					System.out.println(" VI = " + arabic);
					break;
				case "VII":
					arabic = 7;
					System.out.println(" VII = " + arabic);
					break;
				case "VIII":
					arabic = 8;
					System.out.println(" VIII = " + arabic);
					break;
				case "IX":
					arabic = 9;
					System.out.println(" IX = " + arabic);
					break;
				}
			} else {
				System.out.println("try again");
			}

		}

	}
}