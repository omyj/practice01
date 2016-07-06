package practice01;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {

		Random random = new Random();
		int number;
		number = random.nextInt(100) + 1;
		System.out.print("수를 결정하였습니다. 맞추어 보세요");
		System.out.println(number);

		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);

		int min = 1;
		int max = 100;
		int choice;
		String answer;

		while (true) {
			System.out.println(min + "-" + max);
			System.out.print(">>");
			choice = scanner.nextInt();

			if (number > choice) {
				System.out.println("더 높게");
				min = choice;
			} else if (number < choice) {
				System.out.println("더 낮게");
				max = choice;
			} else if (number == choice) {
				System.out.println("맞았습니다.");
				System.out.println("다시 하겠습니까(y/n)");
				answer = scanner2.next();
				if (answer.equals("y")) {
					number = random.nextInt(100) + 1;
					System.out.print("수를 결정하였습니다. 맞추어 보세요");
					System.out.println(number);
					min = 1;
					max = 100;
				} else if (answer.equals("n"))
					break;
			}
		}
	}
}