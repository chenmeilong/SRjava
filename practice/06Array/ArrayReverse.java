
public class ArrayReverse { 

	//��дһ��main����
	public static void main(String[] args) {

		//��������
		int[] arr = {11, 22, 33, 44, 55, 66};
		//�Ϻ�˼·
		//����
		//1. �� arr[0] �� arr[5] ���н��� {66,22,33,44,55,11}
		//2. �� arr[1] �� arr[4] ���н��� {66,55,33,44,22,11}
		//3. �� arr[2] �� arr[3] ���н��� {66,55,44,33,22,11}
		//4. һ��Ҫ���� 3 �� = arr.length / 2
		//5. ÿ�ν���ʱ����Ӧ���±� �� arr[i] �� arr[arr.length - 1 -i]
		//����
		//�Ż�
		int temp = 0;
		int len = arr.length; //��������ĳ���
		for( int i = 0; i < len / 2; i++) {
			temp = arr[len - 1 - i];//����
			arr[len - 1 - i] = arr[i];
			arr[i] = temp; 
		}

		System.out.println("===��ת������===");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");//66,55,44,33,22,11
		}
	}
}