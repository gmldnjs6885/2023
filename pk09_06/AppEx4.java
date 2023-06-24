package pk09_06;
import java.util.Scanner;
public class AppEx4 {

	public static void main(String[] args) {
		int cnt=0; 
		Scanner sc= new Scanner(System.in);

		System.out.println("반복 개수를 입력 하세요 ");
		cnt= sc.nextInt();

		String [] ban;
		ban = new String[cnt];//배열 선언한거 

		for(int i=0; i<cnt; i++)
		{
			System.out.printf("이름을 입력하세요[%d] ",i);

			ban [i]=sc.next();
		}
		sc.close();
		
		System.out.print("입력한 이름은 : [ ");
		for(int i=0; i<cnt; i++)
		{
			if(i==cnt-1)//인덱스는 0부터 시작해서 카운트가 원하는 것 보다 1이 커서 -1
			 System.out.printf("%s",ban[i]);
			else 
				System.out.printf("%s ,",ban[i]);
			
		}
		System.out.println("]입니다");
		
	



	}

}
