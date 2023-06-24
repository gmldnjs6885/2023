package pk10_06;

public class AppEx7_7 {

	public static void main(String[] args) {

		int [] data= {10,90,100,56,89,95,87,56,80,55};
		
		int sum=0; 
		float avg=0;
		
		for(int i=0; i<data.length; i++)
		{
			sum=sum+data[i];
		}
		
	avg= sum/data.length;
	
	System.out.printf("ÃÑÇÕÀº %d Æò±ÕÀº %.2f ",sum,avg);
	}

}
