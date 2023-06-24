package pk20_06;
import java.util.Scanner;
public class Ex2 {
	
	int sum;
	
	
	void For(String[] args)
	{
		sum=0;
		for(int i=0; i<args.length;i++)
		{
			sum+=Integer.parseInt(args[i]);
		}
	}
	
	void print(String[] args) {
		System.out.printf("입력된 %d의 합은 %d",args.length,sum);
	}
	
	public static void main(String[] args) {

		Ex2 k = new Ex2();
		k.For(args);
		k.print(args);
	}

}
