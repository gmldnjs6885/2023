package pk09_06;
import java.util.Scanner;
public class AppEx2_2 {

	public static void main(String[] args) {
		String ahdid;
		int cnt;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("입력할 문자와 반복할 개수를 입력하세요");
		ahdid = sc.next();
		cnt = sc.nextInt();
		
		System.out.print("출력 결과 : ");
		for(int i=0; i<cnt; i++)
		{
			System.out.printf("%s"+" ",ahdid);
		}
		

	}

}
