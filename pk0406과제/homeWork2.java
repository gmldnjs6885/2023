package pk0406����;
import java.util.Scanner;
public class homeWork2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int [] data;
		data =new int[5];

		for(int i=0; i<data.length; i++)
		{

			System.out.print("["+i+"]������ :");
			data[i]=sc.nextInt();

			if(data[i]<0||data[i]>100) {
				System.out.println("��ȿ���� ���� ������ �Դϴ�. �ٽ� �Է� �ϼ��� ");
			i--;}
			
			
		}//end of for

		for(int i=0; i<data.length; i++)
		{
			System.out.printf("[%d]",i);
			for(int j=0; j<data[i]/10; j++)
			{
				System.out.printf("�� ");
			}
			System.out.printf("(%d)\n",data[i]);

		}

	}

}
