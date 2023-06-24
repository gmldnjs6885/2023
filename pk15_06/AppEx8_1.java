package pk15_06;
import java.util.Scanner;
public class AppEx8_1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		double sum,avg;
		double [] n;
		char hag;


		sum=0;
		avg=0;
		n=new double [3];


		for(int i=0; i<n.length; i++)
		{
			System.out.printf("점수를 입력하세요");

			n[i]=sc.nextDouble();

		}
		sc.close();
		
		for(int i=0; i<n.length;i++)
		{
			sum+=n[i];
		}
		
		avg=sum/n.length;
		
		if(avg>=90)
		
			hag='A';
		else if(avg>=80)
		hag='B';
		else if(avg>=70)
			hag='C';
		else if(avg>=60)
			hag='D';
		else 
			hag='F';
		
		

		System.out.printf("당신의 점수 총합은 %.2.f 평균은 %.2f 학점은 %c",sum,avg,hag);

	}

}
