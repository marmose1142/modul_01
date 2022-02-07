package by.task_03.problem12;

/*Последовательность An строится так:A1 = 1; An = 6 + A(n - 1), для каждого n > 1.
 *Cоставьте программу нахождения произведения первых десяти членов этой последовательности.*/

public class Problem12 {

	public static void main(String[] args) {

		int An;
		int pr = 1;

		for (int i = 1; i <= 10; i++) {
			if (i == 1) {
				An = 1;
				pr = pr * An;
				System.out.println("product of numbers = " + pr);
			} else {
				An = i - 1;
				An = 6 + An;
				pr = pr * An;
				System.out.println("product of numbers = " + pr);
			}
		}
	}
}
