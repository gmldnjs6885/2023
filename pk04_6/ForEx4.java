package pk04_6;

public class ForEx4 {
	//1 100 5 cnt sum
	public static void main(String[] args) {

		int i,cnt,sum;
		
		cnt=0;
		sum=0;

		for(i=1; i<=100; i++)
		{

			if(i%5==0)//¦�� �ϋ��� i%2==0 Ȧ���� i%2!=0
			{
				System.out.printf("%4d",i);
				cnt++;
				
				sum+=i;
			}

		}
		System.out.printf("\n 5�� ��� ������ [%d]�� �Դϴ�.\n",cnt);
		System.out.printf("5�� ����� ���� %d�Դϴ�.",sum);

	}

}
