package pk16_06;

public class Ex3 {
	//������ �����ε��� ����� ��ü�� ���α׷����� ����ÿ� �̷������� ���� 
	

	int age;
	String name;

	public Ex3(){

		age=100;
		name="ȫ�浿";
	}

	public Ex3(int age, String name) {

		this.age = age;
		this.name = name;
	}

	public Ex3(String name) {

		//this.age = 100; 
		this.name = name;
	}
	public Ex3(int age) {

		this.age = age;
		//this.name = "���Ѹ�";

	}
	public void print()
	{
		System.out.printf("�̸� : %s , ���� :%d",name,age);
		System.out.println();
	}

	public static void main(String[] args) {

		Ex3 k;

		k=new Ex3();
		k.print();

		k=new Ex3("���Ѹ�");
		k.print();

		k=new Ex3(500);
		k.print();

		k=new Ex3(200,"�̸���");
		k.print();

	}
}
