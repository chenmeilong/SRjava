

public class MethodExercise01 { 
	public static void main(String[] args) {
		AA a = new AA();
		a.print(4, 4, '#');
	}
}
//��д��AA ����һ���������ж�һ����������odd����ż��, ����boolean
class AA {
	public boolean isOdd(int num) {
		return num % 2 != 0;
	}
	//�����С��С��ַ���ӡ ��Ӧ�������������ַ���
	//���磺�У�4���У�4���ַ�#,���ӡ��Ӧ��Ч��
	public void print(int row, int col, char c) {
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {//���ÿһ��
				System.out.print(c);
			}
			System.out.println(); //����
		}
	}
}





