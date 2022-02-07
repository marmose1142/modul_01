package by.task_03.problem39;

/*В трехзначном числе зачеркнули старшую цифру. Когда полученное число умножили на 7, то получили
 * исходное число.Найти это число.
 */

public class Problem39 {

	public static void main(String[] args) {
		int num = 100;
		int supportNum;

		for (int i = 100; i < 1000; i++) {
			supportNum = num % 100;
			if (supportNum * 7 == num) {
				System.out.println(num);
			}
			num++;
		}

	}

}
