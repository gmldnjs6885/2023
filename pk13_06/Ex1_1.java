package pk13_06;

public class Ex1_1 {
	String name;
	int score;
	Ex1_1()
	{
		name="�����";
		score = 100;
	}
	
	public void eprint() {
		System.out.printf("�̸� : %s\n",name);
		System.out.printf("���� : %d",score);
		
	}
	
	
	
	public static void main(String[] args) {
		Ex1_1 k;
		k=new Ex1_1();
		k.eprint();
	}

}
