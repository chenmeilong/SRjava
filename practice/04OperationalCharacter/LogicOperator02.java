//��ʾ| || ʹ��

public class LogicOperator02 { 

	//��дһ��main����
	public static void main(String[] args) {

		//||��·��  �� |�߼��� ������ʾ
		//|| ����: ����������ֻҪ��һ�����������Ϊtrue,����Ϊfalse
		//| ����: ����������ֻҪ��һ�����������Ϊtrue,����Ϊfalse
		int age = 50;
		if(age > 20 || age < 30) {
			System.out.println("ok100");
		}

		//&�߼���ʹ��
		if(age > 20 | age < 30) {
			System.out.println("ok200");
		}

		//��������
		//(1)||��·�������һ������Ϊtrue��
		//��ڶ������������жϣ����ս��Ϊtrue��Ч�ʸ�
		//(2)| �߼��򣺲��ܵ�һ�������Ƿ�Ϊtrue���ڶ���������Ҫ�жϣ�Ч�ʵ�
		int a = 4;
		int b = 9;
		if( a > 1 || ++b > 4) { // ���Ի��� | ����
			System.out.println("ok300");
		}
		System.out.println("a=" + a + " b=" + b); //4 10


	}
}