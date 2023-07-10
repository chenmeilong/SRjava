
public class OverLoadExercise { 

	//��дһ��main����
	public static void main(String[] args) {

		//�������main ()�����зֱ��ò������������������
		Methods method = new Methods();
		method.m(10);//100
		method.m(10, 20);//200
		method.m("��˳ƽ���� hello");//�ַ�����Ϣ

		//����
		System.out.println(method.max(10, 24)); // 24
		System.out.println(method.max(10.0, 21.4)); // 21.4
		System.out.println(method.max(10.0, 1.4, 30.0)); // 30.0
	}
}

/*
��д������Methods�ж����������ط��������á�������Ϊm��
���������ֱ����һ��int����������int������һ���ַ����������ֱ�ִ��ƽ�����㲢��������
��˲�������������ַ�����Ϣ���������main ()�����зֱ��ò������������������


�����������ط���max()����һ����������������intֵ�е����ֵ��
�ڶ�����������������doubleֵ�е����ֵ��������������
��������doubleֵ�е����ֵ�����ֱ������������
 */
class Methods {

	//����
	//1 ������ max
	//2 �β� (int,int) 
	//3.int
	public int max(int n1, int n2) {
		return n1 > n2 ? n1 : n2;
	}

	//����
	//1 ������ max
	//2 �β� (double,double) 
	//3.double
	public double max(double n1, double n2) {
		return n1 > n2 ? n1 : n2;
	}

	//����
	//1 ������ max
	//2 �β� (double,double,double) 
	//3.double
	public double max(double n1, double n2, double n3) {
		
		System.out.println("max(double n1, double n2, double n3)");
		//���n1 ��  n2�����ֵ
		double max1 = n1 > n2 ? n1 : n2;
		return max1 > n3 ? max1 : n3;
	}

	public double max(double n1, double n2, int n3) {
		
		System.out.println("max(double n1, double n2, int n3)");
		//���n1 ��  n2�����ֵ
		double max1 = n1 > n2 ? n1 : n2;
		return max1 > n3 ? max1 : n3;
	}
	

	//����
	//1 ������ m
	//2 �β� (int) 
	//3.void
	public void m(int n) {
		System.out.println("ƽ��=" + (n * n));
	} 

	//1 ������ m
	//2 �β� (int, int) 
	//3.void
	public void m(int n1, int n2) {
		System.out.println("���=" + (n1 * n2));
	}

	//1 ������ m
	//2 �β� (String) 
	//3.void
	public void m(String str) {
		System.out.println("�����str=" + str);
	}
}