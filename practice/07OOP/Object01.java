
public class Object01 { 

	//��дһ��main����
	public static void main(String[] args) {

		/*
		����̫������ֻèè:һֻ���ֽ�С��,����3��,��ɫ�� 
		����һֻ��С��,����100��,��ɫ�����дһ�����򣬵��û�����Сè������ʱ��
		����ʾ��è�����֣����䣬��ɫ������û������Сè������
		����ʾ ����̫û����ֻèè��
		 */
		//������������� => ���������ݵĹ���(���һֻè����Ϣ���)
		//��1ֻè��Ϣ
		
		// String cat1Name = "С��";
		// int cat1Age = 3;
		// String cat1Color = "��ɫ";

		// //��2ֻè��Ϣ
		// String cat2Name = "С��";
		// int cat2Age = 100;
		// String cat2Color = "��ɫ";

		//���� ===>(1)�����������ֲ�����(2) ֻ��ͨ��[�±�]��ȡ��Ϣ����ɱ������ֺ�����
		//         �Ķ�Ӧ��ϵ����ȷ(3) ��������è����Ϊ
		//��1ֻè��Ϣ
		
		// String[] cat1 = {"С��", "3", "��ɫ"}; 
		// String[] cat2 = {"С��", "100", "��ɫ"};


		//ʹ��OOP���������
		//ʵ����һֻè[����һֻè����]
		//�Ϻ����
		//1. new Cat() ����һֻè(è����)
		//2. Cat cat1 = new Cat(); �Ѵ�����è���� cat1 
		//3. cat1 ����һ������
		Cat cat1 = new Cat();
		cat1.name = "С��";
		cat1.age = 3;
		cat1.color = "��ɫ";
		cat1.weight = 10;
		//�����˵ڶ�ֻè�������� cat2
		//cat2 Ҳ��һ������(è����)
		Cat cat2 = new Cat();
		cat2.name = "С��";
		cat2.age = 100;
		cat2.color = "��ɫ";
		cat2.weight = 20;

		//��ô���ʶ����������
		System.out.println("��1ֻè��Ϣ" + cat1.name 
			+ " " + cat1.age + " " + cat1.color + " " + cat1.weight);

		System.out.println("��2ֻè��Ϣ" + cat2.name 
			+ " " + cat2.age + " " + cat2.color + " " + cat2.weight);
	}
}


//ʹ���������ķ�ʽ�������è����
//
//����һ��è�� Cat -> �Զ������������
class Cat {
	//����/��Ա����
	String name; //����
	int age; //����
	String color; //��ɫ
	//double weight; //����

	//��Ϊ

}