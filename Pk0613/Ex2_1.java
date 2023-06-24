package Pk0613;
import java.util.Scanner;
public class Ex2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h;
		int [] a;
		int tmp;
		
		System.out.println("배열의 개수를 입력하세요");
		
		h=sc.nextInt();
		a=new int [h];
		
		for(int i=0; i<a.length;i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				tmp=a[i];
				a[i]=a[j];
				a[j]=tmp;
			}//end of for j
		}//end of for i
		
	}

}
