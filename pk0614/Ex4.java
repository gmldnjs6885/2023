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
			System.out.print("�Էµ� �����ʹ�: ");

			for(int i=0; i<n.length; i++)
			{
				System.out.printf("%.1f  ",n[i]);

			}
			System.out.println();
			System.out.printf("������ ������ %.2f�̸� ����� %.2f�Դϴ�",sum,avg);
		}
	}
		public class Ex4 extends BaseDataAppEx4{ 

		
		void Hinput()
		{
			Scanner sc = new Scanner(System.in);

			System.out.printf("�Է��� ���� ������ �Է��ϼ���");
			g=sc.nextInt();

			n=new double [g];
			for(int i=0; i<n.length; i++)
			{
				System.out.print("������ �Է��Ͻÿ�:");
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

