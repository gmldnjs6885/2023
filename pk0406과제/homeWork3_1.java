package pk0406����;
import java.util.Scanner;
public class homeWork3_1 {

	public static void main(String[] args) {
		
		int month=0; 
		Scanner sc= new Scanner(System.in);



		while(month<1||month>12)	
		{
			System.out.printf("1�� ~12���� �ش�Ǵ� ���ڸ� �Է��ϼ���:");
			month =sc.nextInt();

			if(month<1||month>12)
			{
				System.out.printf("%d���� �����ϴ�. �ٽ� �Է��ϼ���\n",month);

			}
		}
		System.out.printf("����� %d���� ���� �ϼ̽��ϴ�.�ݰ����ϴ�",month);





	}

}
