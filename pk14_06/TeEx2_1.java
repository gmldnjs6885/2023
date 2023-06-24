package pk14_06;
import java.util.Scanner;
public class TeEx2_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double sum,avg;
		sum=0;
		avg=0;
		double []n;
		n=new double [3];
		String score;
		
		
		for(int i=0; i<n.length;i++)
		{
			System.out.println("점수를 입력하세요");
			n[i]=sc.nextDouble();
			
			
		}
		
			for(int i=0; i<n.length;i++)
				sum+=n[i];
			
		avg=sum/n.length;
		
		
		if(avg>=90)
			score="A";
		else if(avg>=80)
			score="B";
		else if(avg>=70)
			score="C";
		else if(avg>=60)
			score="D";
		else
			score="F";
		
		System.out.printf("점수의 총합은 %.2f 평균은 %.2f 학점은 %s",sum,avg,score);
		
		
		
	}

}
