package pk08_06;

public class AppEx5_5 {

	public static void main(String[] args) {
		char n;


		for(int i=1; i<=26;i++)

		{
			n='A';
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(n++ +" ");
			}
			
			System.out.println();
		}

	}

}
