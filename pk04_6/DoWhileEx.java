package pk04_6;

public class DoWhileEx {
	public static void main(String[] args) {

		int i,cnt,sum;

		cnt=0;
		sum=0;
		i=1;

		do//while(i<=100),for(i=1; i<=100; i++)
		{

			if(i%5==0)//¦�� �ϋ��� i%2==0 Ȧ���� i%2!=0
			{
				System.out.printf("%4d",i);

				cnt++;
				sum+=i;

				if(cnt%7==0)//7�� ���� �� �ٲ� ����
					System.out.println();
			}

			i++;

		}while(i<=100); 

		System.out.printf("\n 5�� ��� ������ [%d]�� �̰�,",cnt);
		System.out.printf("5�� ����� ���� %d�Դϴ�.",sum);

	}

}
