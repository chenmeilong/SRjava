

public class ArrayAssign { 

	//��дһ��main����
	public static void main(String[] args) {

		//�����������͸�ֵ, ��ֵ��ʽΪֵ����
		//n2�ı仯������Ӱ�쵽n1��ֵ
		int n1 = 10;
		int n2 = n1;

		n2 = 80;
		System.out.println("n1=" + n1);//10
		System.out.println("n2=" + n2);//80

		//������Ĭ������������ô��ݣ�����ֵ�ǵ�ַ����ֵ��ʽΪ���ø�ֵ
		//��һ����ַ , arr2�仯��Ӱ�쵽 arr1
		int[] arr1 = {1, 2, 3};
		int[] arr2 = arr1;//�� arr1���� arr2
		arr2[0] = 10;

		//����arr1��ֵ
		System.out.println("====arr1��Ԫ��====");
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);//10, 2, 3
		}

		System.out.println("====arr2��Ԫ��====");
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);//10, 2, 3
		}

	}
}