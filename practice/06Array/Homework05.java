
public class Homework05 { 

	//��дһ��main����
	public static void main(String[] args) {
		
		/*
		�������10������(1_100�ķ�Χ)���浽���飬
		�������ӡ�Լ���ƽ��ֵ�������ֵ�����ֵ���±ꡢ
		�����������Ƿ��� 8  Homework05.java
		 */
		
		int[] arr = new int[10]; 
		//(int)(Math.random() * 100) + 1 ���� ����� 1-100
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
		}

		System.out.println("====arr��Ԫ�����=====");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}

		System.out.println("\n====arr��Ԫ�����(����)=====");
		for(int i = arr.length -1; i >= 0; i--) {
			System.out.print(arr[i] + "\t");
		}

		//ƽ��ֵ�������ֵ�����ֵ���±�
		//�������ｫ��Ҫһ�����
		//
		double sum = arr[0];
		int max = arr[0];
		int maxIndex = 0;
		for(int i = 1; i < arr.length; i++ ) {

			sum += arr[i]; //�ۻ���

			if( max < arr[i]) {//˵��max�������ֵ���ͱ仯
				max = arr[i];
				maxIndex = i;
			}
		}

		System.out.println("\nmax=" + max + " maxIndex=" + maxIndex);
		System.out.println("\nƽ��ֵ=" + (sum / arr.length));


		//�����������Ƿ���8->ʹ��˳�����
		int findNum = 8;
		int index = -1; //����ҵ����Ͱ��±��¼�� index
		for(int i = 0; i < arr.length; i++) {
			if(findNum == arr[i]) {
				System.out.println("�ҵ���" + findNum + " �±�=" + i);
				index = i;
				break;
			}
		}

		if(index == -1) {
			System.out.println("û���ҵ���" + findNum );
		}


		

	}
}