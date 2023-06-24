package pk13_06;

public class Ex6 {

	char sign;
	int cnt;

	public void einit()//메소드에서 초기화
	{
		sign='＃';
		cnt=10;
	}

	public void eprint(){
		for(int i=0; i<cnt; i++)
		{
			System.out.printf("%c ",sign);
		}

		System.out.printf("(%d)",cnt);
	}


	public static void main(String[] args) {

		Ex6 k =new Ex6();
		k.einit();
		k.eprint();


	}

}
