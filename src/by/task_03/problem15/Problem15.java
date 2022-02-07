package by.task_03.problem15;

//Вычислить: 1+2+4+8+..+2 в 10 степени.

public class Problem15 {

	public static void main(String[] args) {
		int sum = 1;
		int i = 1;

		while (i <= 10) {
			sum = 1 + sum * 2;
			System.out.println("sum = " + sum);
			i++;
		}

	}

}
