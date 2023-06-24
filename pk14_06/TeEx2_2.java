package pk14_06;
import java.util.Scanner;
public class TeEx2_2 {

	double sum,avg;
	double []n;
	String score;
	TeEx2_2()
	{

		sum=0;
		avg=0;
	}


	public void ForFor(){
		Scanner sc = new Scanner(System.in);
		n=new double [3];

		for(int i=0; i<n.length;i++)
		{
			System.out.println("점수를 입력하세요");
			n[i]=sc.nextDouble();
			
		}
		
	}
	void Sum()
	{
		for(int i=0; i<n.length; i++)
			sum+=n[i];
	}
	
	void avg()
	{
		avg=sum/n.length;
	}

	public void HIF() {




		if(avg>=90)
			score="A";
		else if(avg>=80)
			score="B";
		else if(avg>=70)
			score="C";
		else if(avg>=60)
			score="D";
		else
			score="F";
	}
	public void Hprint() {
		System.out.printf("점수의 총합은 %.2f 평균은 %.2f 학점은 %s",sum,avg,score);
	}

	public static void main(String[] args) {
		TeEx2_2 k;
		k=new TeEx2_2();
		k.ForFor();
		k.Sum();
		k.avg();
		k.HIF();
		k.Hprint();


	}

}
