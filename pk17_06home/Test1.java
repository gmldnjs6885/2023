package pk17_06home;
class Base{
	public Base()
	{
		System.out.println("Base() 持失切");
	}
	
}

class Derrived extends Base{
	public Derrived()
	{
		System.out.println("Derrived()持失切");
	}
}
public class Test1 {

	public static void main(String[] args) {

		Derrived r=new Derrived();
	}

}
