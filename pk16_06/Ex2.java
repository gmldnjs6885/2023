package pk16_06;

public class Ex2 {
	int age;
	String name;

	public Ex2(){
		age=100;
		name="ȫ�浿";
	}
	public void print()
	{
		System.out.printf("�̸� : %s,���� :%d",name,age);
	}

	public static void main(String[] args) {
		Ex2 k;
		
		k=new Ex2();
		k.print();

	}

}
