package pk18_06;

import java.util.Scanner;

interface InterAppEx5{
	void KK();
	void Score();
	void Sum();
	void Avg();
}
class BaseDataAppEx5
{
	int k;
	double[] score;
	double sum,avg;
	Scanner sc= new Scanner(System.in);


	void Hprint()
	{
		System.out.println("�Էµ� �����ʹ� :");
		for(int i=0; i<score.length; i++)
		{
			System.out.println(score[i]+" ");

		}

		System.out.printf("������ ������ %.2f,����� %.2f",sum,avg);
	}
}
public class AppEx5 extends BaseDataAppEx5 implements InterAppEx5  {

	public void KK()
	{

		System.out.println("�Է��� ������ �Է��Ͻÿ�");
		k=sc.nextInt();
		score=new double[k];
	}
	public void Score() {
		for(int i=0; i<k; i++)
		{
			System.out.println("������ �Է��ϼ���");

			score[i]=sc.nextDouble();
		}
		sc.close();
	}
	public void Sum() {

		for(int i=0; i<score.length; i++)
		{
			sum+=score[i];
		}
	}
	public void Avg()
	{
		avg=sum/score.length;
	}


	public static void main(String[] args) {
		AppEx5 n= new AppEx5();

		n.KK();
		n.Score();
		n.Sum();
		n.Avg();
		n.Hprint();
	}
}