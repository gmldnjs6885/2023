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
			System.out.printf("������ �Է��ϼ���");

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
		
		

		System.out.printf("����� ���� ������ %.2.f ����� %.2f ������ %c",sum,avg,hag);

	}

}
