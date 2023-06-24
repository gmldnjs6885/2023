package pk20_06;
import java.util.Scanner;
public class Ex3 {
	int n;
	int [] data;
	String m;

	void N()
	{
		Scanner sc = new Scanner(System.in);
		n=0;
		System.out.printf("입력할 개수는 ?");
		n=sc.nextInt();
		data =new int [n];

		for(int i=0; i<data.length; i++)
		{
			System.out.printf("%d개의 수를 입력하세요:",n);
			data[i]=sc.nextInt();
		}
		sc.close();
		System.out.println();

	}
	void Print()
	{
		for(int i=0; i<data.length; i++)
		{
			System.out.printf("[%d]:",i);
			for(int j=0; j<data[i]/10; j++) 
			{
				System.out.printf("■ ");
			}
			System.out.println();

		}
	}

		public static void main(String[] args) {
			Ex3 k=new Ex3();
			
			k.N();
			k.Print();

		}

	}
