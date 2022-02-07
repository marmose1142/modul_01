package by.task_01.problem12;

//Написать программу,которая выводит на экран первые 4 степени числа Пи.

public class Problem12 {

	public static void main(String[] args) {
		double p = 3.14;
		double res;
		double x;

		for (x = 1; x < 5; x++) {
			res = Math.pow(p, x);
			System.out.println("Result = " + res);
		}
	}
}
