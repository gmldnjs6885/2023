package pk13_06;

public class Ex7 { //�޼ҵ� �����ε� 
	
	char sign;
	int cnt;

	public void einit()//�޼ҵ忡�� �ʱ�ȭ
	{
		sign='��';
		cnt=10;
	}
	
	public void einit(char sign)//�޼ҵ忡�� �ʱ�ȭ
	{
		this.sign=sign;
		cnt=10;
	}
	public void einit(char sign,int cnt)//�޼ҵ忡�� �ʱ�ȭ
	{
		this.sign=sign;
		this.cnt=cnt;
	}
	

	public void eprint()
	{
		System.out.printf("��°�� : ");
		for(int i=0; i<cnt; i++)
		{
			System.out.printf("%c ",sign);
		}

		System.out.printf("(%d)",cnt);
		System.out.println();
	}


	public static void main(String[] args) {

		Ex7 k =new Ex7();
		
		k.einit();
		k.eprint();
		
		k.einit('&');
		k.eprint();
		
		k.einit('@',20);
		k.eprint();
		
		

	}

}
