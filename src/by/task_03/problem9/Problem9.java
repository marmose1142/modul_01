package by.task_03.problem9;

//Найти сумму квадратов первых ста чисел.

public class Problem9 {

	public static void main(String[] args) {
		double x = 0;
		double i = 1;

		while (i <= 100) {
			x = x + Math.pow(i, 2);
			System.out.println("sum = " + x);
			i++;
		}

	}

}
