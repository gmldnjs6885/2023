package pk10_06;

public class AppEx7_1 {

	public static void main(String[] args) {
		int cnt=0; 
		int sum=0;

		for(int i=1; i<=100; i++)
		{
			if(i%5==0) 
			{
			
				System.out.printf("%d ",i);
				 cnt++;
				 sum+=i;
				if(cnt%7==0)
				{
					System.out.println();
				}
			}
		
		}
		System.out.println();
		System.out.printf("����� ������ %d ����� ���� %d\n",cnt,sum); 
	}

}
