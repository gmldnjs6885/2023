package pk04_6;

public class ForEx3 {
	// 1 100 5 cnt
	public static void main(String[] args) {

		int i,cnt;
		cnt=0;

		for(i=1; i<=100; i++)
		{

			if(i%5==0)//¦�� �ϋ��� i%2==0 Ȧ���� i%2!=0
			{
				System.out.printf("%4d",i);
				cnt++;
			}

		}
		System.out.printf("\n 5�� ��� ������ [%d]�� �Դϴ�.",cnt);

	}
}
