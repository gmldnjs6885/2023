package pk09_06;

public class AppEx3 {

	public static void main(String[] args) {
		
		
		int [] [] data =  {{10,20,30,40},{50,60,70,80,90},{100,110,120}};
		
		for(int r=0; r<data.length; r++)
		{
			for(int c=0; c<data[r].length;c++)
			{
				System.out.println((data[r][c]*2)+" ");
				
				System.out.println();
			}
		}
		

	}

}
