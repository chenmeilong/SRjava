
public class MethodDetail { 

	
	public static void main(String[] args) {

		AA a = new AA();
		int[] res = a.getSumAndSub(1, 4);
		System.out.println("��=" + res[0]);
		System.out.println("��=" + res[1]);


		//ϸ��: ���ô������ķ���ʱ��һ����Ӧ�Ų����б�����ͬ���ͻ�������� �Ĳ���
		byte b1 = 1;
		byte b2 = 2;
		a.getSumAndSub(b1, b2);//byte -> int 
		//a.getSumAndSub(1.1, 1.8);//double ->int(��)
		//ϸ��: ʵ�κ��βε�����Ҫһ�»���ݡ�������˳�����һ��
		
		//a.getSumAndSub(100);//�� ������һ��
		a.f3("tom", 10); //ok
		//a.f3(100, "jack"); // ʵ�ʲ�������ʽ����˳�򲻶�
		
	}
}

class AA {

	//ϸ��: ��������Ƕ�׶���
	public void f4() {
		//����
		// public void f5() {

		// }
	}

	public void f3(String str, int n) {

	}

	//1. һ�����������һ������ֵ  [˼������η��ض����� �������� ]
	public int[] getSumAndSub(int n1, int n2) {

		int[] resArr = new int[2]; //
		resArr[0] = n1 + n2;
		resArr[1] = n1 - n2;
		return resArr;
	}
	//2. �������Ϳ���Ϊ�������ͣ������������ͻ���������(���飬����)
	//   ���忴 getSumAndSub
	//   
	
	//3. �������Ҫ���з����������ͣ��򷽷���������ִ��������Ϊ return ֵ; 
	//   ����Ҫ�󷵻�ֵ���ͱ����return��ֵ����һ�»����
	public double f1() {

		double d1 = 1.1 * 3;
		int n = 100;
		return n; // int ->double 
		//return d1; //ok? double -> int 
	}

	//���������void���򷽷����п���û��return��䣬���� ֻд return ; 
	//�Ϻ���ʾ����ʵ�ʹ����У����ǵķ�������Ϊ�����ĳ�����ܣ����Է�����Ҫ��һ������
	//������Ǽ���֪��
	public void f2() {

		System.out.println("hello1");
		System.out.println("hello1");
		System.out.println("hello1");
		int n = 10;
		//return ;
	}

}