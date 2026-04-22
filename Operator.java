package jump2java;
import java.util.Scanner;

public class Operator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요.");
		int month = sc.nextInt();
		
		if(month == 3 || month ==4 || month == 5) {
			System.out.println("봄이다!!");
		} else {
			System.out.println("봄이 아니다!!");
		}
	}

}
