package pk17_06home;
class ShapeTest3{
	public ShapeTest3()
	{
		System.out.println("ShapeTest3������ ()");
		
	}
}
class RectangleTest3 extends ShapeTest3{
	public RectangleTest3()
	{
		System.out.println("RetangleTest3������()");
	}
}
public class Test3 {

	public static void main(String[] args) {
		new RectangleTest3();
		
	}

}
