package pk06_06;

import java.util.Scanner;

public class ArrEx5 {
	public static void main(String[] args) {

		int [] d;//�迭 ����
		Scanner sc= new Scanner(System.in);//�Է� �ްٴٰ� ����

		d=new int[2];//�迭 5�� ���ٰ� ����


		System.out.printf(d.length+"���� �����͸� �Է��ϼ���");//�Է��϶�� �ȳ� ������ �ѹ��� ��� �ϵ��� ����
		

		for(int i=0; i<d.length; i++)//d.length�� ������ �˾Ƽ� ���� 
		{

			d[i]=sc.nextInt();//d[i]�� �ٰ� ���� �Է� ���� 
		}
		sc.close();
		
		System.out.println("-----------------------");//�ٹٲ� 

		for(int i=0; i<d.length; i++)
			System.out.printf("d [%d] : %d \n",i,d[i]);//�Է� ���� �� ����ϱ� 

	}

}
