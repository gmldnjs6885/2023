package pk09_06;
import java.util.Scanner;
public class AppEx4_4 {

	public static void main(String[] args) {
		int n=0; 
		String [] name;
		Scanner sc= new Scanner(System.in);
		System.out.printf("�ݺ� ������ �Է� �ϼ��� :");
		n=sc.nextInt();

		name = new String[n];

		for(int i=0; i<n; i++)
		{
			System.out.printf("�̸��� �Է��ϼ���[%d]",i);
			name[i]=sc.next();

		}sc.close();

		System.out.printf("�Է��� �̸��� [");

		for(int i=0; i<n; i++)
		{
			if(i==n-1)
				System.out.printf("%s",name[i]);
			else
				System.out.printf("%s,",name[i]);

		}
		System.out.println("] �Դϴ� ");



	}

}
