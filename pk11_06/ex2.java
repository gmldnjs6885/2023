package pk11_06;

public class ex2 {

	int cnt;
	int sum;

	ex2()//������
	{
		cnt=0;
		sum=0;
	}
	void eprocess(){

		for(int i=1; i<=100; i++)
		{
			if(i%5==0) {

				cnt++;
				sum=sum+i;

			}

		}
	}
	void eprint() {
		System.out.printf("\n5�� ����� ������ %d ����%d",cnt, sum);
	}




	public static void main(String[] args) {


		ex2 k;
		 k=new ex2();
		 k.eprocess();
		 k.eprint();
		

	}

}
