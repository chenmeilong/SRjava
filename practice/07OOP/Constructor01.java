
public class Constructor01 { 

	//��дһ��main����
	public static void main(String[] args) {
		//������new һ������ʱ��ֱ��ͨ��������ָ�����ֺ�����
		Person p1 = new Person("smith", 80);
		System.out.println("p1����Ϣ����");
		System.out.println("p1����name=" + p1.name);//smith
		System.out.println("p1����age=" + p1.age);//80
	}
}

//�ڴ�������Ķ���ʱ����ֱ��ָ�������������������
//
class Person {
	String name;
	int age;
	//������
	//�Ϻ����
	//1. ������û�з���ֵ, Ҳ����дvoid
	//2. �����������ƺ���Personһ��
	//3. (String pName, int pAge) �ǹ������β��б�����ͳ�Ա����һ��
	public  Person(String pName, int pAge) {
		System.out.println("������������~~ ��ɶ�������Գ�ʼ��");
		name = pName;
		age = pAge;
	}
}