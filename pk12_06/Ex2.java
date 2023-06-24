package pk12_06;

public class Ex2 {

	public static void main(String[] args) {
		int [] a;
		
		a= new int []{10,-5,100,87,90,20,6,70,50,34};

		for(int i=0; i<a.length-1; i++)
		{
			int tmp;//여기에 두면 메모리를 다시 할당할 필요없이 편함
			for(int j=i+1; j<a.length; j++)//1로 선언하면 1에 멈춰있기 때문에 하나씩 뒤로 밀기 위해서 i+1
			{

				if(a[i]>a[j])
				{

					tmp=a[i];
					a[i]=a[j];
					a[j]=tmp;
				}
			}

		}
		System.out.print("오름차순으로 정렬한 결과 ");
		for(int i=0; i<a.length; i++)
		{
			System.out.printf("[%d]",a[i]);
		}
		System.out.println();
		System.out.print("내림차순으로 정렬한 결과 ");
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.printf("[%d]",a[i]);
		}
	}

}
