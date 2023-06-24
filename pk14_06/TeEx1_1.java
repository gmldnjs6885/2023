package pk14_06;

public class TeEx1_1 {

	public static void main(String[] args) {

		int sum;
		int num;
		sum=0;
		num=0;
		
		for(int i=1; i<=100; i++)
		{
			if(i%5==0)
			{
				System.out.printf("%d ",i);
				sum+=i;
				num++;
				if(num%7==0)
					System.out.println();
			}
			
			
		}
		System.out.println();
		System.out.printf("합은 %d 개수는 %d",sum,num);
	}

}
