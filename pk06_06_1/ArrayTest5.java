package P0511;

public class ArrayTest5 {

	public static void main(String[] args) {

		int [] scores = {10,20,30,40,50};
		int cnt=0;
		
		for(int sc : scores)
		{
			System.out.println("score[" + cnt++ +"]: "+sc);
		}
	}

}
