package by.task_02.problem3;

import java.util.Scanner;

/*Cоставить программу сравнения введенного числа А и цифры 3. Вывести на экран слово -
 * "yes", если число A меньше 3;если число А больше, то вывести - слово "no".*/

public class Problem3 {

	public static void main(String[] args) {
		int numA;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value A");
		numA = sc.nextInt();

		if (numA < 3) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

}
