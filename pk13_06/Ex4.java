package pk13_06;

public class Ex4 {
	String name;//������� 
	int score;
	public void einput()//������ 
	{
		name="�����";
		score=100;
		
	}
	public void einput(String name)//������ 
	{
		this.name=name;
		score=100;
		System.out.println("--------------");
	}
	public void einput(int score)//������ 
	{
		name="�����";
		this.score=score;
		System.out.println("--------------");
	}
	
	public void einput(String name,int score)//������ 
	{
		this.name=name;
		this.score=score;
		System.out.println("--------------");
	}
	public void eprint() {
		System.out.printf("�̸� : %s \n",name);
		System.out.printf("���� : %d \n",score);
	}
	
	



	public static void main(String[] args) {

		Ex4 m1=new Ex4();
		
		
		m1.einput();
		m1.eprint();
		
		m1.einput("�̸���");
		m1.eprint();
		
		m1.einput(78);
		m1.eprint();
		
		m1.einput("�ڴ޷�",50);
		m1.eprint();

		

	}

}
