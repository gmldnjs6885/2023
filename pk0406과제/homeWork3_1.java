package pk0406과제;
import java.util.Scanner;
public class homeWork3_1 {

	public static void main(String[] args) {
		
		int month=0; 
		Scanner sc= new Scanner(System.in);



		while(month<1||month>12)	
		{
			System.out.printf("1월 ~12월에 해당되는 숫자를 입력하세요:");
			month =sc.nextInt();

			if(month<1||month>12)
			{
				System.out.printf("%d월은 없습니다. 다시 입력하세요\n",month);

			}
		}
		System.out.printf("당신은 %d월을 선택 하셨습니다.반갑습니다",month);





	}

}
