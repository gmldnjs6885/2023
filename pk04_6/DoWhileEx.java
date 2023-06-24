package pk04_6;

public class DoWhileEx {
	public static void main(String[] args) {

		int i,cnt,sum;

		cnt=0;
		sum=0;
		i=1;

		do//while(i<=100),for(i=1; i<=100; i++)
		{

			if(i%5==0)//짝수 일떄는 i%2==0 홀수는 i%2!=0
			{
				System.out.printf("%4d",i);

				cnt++;
				sum+=i;

				if(cnt%7==0)//7개 마다 줄 바꿈 해줌
					System.out.println();
			}

			i++;

		}while(i<=100); 

		System.out.printf("\n 5의 배수 개수는 [%d]개 이고,",cnt);
		System.out.printf("5의 배수의 합은 %d입니다.",sum);

	}

}
