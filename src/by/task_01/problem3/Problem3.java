package by.task_01.problem3;

import java.util.Scanner;

/*Написать код для решения задачи. В n малых бидонах 80л молока.Сколько литров в m больших
бидонах, если в каждом большом бидоне на 12л больше,чем в малом?*/

public class Problem3 {

	public static void main(String[] args) {
		double n;
		double m;
		double x;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert the number n");
		n = sc.nextDouble();
		System.out.println("Please, insert the number m");
		m = sc.nextDouble();
		sc.close();

		x = (80 / n + 12) * m;
		System.out.println("In big water-cans = " + x + " liters milk");

	}

}
