
public class Homework06 { 

	//��дһ��main����
	public static void main(String[] args) {
		Cale cale = new Cale(2, 10);
		System.out.println("��=" + cale.sum());
		System.out.println("��=" + cale.minus());
		System.out.println("��=" + cale.mul());
		Double divRes = cale.div();
		if(divRes != null) {
			System.out.println("��=" + divRes);
		} 
	}
}

/*
 ��̴���һ��Cale�����࣬�����ж���2��������ʾ������������
 �����ĸ�����ʵ����͡���ˡ���(Ҫ�����Ϊ0�Ļ���Ҫ��ʾ) �������������󣬷ֱ���� 
 */

class Cale {
	double num1;
	double num2;
	public Cale(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	//��
	public double sum() {
		return num1 + num2;
	}
	//��
	public double minus() {
		return num1 - num2;
	}
	//�˻�
	public double mul() {
		return num1 * num2;
	}
	//����
	//
	public Double div() {
		//�ж�
		if(num2 == 0) {
			System.out.println("num2 ����Ϊ0");
			return null;
		} else {
			return num1 / num2;
		}
	}
}