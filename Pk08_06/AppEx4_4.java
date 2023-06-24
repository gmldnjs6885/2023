package Pk08_06;

public class AppEx4_4 {

	public static void main(String[] args) {
		String msg,spah;
		msg="бс";
		spah ="бр";

		for(int i=0; i<10; i++)
		{
			if(i%2==0)
			{
				for(int j=0; j<10; j++)
					System.out.printf("%s" + " ",msg);
				System.out.println();
			}
			
			
			else
			{
				for(int k=0; k<10; k++)
					System.out.printf(" "+"%s",spah);
				System.out.println();
			}
		}

	}

}
