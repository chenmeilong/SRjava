
public class YangHui { 

	//��дһ��main����
	public static void main(String[] args) {
		/*
		ʹ�ö�ά�����ӡһ�� 10 ���������
		1
		1 1
		1 2 1
		1 3 3  1
		1 4 6  4  1
		1 5 10 10 5 1

		����
		 1.��һ���� 1 ��Ԫ��, �� n ���� n ��Ԫ��
		 2. ÿһ�еĵ�һ��Ԫ�غ����һ��Ԫ�ض��� 1
		 3. �ӵ����п�ʼ, ���ڷǵ�һ��Ԫ�غ����һ��Ԫ�ص�Ԫ�ص�ֵ. arr[i][j] 
		  arr[i][j]  =  arr[i-1][j] + arr[i-1][j-1]; //�����ҵ��������

		 */
		int[][] yangHui = new int[12][];
		for(int i = 0; i < yangHui.length; i++) {//����yangHui��ÿ��Ԫ��

			//��ÿ��һά����(��) ���ռ�
			yangHui[i] = new int[i+1];
			//��ÿ��һά����(��) ��ֵ
			for(int j = 0; j < yangHui[i].length; j++){
				//ÿһ�еĵ�һ��Ԫ�غ����һ��Ԫ�ض���1
				if(j == 0 || j == yangHui[i].length - 1) {
					yangHui[i][j] = 1;
				} else {//�м��Ԫ��
					yangHui[i][j]  =  yangHui[i-1][j] + yangHui[i-1][j-1];
				}
			}
		}
		//����������
		for(int i = 0; i < yangHui.length; i++) {
			for(int j = 0; j < yangHui[i].length; j++) {//�����������
				System.out.print(yangHui[i][j] + "\t");
			}
			System.out.println();//����.
		}
		
	}
}