package pk20_06;
import java.util.Scanner;
public class Ex1 {

	int age;
	String name,g;
	
	void Name()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("이름과 나이를 입력하세요:");
		name=sc.next();
		age=sc.nextInt();
	}
	
	void IFIf()
	{
		if(age<=17)
			g="미성년자";
		else if(age<=65)
			g="청년";
		else if(age<=79)
			g="중년";
		else if(age<=99)
			g="노년";
		else
			g="장수노인";
			
	}
	void Hprint()
	{
		System.out.printf("[%s]의 나이는 [%d]세로 [%s]입니다",name,age,g);
	}
	public static void main(String[] args) {

		Ex1 k= new Ex1();
		k.Name();
		k.IFIf();
		k.Hprint();
	}

}
