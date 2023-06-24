package pk17_06;
import java.util.Scanner;

abstract class Ex2Super
{
	int age;
	String name;
	abstract void dataInput();
	abstract String getAgeGroup();
	
	public void print()
	{
		System.out.printf("이름 : %s , 나이 :%d",name,age);
		System.out.println();
	}

	public void setName(String name){this.name=name;}
	public int getAge(){return age;}
	public String getName() {return name;}
	public void setAge(int age){this.age=age;}
}
public class Ex2 extends Ex2Super {

	public String getAgeGroup() {

		if(age>=0&&age<=17)return "미성년";
		else if(age>=18&&age<=65) return "청년";
		else if(age>=66&&age<=79)return "중년";
		else if(age>=80&&age<=90)return "노년";
		else return "노인";

	}
	
	public void dataInput()
	{

		Scanner sc = new Scanner(System.in);

		System.out.println("이름과 나이를 입력하세요");
		this.name=sc.nextLine();//**블랭크를 넣으면 안됨 블랭크 말고 엔터**
		this.age=sc.nextInt();
	}

	public static void main(String[] args) {

		Ex2 k;
		k=new Ex2();

		k.dataInput();
		k.print();

		System.out.println("main() 에서 호출 => 이름 : "+k.getName()+",나이 : "+k.getAge()+",연령층: "+k.getAgeGroup());
	}




}
