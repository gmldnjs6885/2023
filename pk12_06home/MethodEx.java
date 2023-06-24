package pk12_06home;

public class MethodEx {
	int varSum;
	
	public int sum(int a, int b)
	{
		int tot; 
		 tot=a+b;
		 return tot;
	}
	public int mSum(int a, int b)
	{
		varSum =a+b;
		return varSum;
	}

	public static void main(String[] args) {
		MethodEx me = new MethodEx();
		
		int res1 = me.sum(1000, -10);
		System.out.println("res1="+res1);
		
		int res2 =me.mSum(100,200);
		System.out.println("res2="+res2);
		
	}

}
