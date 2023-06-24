package pk13_06;

public class Ex7 { //메소드 오버로딩 
	
	char sign;
	int cnt;

	public void einit()//메소드에서 초기화
	{
		sign='＃';
		cnt=10;
	}
	
	public void einit(char sign)//메소드에서 초기화
	{
		this.sign=sign;
		cnt=10;
	}
	public void einit(char sign,int cnt)//메소드에서 초기화
	{
		this.sign=sign;
		this.cnt=cnt;
	}
	

	public void eprint()
	{
		System.out.printf("출력결과 : ");
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
