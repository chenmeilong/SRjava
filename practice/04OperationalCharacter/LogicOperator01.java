/**
 * ��ʾ�߼��������ʹ��
 */

public class LogicOperator01 { 

	//��дһ��main����
	public static void main(String[] args) {
		//&&��·��  �� & ������ʾ
		int age = 50;
		if(age > 20 && age < 90) {
			System.out.println("ok100");
		}

		//&�߼���ʹ��
		if(age > 20 & age < 90) {
			System.out.println("ok200");
		}

		//����
		int a = 4;
		int b = 9;
		//����&&��·����ԣ������һ������Ϊfalse ,��������������ж�
		//����&�߼�����ԣ������һ������Ϊfalse ,�����������Ȼ���ж�
		if(a < 1 & ++b < 50) {
			System.out.println("ok300");
		}
		System.out.println("a=" + a + " b=" + b);// 4 10

		

	}
}