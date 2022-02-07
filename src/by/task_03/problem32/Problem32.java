package by.task_03.problem32;

import java.util.Scanner;

/*Проверить введенную пользователем строку на наличие недопустимых символов. В качестве первого символа допустимы только буквы
 * и знак подчеркивания.Остальные символы могут быть буквами, цифрами и знаком подчеркивания.*/

public class Problem32 {

	public static void main(String[] args) {
		String str;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert string value");
		str = sc.nextLine();

		char[] strToArray = str.toCharArray();
		if ((strToArray[0] >= 'A' & strToArray[0] <= 'Z') | (strToArray[0] >= 'a' & strToArray[0] <= 'z')
				| strToArray[0] == '_') {
			System.out.println("the first character is correct ");
			for (int i = 0; i < strToArray.length; i++) {
				if ((strToArray[i] >= 'A' & strToArray[i] <= 'Z') | (strToArray[i] >= 'a' & strToArray[i] <= 'z')
						| strToArray[i] == '_' | (strToArray[i] >= '0' & strToArray[i] <= '9')) {
					System.out.println(strToArray[i] + " the character is correct");
				} else {
					System.out.println(strToArray[i] + " the characters is not correct");
				}
			}
		} else {
			System.out.println("the first character is not correct");

		}
	}
}
