package pk14_06;

public class TeEx5_1 {

	public static void main(String[] args) {
		String name =args[0];
		int sum;
		
		sum=0;
		
		for(int i=1;i<args.length; i++)
		{
			sum+=Integer.parseInt(args[i]);
		}
		
		System.out.printf("[%s]´ÔÀÇ ÃÑÇÕÀº [%d]\n",name,sum);
	

	}

}
