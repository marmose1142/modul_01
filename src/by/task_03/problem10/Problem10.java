package by.task_03.problem10;

//Составить программу нахождения произведения квадратов первых двухсот чисел.

public class Problem10 {

	public static void main(String[] args) {
		double x = 1, i = 1;

		while (i <= 200) {
			x = x * Math.pow(i, 2);
			System.out.println("product of squares of " + i + " numbers  = " + x);
			i++;
		}

	}

}
