package pk12_06home;

public class MethodEx2 {
	int var;
	
	public void setInt(int var)
	{
		this.var=var;
		
	}
	public int getInt()

	{
		return var;
	}
	public static void main(String[] args) {
		MethodEx2 me2 =new MethodEx2();
		
		me2.setInt(50);
		System.out.println("var : "+ me2.getInt());
	}

}
