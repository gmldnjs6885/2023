package pk0614;

import java.util.Scanner;
//��ü���α׷���
public class Ex2 {
	Scanner sc = new Scanner(System.in);

	double [] n;
	double sum,avg;
	int k;
	Ex2()
	{
		sum=0;
		avg=0;
	}

	void Hinput()
	{
		System.out.printf("�Է��� ���� ������ �Է��ϼ���");
		k=sc.nextInt();

		n=new double [k];
		for(int i=0; i<n.length; i++)
		{
			System.out.print("������ �Է��Ͻÿ�:");
			n[i]=sc.nextDouble();
		}
	}

	void Sum()
	{
		for(int i=0; i<n.length; i++)
		{
			sum+=n[i];
		}
	}
	void Avg()
	{
		avg=sum/n.length;
	}

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
	public static void main(String[] args) {
		Ex2 k= new Ex2();
		k.Hinput();
		k.Sum();
		k.Avg();
		k.Hprint();
	}

}
