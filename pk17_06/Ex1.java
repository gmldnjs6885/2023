package pk17_06;
import java.util.Scanner;

class Ex1Super
{
	int age;
	String name;

	public void print()
	{
		System.out.printf("�̸� : %s , ���� :%d",name,age);
		System.out.println();
	}
	public void setName(String name)
	{
		this.name=name;
	}

	public void setAge(int age)
	{
		this.age=age;
	}


	public int getAge() {

		return age;
	}
	public String getName() {

		return name;
	}

}//end of class Ex1Super 

public class Ex1 extends Ex1Super {

	void datalnit(){

		age=100;
		name="ȫ�浿";
	}
	public Ex1(){

		age=100;
		name="ȫ�浿";
	}
	void datalnit(String name,int age)
	{
		this.name=name;
		this.age=age;

	}

	public Ex1(int age, String name) {

		this.age = age;
		this.name = name;
	}

	public Ex1(String name) {

		//this.age = 100; 
		this.name = name;
	}
	public Ex1(int age) {

		this.age = age;
		//this.name = "���Ѹ�";

	}

	
	public int getAgeGroup() {

		return age;
	}

	public void dataInput()
	{

		Scanner sc = new Scanner(System.in);

		System.out.println("�̸��� ���̸� �Է��ϼ���");
		this.name=sc.nextLine();//**��ũ�� ������ �ȵ� ��ũ ���� ����**
		this.age=sc.nextInt();

		if(age>=17)

			sc.close();

	}

	public static void main(String[] args) {

		Ex1 k;

		k=new Ex1();
		k.print();

		k=new Ex1("���Ѹ�");
		k.print();

		k=new Ex1(500);
		k.print();

		k=new Ex1(200,"�̸���");
		k.print();

		k.datalnit("������",300);//�޼ҵ带 ���� �Է� ����
		k.print();

		k.setName("���Ѹ�");//�޼ҵ� �ʱ�ȭ �⺻�� private
		k.setAge(70);
		k.print();

		k.dataInput();
		k.print();

		System.out.println("main() ���� ȣ�� => �̸� : "+k.getName()+",���� : "+k.getAge());



	}

}
