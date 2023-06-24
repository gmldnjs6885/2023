package pk0614_1;
import java.util.Scanner;
public class Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		double k[];
		double sum,avg;
		
		sum=0; avg=0;
		
		System.out.print("입력 할 점수의 개수를 입력하시오:");
		n=sc.nextInt();
		
		k=new double [n];
		
		for(int i=0; i<k.length; i++)
		{
			System.out.printf("점수를 입력하시오");
			k[i]=sc.nextDouble();
		}
		
		for(int i=0; i<k.length; i++)
		{
			sum+=k[i];
		}
		avg=sum/k.length;
		
		System.out.printf("입력된 데이터는 : ");
		
		for(int i=0; i<k.length; i++)
		{
			System.out.printf("%.1f ",k[i]);
		}
		System.out.println();
		
		System.out.printf("점수의 총합은 %.2f이며 , 평균은 %.2f입니다",sum,avg);
		
		
	}

}
