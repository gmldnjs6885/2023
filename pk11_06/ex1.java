package pk11_06;

public class ex1 {

	public static void main(String[] args) {
		
			int i;
			int cnt=0;
			int sum=0;

			for(i=1; i<=100; i++)
			{
				if(i%5==0) {
					System.out.printf("%d ",i);
					cnt++;
					sum=sum+i;
					if(cnt%7==0)
						System.out.println();
				}

			}
			System.out.printf("\n5의 배수의 개수는 %d ",cnt);
			System.out.println("합은"+sum+"입니다");


		}


}
