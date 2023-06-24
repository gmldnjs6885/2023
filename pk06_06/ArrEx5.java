package pk06_06;

import java.util.Scanner;

public class ArrEx5 {
	public static void main(String[] args) {

		int [] d;//배열 선언
		Scanner sc= new Scanner(System.in);//입력 받겟다고 선언

		d=new int[2];//배열 5개 쓴다고 선언


		System.out.printf(d.length+"개의 데이터를 입력하세요");//입력하라는 안내 문구를 한번만 출력 하도록 해줌
		

		for(int i=0; i<d.length; i++)//d.length의 개수를 알아서 해줌 
		{

			d[i]=sc.nextInt();//d[i]에 다가 수를 입력 받음 
		}
		sc.close();
		
		System.out.println("-----------------------");//줄바꿈 

		for(int i=0; i<d.length; i++)
			System.out.printf("d [%d] : %d \n",i,d[i]);//입력 받은 값 출력하기 

	}

}
