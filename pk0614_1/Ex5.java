package pk0614_1;
import java.util.Scanner;
interface InterEx5
{
	void Hinput();
	void Sum();
	void Avg();
}
class DBEx5 {

	int n;
	double k[];
	double sum,avg;

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
}

class Ex5 extends DBEx5 implements InterEx5 {
	public void Hinput()
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
	public void Sum()
	{
		sum=0;
		for(int i=0; i<k.length; i++)
		{
			sum+=k[i];
		}
	}

	public void Avg()
	{
		avg=0;
		avg=sum/k.length;
	}



	public static void main(String[] args) {

		Ex4 k =new Ex4();
		k.Hinput();
		k.Sum();
		k.Avg();
		k.Hprint();

	}

}
