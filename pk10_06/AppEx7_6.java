package pk10_06;

public class AppEx7_6 {

	public static void main(String[] args) {

		int sum=0; 
		String name=args[0];
		for(int i=1; i<=3; i++)
		{
			sum+=Integer.parseInt(args[i]);
		}
		System.out.printf("[%s]´ÔÀÇ ÃÑÇÕÀº [%d]ÀÔ´Ï´Ù.",name,sum);


	}

}
