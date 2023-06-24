package pk06_06;
import java.util.Scanner;
public class ArrEx4 {
//배열을 입력 받아서 출력 하기 
	public static void main(String[] args) {



		int [] d;//배열 선언
		Scanner sc= new Scanner(System.in);//입력 받겟다고 선언

		d=new int[5];//배열 5개 쓴다고 선언


		for(int i=0; i<d.length; i++)//d.length의 개수를 알아서 해줌 
		{
			System.out.printf("d [%d] : ",i);//인덱스 순서랑 값을 출력 
			d[i]=sc.nextInt();//d[i]에 다가 수를 입력 받음 
		}
		sc.close();
		System.out.println("-----------------------");//줄바꿈 

		for(int i=0; i<d.length; i++)
			System.out.printf("d [%d] : %d \n",i,d[i]);//입력 받은 값 출력하기 

	}

}
