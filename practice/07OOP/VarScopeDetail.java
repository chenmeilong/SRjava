
public class VarScopeDetail { 

	//��дһ��main����
	public static void main(String[] args) {
		Person p1 = new Person();
		/*
		�����������ڽϳ��������Ŷ���Ĵ����������������Ŷ�������ٶ����١�
		�ֲ��������������ڽ϶̣����������Ĵ�����ִ�ж�������
		�����Ŵ����Ľ��������١�����һ�η������ù�����
		 */
		//p1.say();//��ִ��say����ʱ��say�����ľֲ���������name,�ᴴ������sayִ����Ϻ�
		//name�ֲ�����������,��������(ȫ�ֱ���)��Ȼ����ʹ��
		//
		T t1 = new T();
		t1.test(); //��1�ֿ�����ʶ������Եķ�ʽ

		t1.test2(p1);//��2�ֿ�����ʶ������Եķ�ʽ

	}
}

class T {

	//ȫ�ֱ���/���ԣ����Ա�����ʹ�ã���������ʹ�ã�ͨ���������)
	public void test() {
		Person p1 = new Person();
		System.out.println(p1.name);//jack
	}

	public void test2(Person p) {
		System.out.println(p.name);//jack
	}
}

class Person {
	//ϸ��: ���Կ��Լ����η�(public protected private..)
	//      �ֲ��������ܼ����η�
	public int age = 20;

	String name = "jack";

	public void say() {
		//ϸ�� ���Ժ;ֲ�������������������ʱ��ѭ�ͽ�ԭ��
		String name = "king";
		System.out.println("say() name=" + name);
	}

	public void hi() {
		String address = "����";
		//String address = "�Ϻ�";//����,�ظ��������
		String name = "hsp";//����
	}
}