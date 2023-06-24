package Pk05_6;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc;
		int d;
		String msg;

		sc = new Scanner(System.in);
		System.out.println("기호와 반복할 개수를 입력하세요 ");
		msg=sc.next();
		d=sc.nextInt();

		sc.close();

		
		System.out.printf("입력한 기호는 [%s]이고,반복할 개수는[%d]입니다 ",msg,d);





	}

}
