package by.task_03.problem16;

//Вычислить:(1+2)*(1+2+3)*(...)*(1+2+..10).

public class Problem16 {

	public static void main(String[] args) {
		long i = 0, prod = 1, x = 1;

		while (i < 10) {
			x = x + 2 + i;
			prod = prod * x;

			System.out.println("result = " + prod);
			i++;
		}

	}

}
