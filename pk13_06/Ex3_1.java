package pk13_06;

public class Ex3_1 {
	String name;//������� 
	int score;
	Ex3_1()//������ 
	{
		name="�����";
		score=100;
	}

	Ex3_1(String name)

	{
		this.name=name;
		score=100;
	}
	Ex3_1(int score)

	{
		name="�����";
		this.score=score;
	}
	Ex3_1(String name, int score )
	{
		this.name=name;
		this.score=score;
	}
	
	public void eprint()
	{
		System.out.printf("�̸� : %s\n",name);
		System.out.printf("���� : %d",score);
		System.out.println();
		System.out.println("-----------");
	}




	public static void main(String[] args) {

		Ex3_1 m1,m2,m3,m4;
		m1=new Ex3_1();	
		m1.eprint();

		m2=new Ex3_1("�̸���");
		m2.eprint();

		m3=new Ex3_1(78);
		m3.eprint();

		m4= new Ex3_1("�ڴ޷�",50);
		m4.eprint();

	}

}
