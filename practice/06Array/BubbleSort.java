
public class BubbleSort { 

	//��дһ��main����
	public static void main(String[] args) {

		//�Ϻ� ����Ϊ���������
		//
		//
		
		
		
		/*
			���� [24,69,80,57,13]
			��1������: Ŀ���������������
			��1�αȽ�[24,69,80,57,13]
			��2�αȽ�[24,69,80,57,13]
			��3�αȽ�[24,69,57,80,13]
			��4�αȽ�[24,69,57,13,80]

		 */
		int[] arr = {24, 69, 80, 57, 13, -1, 30, 200, -110};
		int temp = 0; //���ڸ��������ı���

		//����������ʹ�����ѭ��������������
		//������� =�� 4���� arr.length - 1
		for( int i = 0; i < arr.length - 1; i++) {//���ѭ����4��

			for( int j = 0; j < arr.length - 1 - i; j++) {//4�αȽ�-3��-2��-1��
				//���ǰ�����>����������ͽ���
				if(arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;  
				}
			}
			System.out.println("\n==��"+(i+1)+"��==");
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[j] + "\t");
			}

		}

		// for( int j = 0; j < 4; j++) {//4�αȽ�
		// 	//���ǰ�����>����������ͽ���
		// 	if(arr[j] > arr[j + 1]) {
		// 		temp = arr[j];
		// 		arr[j] = arr[j+1];
		// 		arr[j+1] = temp;  
		// 	}
		// }

		// System.out.println("==��1��==");
		// for(int j = 0; j < arr.length; j++) {
		// 	System.out.print(arr[j] + "\t");
		// }
		// /*
		// ��2������: Ŀ��ѵڶ��������ڵ����ڶ�λ��
		// ��1�αȽ�[24,69,57,13,80]
		// ��2�αȽ�[24,57,69,13,80]
		// ��3�αȽ�[24,57,13,69,80]
		//  */
		
		// for( int j = 0; j < 3; j++) {//3�αȽ�
		// 	//���ǰ�����>����������ͽ���
		// 	if(arr[j] > arr[j + 1]) {
		// 		temp = arr[j];
		// 		arr[j] = arr[j+1];
		// 		arr[j+1] = temp;  
		// 	}
		// }

		// System.out.println("\n==��2��==");
		// for(int j = 0; j < arr.length; j++) {
		// 	System.out.print(arr[j] + "\t");
		// }

		
		// ��3������: Ŀ��ѵ�3�������ڵ�����3λ��
		// ��1�αȽ�[24,57,13,69,80]
		// ��2�αȽ�[24,13,57,69,80]
		 
		
		// for( int j = 0; j < 2; j++) {//2�αȽ�
		// 	//���ǰ�����>����������ͽ���
		// 	if(arr[j] > arr[j + 1]) {
		// 		temp = arr[j];
		// 		arr[j] = arr[j+1];
		// 		arr[j+1] = temp;  
		// 	}
		// }

		// System.out.println("\n==��3��==");
		// for(int j = 0; j < arr.length; j++) {
		// 	System.out.print(arr[j] + "\t");
		// }

		// /*
		// ��4������: Ŀ��ѵ�4�������ڵ�����4λ��
		// ��1�αȽ�[13,24,57,69,80]
		//  */
		
		// for( int j = 0; j < 1; j++) {//1�αȽ�
		// 	//���ǰ�����>����������ͽ���
		// 	if(arr[j] > arr[j + 1]) {
		// 		temp = arr[j];
		// 		arr[j] = arr[j+1];
		// 		arr[j+1] = temp;  
		// 	}
		// }

		// System.out.println("\n==��4��==");
		// for(int j = 0; j < arr.length; j++) {
		// 	System.out.print(arr[j] + "\t");
		// }

	}
}