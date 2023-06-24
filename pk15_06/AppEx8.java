package pk15_06;
import java.util.Scanner;
public class AppEx8 {

	double sum,avg;
	double [] n;
	String score;

	AppEx8()
	{
		sum=0;
		avg=0;

	}

	void For() {
		Scanner sc = new Scanner(System.in);
		n=new double [3];

		for(int i=0; i<n.length; i++)
		{
			System.out.printf("점수를 입력하세요");
			n[i]=sc.nextDouble();

		}
		sc.close();
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

	void IfIf()
	{
		if(avg>=90)
			score="A";
		else if
		(avg>=80)
			score="B";
		else if
		(avg>=70)
			score="C";
		else if
		(avg>=60)
			score="D";
		else 
			score="F";


	}

	void Print()
	{
		System.out.printf("합은 %.2f 평균은 %.2f 학점은 %s",sum,avg,score);
	}

	public static void main(String[] args) {
		AppEx8 k=new AppEx8();

		k.For();
		k.Sum();
		k.Avg();
		k.IfIf();
		k.Print();

	}

}
