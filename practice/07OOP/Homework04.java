
public class Homework04 { 

	//��дһ��main����
	public static void main(String[] args) {
		int[] oldArr = {10, 30, 50};
		A03 a03 = new A03();
		int[] newArr = a03.copyArr(oldArr);
		//����newArr,��֤
		System.out.println("==���ص�newArrԪ�����==");
		for(int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + "\t");
		}
	}
}

/*
��д��A03, ʵ������ĸ��ƹ���copyArr����������飬����һ�������飬Ԫ�غ;�����һ��
 */
class A03 {
	public int[] copyArr(int[] oldArr) {
		//�ڶ��У�����һ������Ϊ oldArr.length ����
		int[] newArr = new int[oldArr.length];
		//���� oldArr,��Ԫ�ؿ����� newArr
		for(int i = 0; i < oldArr.length; i++) {
			newArr[i] = oldArr[i];
		}

		return newArr;

	}
}