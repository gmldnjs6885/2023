package pk12_06;

public class Ex2 {

	public static void main(String[] args) {
		int [] a;
		
		a= new int []{10,-5,100,87,90,20,6,70,50,34};

		for(int i=0; i<a.length-1; i++)
		{
			int tmp;//���⿡ �θ� �޸𸮸� �ٽ� �Ҵ��� �ʿ���� ����
			for(int j=i+1; j<a.length; j++)//1�� �����ϸ� 1�� �����ֱ� ������ �ϳ��� �ڷ� �б� ���ؼ� i+1
			{

				if(a[i]>a[j])
				{

					tmp=a[i];
					a[i]=a[j];
					a[j]=tmp;
				}
			}

		}
		System.out.print("������������ ������ ��� ");
		for(int i=0; i<a.length; i++)
		{
			System.out.printf("[%d]",a[i]);
		}
		System.out.println();
		System.out.print("������������ ������ ��� ");
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.printf("[%d]",a[i]);
		}
	}

}
