package pk17_06;
import java.util.Scanner;

abstract class Ex2Super
{
	int age;
	String name;
	abstract void dataInput();
	abstract String getAgeGroup();
	
	public void print()
	{
		System.out.printf("�̸� : %s , ���� :%d",name,age);
		System.out.println();
	}

	public void setName(String name){this.name=name;}
	public int getAge(){return age;}
	public String getName() {return name;}
	public void setAge(int age){this.age=age;}
}
public class Ex2 extends Ex2Super {

	public String getAgeGroup() {

		if(age>=0&&age<=17)return "�̼���";
		else if(age>=18&&age<=65) return "û��";
		else if(age>=66&&age<=79)return "�߳�";
		else if(age>=80&&age<=90)return "���";
		else return "����";

	}
	
	public void dataInput()
	{

		Scanner sc = new Scanner(System.in);

		System.out.println("�̸��� ���̸� �Է��ϼ���");
		this.name=sc.nextLine();//**��ũ�� ������ �ȵ� ��ũ ���� ����**
		this.age=sc.nextInt();
	}

	public static void main(String[] args) {

		Ex2 k;
		k=new Ex2();

		k.dataInput();
		k.print();

		System.out.println("main() ���� ȣ�� => �̸� : "+k.getName()+",���� : "+k.getAge()+",������: "+k.getAgeGroup());
	}




}
