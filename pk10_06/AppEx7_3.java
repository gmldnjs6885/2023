package pk10_06;
import java.util.Scanner;
public class AppEx7_3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n=0;
		int cnt=0;
		
		System.out.println("��� �ϰ� ���� ����� �Է��ϼ���");
		n=sc.nextInt();
		
		for(int i=1; i<=100; i++)
		{
			if(i%n==0)
			{
				System.out.printf("%d ",i);
				cnt++;
				if(cnt%7==0)
				{
					System.out.println();
				}
			}
		}
		
	}

}
