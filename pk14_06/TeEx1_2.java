package pk14_06;

public class TeEx1_2 {
	int sum;
	int num;
	TeEx1_2()
	{
		sum=0;
		num=0;
	}

	public void Forif()
	{


		for(int i=1; i<=100; i++)
		{
			if(i%5==0)
			{
				System.out.printf("%d ",i);
				sum+=i;
				num++;
				if(num%7==0)
					System.out.println();
			}


		}
	}
	public void Eprint()
	{
		System.out.println();
		System.out.printf("합은 %d 개수는 %d",sum,num);
	}

	public static void main(String[] args) {
		TeEx1_2 k;
		k=new TeEx1_2();
		
		k.Forif();
		k.Eprint();
		

	}

}
