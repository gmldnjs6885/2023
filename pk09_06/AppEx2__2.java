package pk09_06;
import java.util.Scanner;
public class AppEx2__2 {

	public static void main(String[] args) {
		int n=0;
		String mo;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력할 문자와 반목 할 개수를 입력하세요 : ");
		
		mo= sc.next();
		n=sc.nextInt();
		
		System.out.print("출력 결과 : ");
		for(int i=0; i<n; i++)
		{
			System.out.printf(" %s ",mo);
		}
		

	}

}
 