package pk12_06home;

public class MethodEx3 {
	
	public int increase(int n)
	{
		++n;
		return n;
	}
	public static void main(String[] args) {

		int var1=100;
		MethodEx3 vp =new MethodEx3();
		
		int var2 = vp.increase(var1);
		System.out.println("var1 : "+ var1+ ", var2 :"+var2);
	}

}
