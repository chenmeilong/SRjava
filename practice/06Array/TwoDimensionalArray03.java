
public class TwoDimensionalArray03 { 

	//��дһ��main����
	public static void main(String[] args) {

		/*
		��һ�����󣺶�̬���������ά���飬�����
		
		 i = 0:	1		
		 i = 1:	2	2	
		 i = 2:	3	3	3

		 һ��������һά����, ÿ��һά�����Ԫ���ǲ�һ����
		 */
		
		//���� ��ά���飬һ����3��һά���飬����ÿ��һά���黹û�п����ݿռ�
		int[][] arr = new int[3][]; 
		
		for(int i = 0; i < arr.length; i++) {//����arrÿ��һά����
			//��ÿ��һά���鿪�ռ� new
			//���û�и�һά���� new ,��ô arr[i]����null
			arr[i] = new int[i + 1]; 

			//����һά���飬����һά�����ÿ��Ԫ�ظ�ֵ
			for(int j = 0;  j < arr[i].length; j++) {
				arr[i][j] = i + 1;//��ֵ
			}

		}

		System.out.println("=====arrԪ��=====");
		//����arr���
		for(int i = 0; i < arr.length; i++) {
			//���arr��ÿ��һά����
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();//����
		}
		

	}
}