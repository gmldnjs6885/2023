package pk12_06home;
import java.util.Scanner;
public class MethodEx4 {
	String[] arr;
	void arrayInput() {
		Scanner sc =new Scanner(System.in);
		arr=new String[3];
		
		for(int i=0;i<arr.length; i++)
		{
			System.out.print("arr["+i+"] 번쨰 문자를 입력하세요 : ");
			arr[i]=sc.next();
		}
		sc.close();
	}
	
	void arrayPrint() {
		for(int i=0; i<arr.length; i++)
			System.out.printf("arr[%d]=%s\n",i,arr[i]);
	}

	public static void main(String[] args) {

		MethodEx4 k = new MethodEx4();
		
		k.arrayInput();
		k.arrayPrint();
	}

}
