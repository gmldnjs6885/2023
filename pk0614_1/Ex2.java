package pk0614_1;
//��ü
import java.util.Scanner;

public class Ex2 {
	int n;
	double k[];
	double sum,avg;

	Ex2()
	{
		sum=0; avg=0;
	}
	void Hinput()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("�Է� �� ������ ������ �Է��Ͻÿ�:");
		n=sc.nextInt();

		k=new double [n];

		for(int i=0; i<k.length; i++)
		{
			System.out.printf("������ �Է��Ͻÿ�");
			k[i]=sc.nextDouble();
		}
	}
	void Sum()
	{
		for(int i=0; i<k.length; i++)
		{
			sum+=k[i];
		}
	}

	void Avg()
	{
		avg=sum/k.length;
	}
	void Hprint()
	{
		System.out.printf("�Էµ� �����ʹ� : ");

		for(int i=0; i<k.length; i++)
		{
			System.out.printf("%.1f ",k[i]);
		}
		System.out.println();

		System.out.printf("������ ������ %.2f�̸� , ����� %.2f�Դϴ�",sum,avg);
	}
	public static void main(String[] args) {

		Ex2 k =new  Ex2();
		k.Hinput();
		k.Sum();
		k.Avg();
		k.Hprint();
		
	}

}
