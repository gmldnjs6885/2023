package pk10_06;
import java.util.Scanner;
public class AppEx7_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double [] n;
		n=new double [3];
		int sum=0;
		int avg=0;
		char a;
		
		for(int i=0; i<n.length; i++)
		{
			System.out.println("점수를 입력하세요");
			n[i]=sc.nextDouble();
			sum=sum+(int)n[i];
			
		
		}
		avg=sum/n.length;
		
		
		if(avg>=90)
			a='A';
		else if(avg>=80)
			a='B';
		else if(avg>=70)
			a='C';
		else if(avg>=60)
			a='D';
		else 
			a='F';
		
		System.out.printf("점수의 총합은 %d 평균은%d 학점은%c",sum,avg,a);
	
		
		
		
	
		
		
		
		
	}

}
