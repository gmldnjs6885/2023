package pk16_06;

import java.util.Scanner;
public class Ex6 {
	private int age;
	private String name;

	void datalnit(){

		age=100;
		name="ȫ�浿";
	}
	public Ex6(){

		age=100;
		name="ȫ�浿";
	}
	void datalnit(String name,int age)
	{
		this.name=name;
		this.age=age;

	}

	public Ex6(int age, String name) {

		this.age = age;
		this.name = name;
	}

	public Ex6(String name) {

		//this.age = 100; 
		this.name = name;
	}
	public Ex6(int age) {

		this.age = age;
		//this.name = "���Ѹ�";

	}

	public void setName(String name)
	{
		this.name=name;
	}

	public void setAge(int age)
	{
		this.age=age;
	}

	public void print()
	{
		System.out.printf("�̸� : %s , ���� :%d",name,age);
		System.out.println();
	}
	public int getAge() {
		
		return age;
	}
	
public int getAgeGroup() {
		
		return age;
	}
	public String getName() {
		
		return name;
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

		Ex6 k;

		k=new Ex6();
		k.print();

		k=new Ex6("���Ѹ�");
		k.print();

		k=new Ex6(500);
		k.print();

		k=new Ex6(200,"�̸���");
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
