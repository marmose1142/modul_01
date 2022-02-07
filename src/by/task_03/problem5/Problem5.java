package by.task_03.problem5;

/*С помощью оператора while напишите программу определения суммы всех нечетных чисел
 * в диапазоне от 1 до 99 включительно.*/

public class Problem5 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;

		while (i <= 99) {
			sum = sum + i;
			i = i + 2;
			System.out.println(sum);
		}

	}

}
