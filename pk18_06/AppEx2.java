package pk18_06;
import java.util.Scanner;
public class AppEx2 {
	Scanner sc= new Scanner(System.in);

	int k;
	double[] score;
	double sum,avg;
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
	void Hprint()
	{
	System.out.println("입력된 데이터는 :");
	for(int i=0; i<score.length; i++)
	{
		System.out.println(score[i]+" ");

	}

	System.out.printf("점수의 총합은 %.2f,평균은 %.2f",sum,avg);
	}
	
	public static void main(String[] args) {
		AppEx2 n= new AppEx2();
		
		n.KK();
		n.Score();
		n.Sum();
		n.Avg();
		n.Hprint();
	}


}


