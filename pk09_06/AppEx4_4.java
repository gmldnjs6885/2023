package pk09_06;
import java.util.Scanner;
public class AppEx4_4 {

	public static void main(String[] args) {
		int n=0; 
		String [] name;
		Scanner sc= new Scanner(System.in);
		System.out.printf("반복 개수를 입력 하세요 :");
		n=sc.nextInt();

		name = new String[n];

		for(int i=0; i<n; i++)
		{
			System.out.printf("이름을 입력하세요[%d]",i);
			name[i]=sc.next();

		}sc.close();

		System.out.printf("입력한 이름은 [");

		for(int i=0; i<n; i++)
		{
			if(i==n-1)
				System.out.printf("%s",name[i]);
			else
				System.out.printf("%s,",name[i]);

		}
		System.out.println("] 입니다 ");



	}

}
