package pk09_06;
import java.util.Scanner;
public class AppEx2_2 {

	public static void main(String[] args) {
		String ahdid;
		int cnt;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("�Է��� ���ڿ� �ݺ��� ������ �Է��ϼ���");
		ahdid = sc.next();
		cnt = sc.nextInt();
		
		System.out.print("��� ��� : ");
		for(int i=0; i<cnt; i++)
		{
			System.out.printf("%s"+" ",ahdid);
		}
		

	}

}
