package by.task_02.problem2;

/*Составить программу сравнения двух чисел 1 и 2.Если 1 меньше 2 - вывести на
 *экран слово "yes", в противном случае - слово "no".*/

public class Problem2 {

	public static void main(String[] args) {
		byte numOne = 1;
		byte numTwo = 2;

		if (numOne < numTwo) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}

}
