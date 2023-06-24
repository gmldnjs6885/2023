package pk04_6;

public class ForEx4 {
	//1 100 5 cnt sum
	public static void main(String[] args) {

		int i,cnt,sum;
		
		cnt=0;
		sum=0;

		for(i=1; i<=100; i++)
		{

			if(i%5==0)//짝수 일떄는 i%2==0 홀수는 i%2!=0
			{
				System.out.printf("%4d",i);
				cnt++;
				
				sum+=i;
			}

		}
		System.out.printf("\n 5의 배수 개수는 [%d]개 입니다.\n",cnt);
		System.out.printf("5의 배수의 합은 %d입니다.",sum);

	}

}
