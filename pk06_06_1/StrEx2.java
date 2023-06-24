package P0511;

public class StrEx2 {

	public static void main(String[] args) {
		int [] arr = {10,20,30,40,50};//int 4byte*5라서 20바이트
		int mylength;
		mylength =arr.length*Integer.BYTES;//바이트 크기를 계산 해줌
		
		System.out.println("배열의 바이트(크기) 계산 : "+mylength);
	}

}
