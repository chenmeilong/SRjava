
public class ThisDetail { 

	//��дһ��main����
	public static void main(String[] args) {

		// T t1 = new T();
		// t1.f2();
		T t2 = new T();
		t2.f3();

	}
}

class T {

	String name = "jack";
	int num = 100;

	/*
	ϸ��: ���ʹ������﷨��this(�����б�); 
	ע��ֻ���ڹ�������ʹ��(��ֻ���ڹ������з�������һ��������)

	ע�⣺ ���ʹ������﷨��this(�����б�); ������õ�һ����� 
	 */
	
	public T() {
		//����ȥ���� T(String name, int age) ������
		this("jack", 100);
		System.out.println("T() ������");
		
	}

	public T(String name, int age) {

		System.out.println("T(String name, int age) ������");
	}

	//this�ؼ��ֿ����������ʱ��������
	public void f3() {
		String name = "smith";
		//��ͳ��ʽ
		System.out.println("name=" + name + " num=" + num);//smith  100
		//Ҳ����ʹ��this��������
		System.out.println("name=" + this.name + " num=" + this.num);//jack 100
	}
	//ϸ��: ���ʳ�Ա�������﷨��this.������(�����б�);
	public void f1() {

		System.out.println("f1() ����..");
	}

	public void f2() {
		System.out.println("f2() ����..");
		//���ñ���� f1
		//��һ�ַ�ʽ
		f1();
		//�ڶ��ַ�ʽ
		this.f1();
	}
	
}