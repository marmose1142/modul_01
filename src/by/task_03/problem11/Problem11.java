package by.task_03.problem11;

//Составить программу нахождения разности кубов первых двухсот чисел.

public class Problem11 {

	public static void main(String[] args) {
		int i = 1, x = 0;

		while (i <= 200) {
			x = (int) (Math.pow(i, 3) - x);
			System.out.println("the difference = " + x);
			i++;
		}

	}

}
