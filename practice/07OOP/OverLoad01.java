
public class OverLoad01 { 

	//��дһ��main����
	public static void main(String[] args) {

		// System.out.println(100);
		// System.out.println("hello,world");
		// System.out.println('h');
		// System.out.println(1.1);
		// System.out.println(true);
		// 
		MyCalculator mc = new MyCalculator();
		System.out.println(mc.calculate(1, 2));
		System.out.println(mc.calculate(1.1, 2));
		System.out.println(mc.calculate(1, 2.1));
	}
}

class MyCalculator  {

	//������ĸ� calculate��������������
	//���������ĺ�
	public int calculate(int n1, int n2)  {
		System.out.println("calculate(int n1, int n2) ������");
		return n1 + n2;
	}

	//û�й��ɷ�������, ��Ȼ�Ǵ���ģ���Ϊ�Ƿ������ظ�����
	// public void calculate(int n1, int n2)  {
	// 	System.out.println("calculate(int n1, int n2) ������");
	// 	int res =  n1 + n2;
	// } 

	//���������Ƿ񹹳�����, û�й��ɣ����Ƿ������ظ�����,�ʹ���
	// public int calculate(int a1, int a2)  {
	// 	System.out.println("calculate(int n1, int n2) ������");
	// 	return a1 + a2;
	// } 

	//һ��������һ��double�ĺ�
	public double calculate(int n1, double n2) {
		return n1 + n2;
	}
	//һ��double ,һ��Int�� 
	public double calculate(double n1, int n2) {
		System.out.println("calculate(double n1, int n2) ������..");
		return n1 + n2;
	}
	//����int�ĺ�
	public int calculate(int n1, int n2,int n3) {
		return n1 + n2 + n2;
	}

}