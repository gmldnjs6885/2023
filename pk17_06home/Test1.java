package pk17_06home;
class Base{
	public Base()
	{
		System.out.println("Base() ������");
	}
	
}

class Derrived extends Base{
	public Derrived()
	{
		System.out.println("Derrived()������");
	}
}
public class Test1 {

	public static void main(String[] args) {

		Derrived r=new Derrived();
	}

}
