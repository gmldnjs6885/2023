package pk09_06;
import java.util.Scanner;
public class AppEx2__2 {

	public static void main(String[] args) {
		int n=0;
		String mo;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�Է��� ���ڿ� �ݸ� �� ������ �Է��ϼ��� : ");
		
		mo= sc.next();
		n=sc.nextInt();
		
		System.out.print("��� ��� : ");
		for(int i=0; i<n; i++)
		{
			System.out.printf(" %s ",mo);
		}
		

	}

}
 