package pk09_06;
import java.util.Scanner;
public class AppEx4 {

	public static void main(String[] args) {
		int cnt=0; 
		Scanner sc= new Scanner(System.in);

		System.out.println("�ݺ� ������ �Է� �ϼ��� ");
		cnt= sc.nextInt();

		String [] ban;
		ban = new String[cnt];//�迭 �����Ѱ� 

		for(int i=0; i<cnt; i++)
		{
			System.out.printf("�̸��� �Է��ϼ���[%d] ",i);

			ban [i]=sc.next();
		}
		sc.close();
		
		System.out.print("�Է��� �̸��� : [ ");
		for(int i=0; i<cnt; i++)
		{
			if(i==cnt-1)//�ε����� 0���� �����ؼ� ī��Ʈ�� ���ϴ� �� ���� 1�� Ŀ�� -1
			 System.out.printf("%s",ban[i]);
			else 
				System.out.printf("%s ,",ban[i]);
			
		}
		System.out.println("]�Դϴ�");
		
	



	}

}
