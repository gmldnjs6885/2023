package pk09_06;
import java.util.Scanner;
public class AppEx2 {

	public static void main(String[] args) {
		int cnt=0; 
		String spah;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("�Է��� ���ڿ� �ݺ� �� ������ �Է��ϼ���");
		spah = sc.next();
		cnt=sc.nextInt();
		
		
		System.out.printf("��� ��� :");
		for(int i=0; i<cnt; i++)
		{
			System.out.printf("%s",spah);
		}
		
		
	}

}
