
public class VarParameterDetail { 

	//��дһ��main����
	public static void main(String[] args) {
		//ϸ��: �ɱ������ʵ�ο���Ϊ����
		int[] arr = {1, 2, 3};
		T t1 = new T();
		t1.f1(arr);
	}
}

class T {

	public void f1(int... nums) {
		System.out.println("����=" + nums.length);
	}

	//ϸ��: �ɱ�������Ժ���ͨ���͵Ĳ���һ������β��б������뱣֤�ɱ���������
	public void f2(String str, double... nums) {

	}
	//ϸ��: һ���β��б���ֻ�ܳ���һ���ɱ����
	//�����д���Ǵ��.
	// public void f3(int... nums1, double... nums2) {

	// }
}