package pk03_6;

public class iFEx2 {

	public static void main(String[] args) {
		
		int d1,d2,d3;
		int sum,avg;
		char c;
		
		d1=78;
		d2=90;
		d3=100;
		
		sum=d1+d2+d3;
		avg=sum/3;
		
		if(avg<=100&&avg>=90)
			c='A';
		
		else if(avg<=89&&avg>=80)
			c='B';
		
		else if(avg<=79&&avg>=70)
			c='C';
		
		else if(avg<=69&&avg>=60)
			c='D';
		
		else
			c='F';
		
		System.out.println("?‹¹?‹ ?˜ ? ?ˆ˜?Š”  "+d1+","+d2+","+d3);
		System.out.println("ï¿½ì „ì²´ì˜ ?•© "+sum+",?‰ê· ì?  "+avg);
		System.out.println("?•™? ?? " +c+"?…?‹ˆ?‹¤.");
		

	}

}
