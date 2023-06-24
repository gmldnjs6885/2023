package pk0614_1;
//객체
import java.util.Scanner;

public class Ex2 {
	int n;
	double k[];
	double sum,avg;

	Ex2()
	{
		sum=0; avg=0;
	}
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
		for(int i=0; i<k.length; i++)
		{
			sum+=k[i];
		}
	}

	void Avg()
	{
		avg=sum/k.length;
	}
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
	public static void main(String[] args) {

		Ex2 k =new  Ex2();
		k.Hinput();
		k.Sum();
		k.Avg();
		k.Hprint();
		
	}

}
