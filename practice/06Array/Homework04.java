
public class Homework04 { 

	//��дһ��main����
	public static void main(String[] args) {

		/*
		��֪�и���������飬Ҫ�����һ��Ԫ�أ�������˳����Ȼ������, ����:  
		[10�� 12�� 45�� 90],  ���23 ��, ����Ϊ [10�� 12��23�� 45�� 90]


		˼· ������������ + ��λ
		1. ������ȷ�� �����Ӧ�ò��뵽�ĸ�����
		2. Ȼ������
		 */
		
		//�ȶ���ԭ����
		/*
		int[] arr = {10, 12, 45, 90};
		int insertNum = 111;
		int index = -1; //index����Ҫ�����λ��

		//���� arr���飬 ������� insertNum<=arr[i], ˵�� i ����Ҫ�����λ��
		//ʹ�� index ���� index = i;
		//����������û�з��� insertNum<=arr[i]�� ˵�� index = arr.length
		//������ӵ�arr�����
		
		for(int i = 0; i < arr.length; i++) {
			if(insertNum <= arr[i]) {
				index = i;
				break; //�ҵ�λ�ú󣬾��˳�
			}
		}

		//�ж�index ��ֵ
		if(index == -1) { //˵��û�л�û���ҵ�λ��
			index = arr.length;
		}

		//����
		//�ȴ���һ���µ����飬��С arr.length + 1
		int[] arrNew = new int[arr.length + 1];
		//������ʦ׼����arr��Ԫ�ؿ����� arrNew ,����Ҫ���� indexλ��
		/*
		����:
		int[] arr = {10, 12, 45, 90};
		arrNew = {              }
		*/
		/*
		//i ����arrNew���±�  , j��������arr������±�
		for(int i = 0, j = 0; i < arrNew.length; i++) {

			if( i != index ) { //˵�����԰� arr��Ԫ�ؿ����� arrNew
				arrNew[i] = arr[j];
				j++;
			} else { //i���λ�þ���Ҫ�������
				arrNew[i] = insertNum;
			}
		}

		//��arr ָ�� arrNew , ԭ�������飬�ͳ�Ϊ������������
		arr = arrNew;

		System.out.println("======�����arr�����Ԫ�����======");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}

		*/
	}
}