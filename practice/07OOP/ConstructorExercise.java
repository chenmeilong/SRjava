
public class ConstructorExercise { 

	//��дһ��main����
	public static void main(String[] args) {
		Person p1 = new Person();//�޲ι�����

		//������� name = null, age = 18
		System.out.println("p1����Ϣ name=" + p1.name + " age=" + p1.age);

		Person p2 = new Person("scott", 50);
		//������� name = scott, age = 50
		System.out.println("p2����Ϣ name=" + p2.name + " age=" + p2.age);

	}
}

/**
 * ��ǰ�涨���Person�����������������:
 * ��һ���޲ι����������ù��������������˵�age���Գ�ʼֵ��Ϊ18
 * �ڶ�����pName��pAge���������Ĺ�������
 * ʹ��ÿ�δ���Person�����ͬʱ��ʼ�������age����ֵ��name����ֵ��
 * �ֱ�ʹ�ò�ͬ�Ĺ���������������.
 */

class Person {
	String name;//Ĭ��ֵ null
	int age;//Ĭ�� 0
	//��һ���޲ι����������ù��������������˵�age���Գ�ʼֵ��Ϊ18
	public Person() {
		age = 18;//
	}
	//�ڶ�����pName��pAge���������Ĺ�����
	public Person(String pName, int pAge) {
		name = pName;
		age = pAge;
	}
}