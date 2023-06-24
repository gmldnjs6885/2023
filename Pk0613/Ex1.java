package Pk0613;

public class Ex1 {

	public static void main(String[] args) {

		int d1,d2;
		double sum,avg;
		String name;
		char c;
		
		name="»´±Êµø";
		
		d1=93;
		d2=100;
		
		sum=d1+d2;
		avg=sum/2;
		
		if(avg>=90)c='A';
		else if(avg>=80) c='B';
		else if(avg>=70) c='C';
		else if(avg>=60) c='D';
		else c='F';
		
		System.out.printf("¿Ã∏ß¿∫ %s",name);
		System.out.println();
		System.out.printf("√—«’¿∫ %.2f ∆Ú±’¿∫ %.2f «–¡°¿∫ %c",sum,avg,c);
		
		
	}

}
