 
public class RecursionExercise01 { 

	//��дһ��main����
	public static void main(String[] args) {

		T t1 = new T();
		// int n = 7;
		// int res = t1.fibonacci(n);
		// if(res != -1) {
		// 	System.out.println("��n="+ n +" ��Ӧ��쳲�������=" + res);
		// } 
		// 
		//��������
		int day = 0;
		int peachNum = t1.peach(day);
		if(peachNum != -1) {
			System.out.println("�� " + day + "����" + peachNum + "������");
		}


	}
}

class T {
		/*
		��ʹ�õݹ�ķ�ʽ���쳲�������1,1,2,3,5,8,13...����һ������n���������ֵ�Ƕ�
		˼·����
		1. ��n = 1 쳲������� ��1
		2. ��n = 2 쳲������� ��1
		3. ��n >= 3  쳲������� ��ǰ�������ĺ�
		4. �������һ���ݹ��˼·
		 */
	
		public int fibonacci(int n) {
			if( n >= 1) {
				if( n == 1 || n == 2) {
					return 1;
				} else {
					return fibonacci(n-1) + fibonacci(n-2);
				}
			} else {
				System.out.println("Ҫ�������n>=1������");
				return -1;
			}
		}

		/*
		���ӳ��������⣺��һ�����ӣ����ӵ�һ��������е�һ�룬���ٶ����һ����
		�Ժ�ÿ����Ӷ������е�һ�룬Ȼ���ٶ��һ����������10��ʱ��
		���ٳ�ʱ������û�ԣ�������ֻ��1�������ˡ����⣺��������ٸ����ӣ�
		
		˼·���� ����
		1. day = 10 ʱ �� 1������
		2. day = 9 ʱ  �� (day10 + 1) * 2 = 4
		3. day = 8 ʱ  �� (day9 + 1) * 2 = 10
		4. ���ɾ���  ǰһ������� = (��һ������� + 1) *2//�������ǵ�����
		5. �ݹ�
		 */
		public int peach(int day) { 
			if(day == 10) {//��10�죬ֻ��1����
				return 1; 
			} else if ( day >= 1 && day <=9 ) {
				return (peach(day + 1) + 1) * 2;//�����Լ�Ҫ��
			} else {
				System.out.println("day��1-10");
				return -1;
			}
		}
	
}