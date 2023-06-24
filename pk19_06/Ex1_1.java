package pk19_06;
 import java.util.Scanner;
 //몸무게랑 키 입력 받아서 Bmi구하기 
 
public class Ex1_1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int m,kg,bmi;
		String g;
		System.out.println("Bmi를 측정할 키와 몸무게를 입력 하세요");
		m=sc.nextInt()/100;
		kg=sc.nextInt();
		
		sc.close();
		
		bmi=(kg/(m*m));
		
		if(bmi<20)
			g="저체중";
		else if(bmi<25)
			g="정상";
		else if(bmi<30)
			g="과체중";
		else 
			g="비만";
		
		
	System.out.printf("입력한 키는 %d 입력한 몸무게는 %d",m,kg);
	System.out.printf("bmi지수는 %d이고 %s 입니다",bmi,g);
		
		
	}

}
