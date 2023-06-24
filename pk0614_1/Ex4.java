package pk0614_1;

import java.util.Scanner;

abstract class DBEx4{

	int n;
	double k[];
	double sum,avg;
	abstract void Hinput();
	abstract void Sum();
	abstract void Avg();
	
	

	void Hprint()
	{
		System.out.printf("입력된 데이터는 : ");

		for(int i=0; i<k.length; i++)
		{
			System.out.printf("%.1f ",k[i]);
		}
		System.out.println();

		System.out.printf("점수의 총합은 %.2f이며 , 평균은 %.2f입니다",sum,avg);
	}
}

	class Ex4 extends DBEx4 {
		void Hinput()
		{
			Scanner sc = new Scanner(System.in);

			System.out.print("입력 할 점수의 개수를 입력하시오:");
			n=sc.nextInt();

			k=new double [n];

			for(int i=0; i<k.length; i++)
			{
				System.out.printf("점수를 입력하시오");
				k[i]=sc.nextDouble();
			}
		}
		void Sum()
		{
			sum=0;
			for(int i=0; i<k.length; i++)
			{
				sum+=k[i];
			}
		}

		void Avg()
		{
			avg=0;
			avg=sum/k.length;
		}
		
	

	public static void main(String[] args) {

		Ex4 k =new Ex4();
		k.Hinput();
		k.Sum();
		k.Avg();
		k.Hprint();

	}

}
