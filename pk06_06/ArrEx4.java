package pk06_06;
import java.util.Scanner;
public class ArrEx4 {
//�迭�� �Է� �޾Ƽ� ��� �ϱ� 
	public static void main(String[] args) {



		int [] d;//�迭 ����
		Scanner sc= new Scanner(System.in);//�Է� �ްٴٰ� ����

		d=new int[5];//�迭 5�� ���ٰ� ����


		for(int i=0; i<d.length; i++)//d.length�� ������ �˾Ƽ� ���� 
		{
			System.out.printf("d [%d] : ",i);//�ε��� ������ ���� ��� 
			d[i]=sc.nextInt();//d[i]�� �ٰ� ���� �Է� ���� 
		}
		sc.close();
		System.out.println("-----------------------");//�ٹٲ� 

		for(int i=0; i<d.length; i++)
			System.out.printf("d [%d] : %d \n",i,d[i]);//�Է� ���� �� ����ϱ� 

	}

}
