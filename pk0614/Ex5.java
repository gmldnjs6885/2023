package pk0614;

import java.util.Scanner;

interface InterEx5{
 void Hinput();
 void Sum();
 void Avg();
}
 class BaseDataAppEx5 {

	double [] n;
	double sum,avg;
	int g;
	
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
	public class Ex5 extends BaseDataAppEx5 implements InterEx5{ 

	
	public void Hinput()
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

	public void Sum()
	{
		sum=0;
		for(int i=0; i<n.length; i++)
		{
			sum+=n[i];
		}
	}
	public void Avg()
	{
		avg=0;
		avg=sum/n.length;
	}


	public static void main(String[] args) {
		Ex5 k= new Ex5();

		k.Hinput();
		k.Sum();
		k.Avg();
		k.Hprint();


	}
}

