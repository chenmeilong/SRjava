
public class Object03 { 

	//��дһ��main����
	public static void main(String[] args) {

		Person p1=new Person();
		p1.age=10;
		p1.name="С��";
		Person p2=p1; //��p1 ������ p2 �� ��p2ָ��p1 
		System.out.println(p2.age); // 10
		
		
		

	}
}

class Person {
	String name;
	int age; 
}