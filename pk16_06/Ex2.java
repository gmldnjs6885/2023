package pk16_06;

public class Ex2 {
	int age;
	String name;

	public Ex2(){
		age=100;
		name="홍길동";
	}
	public void print()
	{
		System.out.printf("이름 : %s,나이 :%d",name,age);
	}

	public static void main(String[] args) {
		Ex2 k;
		
		k=new Ex2();
		k.print();

	}

}
