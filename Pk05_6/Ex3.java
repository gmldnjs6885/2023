package Pk05_6;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc;
		int d,i;
		String msg;

		sc = new Scanner(System.in);
		System.out.println("기호와 반복할 개수를 입력하세요:");
		msg=sc.next();
		d=sc.nextInt();

		sc.close();
		
		
		
		System.out.printf("입력한 기호는 [%s]이고,반복할 개수는[%d]입니다\n",msg,d);
		
		for(i=0; i<d; i++)//(int i=1; i<=d; i++)로 쓸 수도 있 
			System.out.printf("%s",msg);
		System.out.println("("+d+")");

	}

}
