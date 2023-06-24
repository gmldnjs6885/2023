package pk17_06home;

	class B1{
		int x;
	}
	class B2 extends B1{
		String x;
	}
	public class Inheritance1{


		public static void main(String[] args) {
			B2 b2= new B2();

			b2.x="자바";
			System.out.println("객체9 b2에 들어 있는 값 : "+b2.x);

			B1 b1 =new B1();

			b1.x=5000;
			System.out.println("객체b1에 들어 있는 값 "+b1.x);


		

	}
}
