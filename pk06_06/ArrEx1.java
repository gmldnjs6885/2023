package pk06_06;

public class ArrEx1 {

	public static void main(String[] args) {
		int [] d;

		d= new int[10];

		for(int i=1; i<=10; i++)
			d[i-1]=i*2;//������ 1�̱⋚���� -1�����ε����� 0���� �����ϱ� ����

		for(int i=0; i<10; i++)
			System.out.println(d[i]+" ");


	}

}
