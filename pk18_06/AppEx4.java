package pk18_06;

import java.util.Scanner;

abstract class BaseDataAppEx4
{
	int k;
	double[] score;
	double sum,avg;

	abstract void KK();
	abstract void Score();
	abstract void Sum();
	abstract void Avg();
	void Hprint()
	{
		System.out.println("입력된 데이터는 :");
		for(int i=0; i<score.length; i++)
		{
			System.out.println(score[i]+" ");

		}

		System.out.printf("점수의 총합은 %.2f,평균은 %.2f",sum,avg);
	}
}
public class AppEx4 extends BaseDataAppEx4 {
	Scanner sc= new Scanner(System.in);

	void KK()
	{

		System.out.println("입력할 개수를 입력하시오");
		k=sc.nextInt();
		score=new double[k];
	}
	void Score() {
		for(int i=0; i<k; i++)
		{
			System.out.println("점수를 입력하세요");

			score[i]=sc.nextDouble();
		}
		sc.close();
	}
	void Sum() {

		for(int i=0; i<score.length; i++)
		{
			sum+=score[i];
		}
	}
	void Avg()
	{
		avg=sum/score.length;
	}


	public static void main(String[] args) {
		AppEx4 n= new AppEx4();

		n.KK();
		n.Score();
		n.Sum();
		n.Avg();
		n.Hprint();
	}
}

