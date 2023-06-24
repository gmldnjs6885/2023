package pk15_06;

import java.util.Scanner;

public class AppEx9 {
	double [] n;




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

	double Sum()
	{
		double sum=0;
		for(int i=0; i<n.length; i++)
		{
			sum+=n[i];
		}
		return sum;
	}
	double Avg(double sum)
	{
		
		return sum/n.length;
	}

	String IfIf(double avg)
	{
		
		if(avg>=90)
			return "A";
		else if	
		(avg>=80)
			return"B";
		else if
		(avg>=70)
			return"C";
		else if
		(avg>=60)
			return"D";
		else 
			return"F";
		


	}
	


	

	public static void main(String[] args) {
		AppEx9 k=new AppEx9();

		k.For();
		System.out.printf("합은 %.2f 평균은 %.2f 학점은 %s",k.Sum(),k.Avg(k.Sum()),k.IfIf(k.Avg(k.Sum())));
		

	}

}
