//��Ԫ�����ʹ��

public class TernaryOperator { 

	//��дһ��main����
	public static void main(String[] args) {

		int a = 10;
		int b = 99;
		// ���
		// 1. a > b Ϊ false
		// 2. ���� b--, �ȷ��� b��ֵ,Ȼ���� b-1
		// 3. ���صĽ����99 
		int result = a > b ? a++ : b--;
		System.out.println("result=" + result);
		System.out.println("a=" + a);
		System.out.println("b=" + b);

	}
}