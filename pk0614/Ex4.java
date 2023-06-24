package pk0614;

import java.util.Scanner;


abstract class BaseDataAppEx4 {

		double [] n;
		double sum,avg;
		int g;
		
		abstract void Hinput();
		abstract void Sum();
		abstract void Avg();
		
		
		void Hprint()
		{
			System.out.print("입력된 데이터는: ");

			for(int i=0; i<n.length; i++)
			{
				System.out.printf("%.1f  ",n[i]);

			}
			System.out.println();
			System.out.printf("점수의 총합은 %.2f이며 평균은 %.2f입니다",sum,avg);
		}
	}
		public class Ex4 extends BaseDataAppEx4{ 

		
		void Hinput()
		{
			Scanner sc = new Scanner(System.in);

			System.out.printf("입력할 수의 개수를 입력하세요");
			g=sc.nextInt();

			n=new double [g];
			for(int i=0; i<n.length; i++)
			{
				System.out.print("점수를 입력하시오:");
				n[i]=sc.nextDouble();
			}
		}

		void Sum()
		{
			sum=0;
			for(int i=0; i<n.length; i++)
			{
				sum+=n[i];
			}
		}
		void Avg()
		{
			avg=0;
			avg=sum/n.length;
		}


		public static void main(String[] args) {
			Ex4 k= new Ex4();

			k.Hinput();
			k.Sum();
			k.Avg();
			k.Hprint();


		}
	}

