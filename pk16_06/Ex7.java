package pk16_06;
import java.util.Scanner;
public class Ex7 {

	private int age;
	private String name;



	public int getAge() {

		return age;
	}

	public String getAgeGroup() {

		if(age>=0&&age<=17)

			return "�̼���";

		else if(age>=18&&age<=65)

			return "û��";
		else if(age>=66&&age<=79)

			return "�߳�";

		else if(age>=80&&age<=90)

			return "���";
		else

			return "����";



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



	}
	public void print()
	{
		System.out.printf("�̸� : %s , ���� :%d",name,age);
		System.out.println();
	}

	public static void main(String[] args) {

		Ex7 k;
		k=new Ex7();

		k.dataInput();
		k.print();

		System.out.println("main() ���� ȣ�� => �̸� : "+k.getName()+",���� : "+k.getAge()+",������: "+k.getAgeGroup());
	}




}
