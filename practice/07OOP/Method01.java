
public class Method01 { 

	//��дһ��main����
	public static void main(String[] args) {
		//����ʹ��
		//1. ����д�ú������ȥ����(ʹ��)���������
		//2. �ȴ������� ,Ȼ����÷�������
		Person p1 = new Person();
		p1.speak(); //���÷���
		p1.cal01(); //����cal01����
		p1.cal02(5); //����cal02������ͬʱ��n = 5
		p1.cal02(10); //����cal02������ͬʱ��n = 10
		
		//����getSum������ͬʱnum1=10, num2=20
		//�� ���� getSum ���ص�ֵ������ ���� returnRes
		int returnRes = p1.getSum(10, 20); 
		System.out.println("getSum�������ص�ֵ=" + returnRes);
	}
}

class Person {
	
	String name;
	int age;
	//����(��Ա����)
	//���speak ��Ա����,��� ������һ�����ˡ�
	//�Ϻ����
	//1. public ��ʾ�����ǹ���
	//2. void �� ��ʾ����û�з���ֵ
	//3. speak() : speak�Ƿ������� () �β��б�
	//4. {} �����壬����д����Ҫִ�еĴ���
	//5. System.out.println("����һ������"); ��ʾ���ǵķ����������һ�仰
	
	public void speak() {
		System.out.println("����һ������");
	}

	//���cal01 ��Ա����,���Լ���� 1+..+1000�Ľ��
	public void cal01() {
		//ѭ�����
		int res = 0;
		for(int i = 1; i <= 1000; i++) {
			res += i;
		}
		System.out.println("cal01���� ������=" + res);
	}
	//���cal02 ��Ա����,�÷������Խ���һ����n������� 1+..+n �Ľ��
	//�Ϻ����
	//1. (int n) �β��б� ��ʾ��ǰ��һ���β� n, ���Խ����û�����
	public void cal02(int n) {
		//ѭ�����
		int res = 0;
		for(int i = 1; i <= n; i++) {
			res += i;
		}
		System.out.println("cal02���� ������=" + res);
	}

	//���getSum��Ա����,���Լ����������ĺ�
	//�Ϻ����
	//1. public ��ʾ�����ǹ�����
	//2. int :��ʾ����ִ�к󣬷���һ�� int ֵ
	//3. getSum ������
	//4. (int num1, int num2) �β��б�2���βΣ����Խ����û������������
	//5. return res; ��ʾ�� res ��ֵ�� ����
	public int getSum(int num1, int num2) {
		int res = num1 + num2;
		return res;
	}
}