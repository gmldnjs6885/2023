package pk09_06;

public class AppEx3_3 {

	public static void main(String[] args) {
		int [] [] data= {{10,20,30,40},{50,60,70,80,90},{100,110,120}};
		
		for(int i=0; i<data.length; i++)
		{
			for(int j=0; j<data[i].length; j++)
			{
				System.out.println((data[i][j]*2)+" ");
			}
		}

	}

}
