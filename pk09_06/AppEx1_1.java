package pk09_06;

public class AppEx1_1 {

	public static void main(String[] args) {
		int u=0;
		int sum=0;
		for(int i=1; i<100; i++)
		{
			if(i%5==0)
			{
				System.out.print(i+" ");
				u++;
				sum+=i;

				if(u%7==0) 
					System.out.println();
			}
		}//end of for i
		System.out.println("\n5의 배수 개수: "+u);
		System.out.println("5의 배수의 합 "+sum);

	}

}
