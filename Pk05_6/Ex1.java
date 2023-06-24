package Pk05_6;
import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		Scanner sc;
		int d;
		String msg;

		sc = new Scanner(System.in);
		System.out.println("정수형을 입력하세요");
		d=sc.nextInt();

		sc.close();

		if(d%2==0)
			msg="짝수";

		else
			msg="홀수";

		System.out.printf("입력한 수는 [%d]이고,[%s]입니다 ",d,msg);





	}

}
