package Pk12_06;

public class Ex3 {
	int [] a;
	void esort() {

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
	}
	void hprint(){
		System.out.print("������������ ������ ��� ");
		for(int i=0; i<a.length; i++)
		{
			System.out.printf("[%d]",a[i]);
		}
	}

	public static void main(String[] args) {
		Ex3 k;
		k=new Ex3();
		k.esort();
		k.hprint();
		


	}

}
