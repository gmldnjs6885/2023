package pk06_06;

public class ArrEx1 {

	public static void main(String[] args) {
		int [] d;

		d= new int[10];

		for(int i=1; i<=10; i++)
			d[i-1]=i*2;//시작이 1이기떄문에 -1해줌인덱스는 0으로 시작하기 때문

		for(int i=0; i<10; i++)
			System.out.println(d[i]+" ");


	}

}
