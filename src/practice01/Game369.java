package practice01;

public class Game369 {

	public static void main(String[] args) {
		int number;
		char c;

		for (int i = 1; i <= 99; i++) { //돌아가는애
			number = i;
			// System.out.println(i);
			String sNumber = String.valueOf(number);
			int hit = 0;
			// System.out.print(sNumber);
			for (int j = 0; j < sNumber.length(); j++) {//분석
				c = sNumber.charAt(j);
				hit++;
				// System.out.println(c);
				if (c == '3'|| c == '6' || c =='9') {
					System.out.print(sNumber+ " ");
					if(hit == 1)System.out.print("짝");
					if(hit == 2)System.out.print("짝짝");
					if(hit == 3)System.out.print("짝짝짝");
					System.out.println("");
				}

			}
		}

	}
}
