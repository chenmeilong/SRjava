//if-else�Ŀ�������
import java.util.Scanner;//����
public class If02 { 

	//��дһ��main����
	public static void main(String[] args) {
		//��дһ������,���������˵�����,�����ͬ־���������18��,
		//����� "���������18,Ҫ��
		//�Լ�����Ϊ����, �������"������ ,���"������䲻����ηŹ�����."

		//
		//˼·����
		//1. �������������, Ӧ�ö���һ��Scanner ����
		//2. �����䱣�浽һ������ int age
		//3. ʹ�� if-else �жϣ������Ӧ��Ϣ
		
		//Ӧ�ö���һ��Scanner ����
		Scanner myScanner = new Scanner(System.in);
		System.out.println("����������");
		//�����䱣�浽һ������ int age
		int age = myScanner.nextInt();
		//ʹ�� if-else �жϣ������Ӧ��Ϣ
		if(age > 18) {
			System.out.println("���������18,Ҫ���Լ�����Ϊ����,�������");
		} else {//˫��֧
			System.out.println("������䲻����ηŹ�����");
		}

		System.out.println("�������...");


	}
}