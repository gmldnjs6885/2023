package pk16_06;
import java.util.Scanner;
public class Ex7 {

	private int age;
	private String name;



	public int getAge() {

		return age;
	}

	public String getAgeGroup() {

		if(age>=0&&age<=17)

			return "미성년";

		else if(age>=18&&age<=65)

			return "청년";
		else if(age>=66&&age<=79)

			return "중년";

		else if(age>=80&&age<=90)

			return "노년";
		else

			return "노인";



	}
	public String getName() {

		return name;
	}
	public void dataInput()
	{

		Scanner sc = new Scanner(System.in);

		System.out.println("이름과 나이를 입력하세요");
		this.name=sc.nextLine();//**블랭크를 넣으면 안됨 블랭크 말고 엔터**
		this.age=sc.nextInt();



	}
	public void print()
	{
		System.out.printf("이름 : %s , 나이 :%d",name,age);
		System.out.println();
	}

	public static void main(String[] args) {

		Ex7 k;
		k=new Ex7();

		k.dataInput();
		k.print();

		System.out.println("main() 에서 호출 => 이름 : "+k.getName()+",나이 : "+k.getAge()+",연령층: "+k.getAgeGroup());
	}




}
