

public class DoWhileExercise01 { 

	//��дһ��main����
	public static void main(String[] args) {
		//ͳ��1---200֮���ܱ�5���������ܱ�3������ ����
		//����Ϊ��
		//(1) ʹ��do-while��� 1-200
		//(2) ���� �ܱ�5���������ܱ�3�������� %
		//(3) ͳ�����������ĸ��� int count = 0; 
		//�������
		//(1) ��Χ��ֵ 1-200 �������������
		//(2) �ܱ�5���������ܱ�3������ , 5 �� 3 ���Ըĳɱ��� 
		int i = 1;
		int count = 0; //ͳ�����������ĸ���
		do {
			if( i % 5 == 0 && i % 3 != 0 ) {
				System.out.println("i=" + i);
				count++;
			}
			i++;
		}while(i <= 200);

		System.out.println("count=" + count);
	}
}