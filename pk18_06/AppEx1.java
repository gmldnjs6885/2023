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
		System.out.println("입력할 개수를 입력하시오");
		k=sc.nextInt();
		
		score=new double[k];
		
		for(int i=0; i<score.length; i++)
		{
			System.out.println("점수를 입력하세요");

			score[i]=sc.nextDouble();
		}
		sc.close();

		for(int i=0; i<score.length; i++)
		{
			sum+=score[i];
		}
		avg=sum/score.length;

		System.out.println("입력된 데이터는 :");
		for(int i=0; i<score.length; i++)
		{
			System.out.println(score[i]+" ");
			
		}
		
		System.out.printf("점수의 총합은 %.2f,평균은 %.2f",sum,avg);
	}

}
