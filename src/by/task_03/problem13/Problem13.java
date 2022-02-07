package by.task_03.problem13;

//Составить таблицу значений функции y=5-x^2/2;на отрезке [-5;5] c шагом 0,5

public class Problem13 {

	public static void main(String[] args) {
		double a = -5;
		byte b = 5;
		double h = 0.5;
		double x;
		double y;

		System.out.println("     " + " x " + " | " + " y ");
		while (a < b) {
			x = a;
			y = 5 - x * x / 2;
			System.out.println("-----------------------");
			System.out.println("x = " + x + " | " + "y = " + y);
			a = a + h;
		}
	}

}
