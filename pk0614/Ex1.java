package pk0614;
import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double [] n;
		double sum,avg;
		sum=0;
		avg=0;
		int k;
		
		System.out.printf("입력할 수의 개수를 입력하세요");
		k=sc.nextInt();
		
		n=new double [k];
		for(int i=0; i<n.length; i++)
		{
			System.out.print("점수를 입력하시오:");
			n[i]=sc.nextDouble();
		}
		
		
		for(int i=0; i<n.length; i++)
		{
			sum+=n[i];
		}
		avg=sum/n.length;
		System.out.print("입력된 데이터는: ");

		for(int i=0; i<n.length; i++)
		{
			System.out.printf("%.1f  ",n[i]);
			
		}
		System.out.println();
		System.out.printf("점수의 총합은 %.2f이며 평균은 %.2f입니다",sum,avg);
	}
}
