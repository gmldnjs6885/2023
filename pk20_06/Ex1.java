package pk20_06;
import java.util.Scanner;
public class Ex1 {

	int age;
	String name,g;
	
	void Name()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("�̸��� ���̸� �Է��ϼ���:");
		name=sc.next();
		age=sc.nextInt();
	}
	
	void IFIf()
	{
		if(age<=17)
			g="�̼�����";
		else if(age<=65)
			g="û��";
		else if(age<=79)
			g="�߳�";
		else if(age<=99)
			g="���";
		else
			g="�������";
			
	}
	void Hprint()
	{
		System.out.printf("[%s]�� ���̴� [%d]���� [%s]�Դϴ�",name,age,g);
	}
	public static void main(String[] args) {

		Ex1 k= new Ex1();
		k.Name();
		k.IFIf();
		k.Hprint();
	}

}
