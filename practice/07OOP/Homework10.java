
public class Homework10 { 

	//��дһ��main����
	public static void main(String[] args) {
	}
}

class Demo{
	int i=100;
	public void m(){
		int j=i++; 
		System.out.println("i="+i);
		System.out.println("j="+j);
	}
}
class Test{
	public static void main(String[] args){//������
		Demo d1=new Demo();
		Demo d2 = d1;
		d2.m();
		System.out.println(d1.i);
		System.out.println(d2.i);	
	}
}
