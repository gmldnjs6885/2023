package pk13_06;

public class Ex1_1 {
	String name;
	int score;
	Ex1_1()
	{
		name="손희원";
		score = 100;
	}
	
	public void eprint() {
		System.out.printf("이름 : %s\n",name);
		System.out.printf("점수 : %d",score);
		
	}
	
	
	
	public static void main(String[] args) {
		Ex1_1 k;
		k=new Ex1_1();
		k.eprint();
	}

}
