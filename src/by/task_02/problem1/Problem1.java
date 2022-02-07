package by.task_02.problem1;

/*Cоставить программу сравнения двух чисел 1 и 2.Если 1 меньше 2 - вывести на
экран цифру - 7, в противном случае цифру - 8.*/

public class Problem1 {

	public static void main(String[] args) {
		byte numOne = 1;
		byte numTwo = 2;
		byte numSeven = 7;
		byte numEight = 8;

		if (numOne < numTwo) {
			System.out.println(numSeven);
		} else {
			System.out.println(numEight);
		}

	}

}
