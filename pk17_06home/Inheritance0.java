package pk17_06home;


class A
{
	int aa=1;
}

class B extends A{
	int bb=2;
}
class C extends B{
	int cc=3;
}

public class Inheritance0{
	public static void main(String[] args) {
		

		C objc = new C();
		System.out.println("objc 객체의 객체 속성변수 aa값은 "+objc.aa);
		System.out.println("objc 객체의 객체 속성변수 bb값은 "+objc.bb);
		System.out.println("objc 객체의 객체 속성변수 cc값은 "+objc.cc);

	}
}
