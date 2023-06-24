package pk14_06;

public class TeEx5_2 {



	String name;
	int sum;

	void name(String[] args)
	{
		name=args[0];
	}
	void Sum(String[] args)
	{
		sum=0;

		for(int i=1; i<args.length;i++) 
		{
			sum+=Integer.parseInt(args[i]);

		}
	}

	void Print()

	{
		System.out.printf("[%s]´ÔÀÇ ÃÑÇÕÀº [%d]ÀÔ´Ï´Ù",name,sum);
	}
	
	public static void main(String [] args)
	{
		TeEx5_2 k=new TeEx5_2();
		k.name(args);
		k.Sum(args);
		k.Print();
		
	}
}
