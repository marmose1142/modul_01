package by.task_03.problem37;

/*Даны два двухзначных числа А и В. Из этих чисел составили 2 четырехзначных числа:
 * первое число получили путем написания сначало А, затем В. Для получения второго числа сначала 
 * записали число В, а потом А. Найти числа А и В если известно, что первое четырехзначное число нацело делится на 99,
 * а второе на 49. */

public class Problem37 {

	public static void main(String[] args) {
		int A;
		int B;
		int first4num;
		int second4num;

		for (first4num = 1000; first4num < 10000; first4num++) {
			for (second4num = 1000; second4num < 10000; second4num++) {
				if ((first4num % 99 == 0 & second4num % 49 == 0)
						& (first4num % 100 == second4num / 100 & second4num % 100 == first4num / 100)) {
					A = first4num / 100;
					B = second4num / 100;
					System.out.println("A = " + A + " " + "B = " + B);

				}
			}
		}

	}

}
