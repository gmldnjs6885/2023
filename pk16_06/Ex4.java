package pk16_06;

public class Ex4 {
	//�޼ҵ� �����ε��� ����� �� 
	//��ü������ ������ϸ� �޼ҵ� 
	
	
	int age;
	String name;

	void datalnit(){

		age=100;
		name="ȫ�浿";
	}
	public Ex4(){

		age=100;
		name="ȫ�浿";
	}
	void datalnit(String name,int age)
	{
		this.name=name;
		this.age=age;
		
	}

	public Ex4(int age, String name) {

		this.age = age;
		this.name = name;
	}

	public Ex4(String name) {

		//this.age = 100; 
		this.name = name;
	}
	public Ex4(int age) {

		this.age = age;
		//this.name = "���Ѹ�";

	}
	public void print()
	{
		System.out.printf("�̸� : %s , ���� :%d",name,age);
		System.out.println();
	}

	public static void main(String[] args) {

		Ex4 k;

		k=new Ex4();
		k.print();

		k=new Ex4("���Ѹ�");
		k.print();

		k=new Ex4(500);
		k.print();

		k=new Ex4(200,"�̸���");
		k.print();
		
		k.datalnit("������",300);//�޼ҵ带 ���� �Է� ����
		k.print();
		
		

	}

}
