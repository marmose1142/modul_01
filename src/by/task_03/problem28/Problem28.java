package by.task_03.problem28;

import java.util.Scanner;

/*Написать программу в которой вводятся два операнда X и Y и знак операции (+,-,/,*).Вычислить результат Z
 * в зависимости от знака.Предусмотреть реакции на возможный неверный знак операции, а также на ввод Y=0
 * при делении.Организовать возможность многократных вычислений без перезагрузки программы 
 * (т.е. построить цикл).В качестве символа прекращения вычислений принять "0".*/

public class Problem28 {

	public static void main(String[] args) {
		double x;
		double y;
		char mark;
		double z;

		while (true) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("Please, insert value x");
			x = sc.nextDouble();
			System.out.println("Please, insert value y");
			y = sc.nextDouble();
			System.out.println("Please, insert value mark");
			mark = sc.next().charAt(0);

			if (mark == '+' | mark == '-' | mark == '*' | mark == '/') {
				switch (mark) {
				case '+':
					z = x + y;
					System.out.println(z);
					break;
				case '-':
					z = x - y;
					System.out.println(z);
					break;
				case '*':
					z = x * y;
					System.out.println(z);
					break;
				case '/':
					if (y != 0) {
						z = x / y;
						System.out.println(z);
						break;
					} else {
						System.out.println("try again, you can't divide by zero ");
					}
				}
			} else if (mark == '0') {
				System.out.println("the end");
				break;
			} else {
				System.out.println("Try again");
			}
		}
	}
}
