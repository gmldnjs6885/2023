package pk17_06home;
class ShapeTest2{
	public ShapeTest2()
	{
		System.out.println("ShapTestg������()");
	}
}

class RectangleTest2 extends ShapeTest2{
	public RectangleTest2()
	{
		super();
		System.out.println("Rectangle2 ������()");
	}

}
public class Test2 {

	public static void main(String[] args) {

		RectangleTest2 r=new RectangleTest2();
	}

}
