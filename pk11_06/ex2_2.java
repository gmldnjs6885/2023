package pk11_06;

public class ex2_2 {
	int cnt,sum;//멤버변수는 자동초기화가 이루어짐
	
//	ex2_2()//선언부 생성자
//	{
//		cnt=0;
//		sum=0;
//	}
	
	void eprocesss()//처리부 
	{
		for(int i=1; i<=100; i++)
		{
			if(i%5==0) {
				cnt++;
				sum=sum+i;
				
			}
		}
	}
	void eprint()//출력
	{
		System.out.printf("\n5의 배수의 개수는 %d ",cnt);
		System.out.println("합은"+sum+"입니다");
	}
	
	
	public static void main(String[] args) {
		
		ex2_2 k;
		k=new ex2_2();//new로 객체가 만들어짐 멤버사용가능
		k.eprocesss();
		k.eprint();
	}
	
	

}
