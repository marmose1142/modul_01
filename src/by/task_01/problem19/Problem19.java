package by.task_01.problem19;

import java.util.Scanner;

/*Дано действительное число R вида nnn.ddd(три цифровых разряда в дробной и целой части).
Поменять местами дробную и целую части числа и вывести полученное значение числа.*/

public class Problem19 {

	public static void main(String[] args) {
		double r;
		double res;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value r(nnn.ddd)");
		r = sc.nextDouble();

		res = r * 1000 % 1000 + (int) r / 1000.0;
		System.out.println("result = " + res);

	}

}
