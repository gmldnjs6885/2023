package pk18_06;

import java.util.Scanner;
class BaseDataAppEx3
{
	int k;
	double[] score;
	double sum,avg;
	
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
public class AppEx3 extends BaseDataAppEx3 {
	Scanner sc= new Scanner(System.in);

	void KK()
	{
	
	System.out.println("�Է��� ������ �Է��Ͻÿ�");
	k=sc.nextInt();
	score=new double[k];
	}
	void Score() {
	for(int i=0; i<k; i++)
	{
		System.out.println("������ �Է��ϼ���");

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
		AppEx3 n= new AppEx3();
		
		n.KK();
		n.Score();
		n.Sum();
		n.Avg();
		n.Hprint();
	}


}
