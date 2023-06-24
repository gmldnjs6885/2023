package pk19_06;
import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
		double body,ki,bmi;
		String bido;
		
		System.out.println("몸무게랑 키를 입력하세요");
		
		body=sc.nextDouble();
		ki=sc.nextDouble()/100.0;
		
		bmi=(body/(ki*ki));
		
		if(bmi<20)
			bido="저체중";
		else if(bmi<25)
			bido="정상체중";
		else if(bmi<30)
			bido="과체중";
		else 
			bido="비만";
		
		System.out.printf("몸무게 %.2f 키 %.2f, ",body,ki);
		System.out.printf("BMI지수%.2f bmi결과:%s",bmi,bido);
		
		
	}

}
