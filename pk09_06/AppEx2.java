package pk09_06;
import java.util.Scanner;
public class AppEx2 {

	public static void main(String[] args) {
		int cnt=0; 
		String spah;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("입력할 문자와 반복 할 개수를 입력하세요");
		spah = sc.next();
		cnt=sc.nextInt();
		
		
		System.out.printf("출력 결과 :");
		for(int i=0; i<cnt; i++)
		{
			System.out.printf("%s",spah);
		}
		
		
	}

}
