package pk13_06;
import java.util.Scanner;
public class Ex8 {
	char sign;
	int cnt;
	
	public void einput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("��ȣ�� �ݺ� ������ �Է��ϼ���");
		
		sign=sc.next().charAt(0);//�̰� �����Ƽ� String�� 
		cnt=sc.nextInt();
		
	}
	public void eprint()
	{
		for(int i=0; i<cnt; i++)
		{
			System.out.printf("%c ",sign);
		}
		System.out.printf("(%d)",cnt);
	}
	
	public static void main (String[] args)
	{
		Ex8 e1= new Ex8();
		e1.einput();
		e1.eprint();
	}

}
