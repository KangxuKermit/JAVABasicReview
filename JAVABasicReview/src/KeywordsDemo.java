
public class KeywordsDemo {

	public static void main(String[] args) {
		System.out.println("KeyWordsDemo");
		
		
		PrivateDemo p = new PrivateDemo();
		p.name = "zhangsan";
		p.setAge(10);
		p.speak();
	}

}



class PrivateDemo {
	
	/**
	 * private 被修饰的成员只能在本类中使用
	 * private 仅仅是封装的一种体现形式
	 * 
	 **/ 
	String name;
	private int age;
	
	public void speak() {
		System.out.println(name + getAge());
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	
}


