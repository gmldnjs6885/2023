package pk0614;

import java.util.Scanner;
//객체프로그래밍
public class Ex2 {
	Scanner sc = new Scanner(System.in);

	double [] n;
	double sum,avg;
	int k;
	Ex2()
	{
		sum=0;
		avg=0;
	}

	void Hinput()
	{
		System.out.printf("입력할 수의 개수를 입력하세요");
		k=sc.nextInt();

		n=new double [k];
		for(int i=0; i<n.length; i++)
		{
			System.out.print("점수를 입력하시오:");
			n[i]=sc.nextDouble();
		}
	}

	void Sum()
	{
		for(int i=0; i<n.length; i++)
		{
			sum+=n[i];
		}
	}
	void Avg()
	{
		avg=sum/n.length;
	}

	void Hprint()
	{
		System.out.print("입력된 데이터는: ");

		for(int i=0; i<n.length; i++)
		{
			System.out.printf("%.1f  ",n[i]);

		}
		System.out.println();
		System.out.printf("점수의 총합은 %.2f이며 평균은 %.2f입니다",sum,avg);
	}
	public static void main(String[] args) {
		Ex2 k= new Ex2();
		k.Hinput();
		k.Sum();
		k.Avg();
		k.Hprint();
	}

}
