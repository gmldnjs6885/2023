package pk11_06;
import java.util.Scanner;
public class ex2_1 {
int cnt,sum;//멤버변수는 자동초기화가 이루어짐
//객체에는 순서가 없이 가능 내부에 들어가서는 절차적으로 구성됨
Scanner sc =new Scanner(System.in);
int j=0;
	void einput()//입력부
	{

		System.out.println("배수를 입력하세요 ");
		j=sc.nextInt();
		sc.close();
	}
	void eprocess()//처리부 
	{
		
		
		for(int i=1; i<=100; i++)
		{
			if(i%j==0) {
				cnt++;
				sum=sum+i;
				
			}
		}
	}
	void eprint()//출력
	{
		System.out.printf("\n%d의 배수의 개수는 %d ",j,cnt);
		System.out.println("합은"+sum+"입니다");
	}
	
	
	public static void main(String[] args) {
		
		ex2_1 k=new ex2_1();//new로 객체가 만들어짐 멤버사용가능
		k.einput();//데이터 입력
		k.eprocess();//처리 
		k.eprint();//출력
	}
	
	

}
