package pk16_06;

public class Ex5 {
	private int age;
	private String name;

	void datalnit(){

		age=100;
		name="ȫ�浿";
	}
	public Ex5(){

		age=100;
		name="ȫ�浿";
	}
	void datalnit(String name,int age)
	{
		this.name=name;
		this.age=age;

	}

	public Ex5(int age, String name) {

		this.age = age;
		this.name = name;
	}

	public Ex5(String name) {

		//this.age = 100; 
		this.name = name;
	}
	public Ex5(int age) {

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
	
	public String getName() {
		
		return name;
	}

	public static void main(String[] args) {

		Ex5 k;

		k=new Ex5();
		k.print();

		k=new Ex5("���Ѹ�");
		k.print();

		k=new Ex5(500);
		k.print();

		k=new Ex5(200,"�̸���");
		k.print();

		k.datalnit("������",300);//�޼ҵ带 ���� �Է� ����
		k.print();

		k.setName("���Ѹ�");
		k.setAge(70);
		k.print();

		System.out.println("main() ���� ȣ�� => �̸� : "+k.getName()+",���� : "+k.getAge());



	}


}
