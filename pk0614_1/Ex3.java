package pk0614_1;
//��ü ������ 
import java.util.Scanner;

class DBEx3 {

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

	class Ex3 extends DBEx3{
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
			sum=0;
			for(int i=0; i<k.length; i++)
			{
				sum+=k[i];
			}
		}

		void Avg()
		{
			avg=0;
			avg=sum/k.length;
		}
		
	

	public static void main(String[] args) {

		Ex3 k =new Ex3();
		k.Hinput();
		k.Sum();
		k.Avg();
		k.Hprint();

	}

}



