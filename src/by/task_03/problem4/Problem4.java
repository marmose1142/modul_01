package by.task_03.problem4;

/* C помощью оператора while напишите программу вывода всех четных чисел в диапазоне 
 * от 2 до 100 включительно.*/

public class Problem4 {

	public static void main(String[] args) {
		int i = 2;
		while (i <= 100) {
			System.out.println(i);
			i = i + 2;
		}
	}

}
