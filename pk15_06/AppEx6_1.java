package pk15_06;

public class AppEx6_1 {
	int age;
	String name;
	public String getName()//캡슐화 기법 보통 private로 만들어짐 
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	
	public void setName(String name)
	
	{
		this.name=name;
		
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	
	

	public static void main(String[] args) {
		 AppEx6_1 g =new AppEx6_1();

	      g.setName("나안일");//메소드
	      g.setAge(20);//메소드
	      System.out.printf("이름 : %s , 나이 : %d\n",g.getName(),g.getAge());
	      
	      g.name="홍길동";
	      g.age=100;
	      System.out.printf("이름 : %s , 나이 : %d",g.getName(),g.getAge());
	   }
		
	

}
