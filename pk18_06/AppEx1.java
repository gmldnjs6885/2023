package pk18_06;
import java.util.Scanner;
public class AppEx1 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);

		int k=0;
		double[] score;
		double sum,avg;
		sum=0;
		avg=0;
		System.out.println("�Է��� ������ �Է��Ͻÿ�");
		k=sc.nextInt();
		
		score=new double[k];
		
		for(int i=0; i<score.length; i++)
		{
			System.out.println("������ �Է��ϼ���");

			score[i]=sc.nextDouble();
		}
		sc.close();

		for(int i=0; i<score.length; i++)
		{
			sum+=score[i];
		}
		avg=sum/score.length;

		System.out.println("�Էµ� �����ʹ� :");
		for(int i=0; i<score.length; i++)
		{
			System.out.println(score[i]+" ");
			
		}
		
		System.out.printf("������ ������ %.2f,����� %.2f",sum,avg);
	}

}
