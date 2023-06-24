package pk08_06;

public class AppEx4 {

	public static void main(String[] args) {

		String msg,ght;

		msg="бс";
		ght="бр";

		for(int i=0; i<11;i++)
		{
			if(i%2==0)
			{
				for(int k=0; k<10; k++)
					System.out.printf("%s"+" ",msg);
				System.out.println();
			}
			
			

			else
			{
				for(int l=0; l<10; l++)
					System.out.printf(" "+"%s",ght);
				System.out.println();
			}
		}




	}

}
