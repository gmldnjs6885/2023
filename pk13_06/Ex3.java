package pk13_06;

public class Ex3 {
	String name;//������� 
	int score;
	Ex3()//������ 
	{
		name="�����";
		score=100;
	}
	Ex3(String name)//������ 
	{
		this.name=name;
		score=100;
	}
	Ex3(int score)//������ 
	{
		name="�����";
		this.score=score;
	}
	
	Ex3(String name,int score)//������ 
	{
		this.name=name;
		this.score=score;
	}
	public void eprint() {
		System.out.printf("�̸� : %s \n",name);
		System.out.printf("���� : %d \n",score);
	}
	



	public static void main(String[] args) {

		Ex3 m1,m2,m3,m4;
		m1=new Ex3();
		m1.eprint();

		m2=new Ex3("�̸���");
		m2.eprint();

		m3=new Ex3(78);
		m3.eprint();
		
		m4= new Ex3("�ڴ޷�",50);
		m4.eprint();


		

	}


}
