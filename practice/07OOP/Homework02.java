
public class Homework02 { 

	//��дһ��main����
	public static void main(String[] args) {

		String[] strs = {"jack", "tom", "mary","milan"};
		A02 a02 = new A02();
		int index = a02.find("milan", strs);
		System.out.println("���ҵ�index=" + index);
	}
}

//��д��A02�����巽��find��ʵ�ֲ���ĳ�ַ����Ƿ����ַ��������У�
//����������������Ҳ���������-1
//����
//1. ���� A02
//2. ������ find
//3. ����ֵ int
//4. �β� (String , String[])
//
//�Լ�������뽡׳��
class A02 {

	public int find(String findStr, String[] strs) {
		//ֱ�ӱ����ַ������飬����ҵ����򷵻�����
		for(int i = 0; i < strs.length; i++) {
			if(findStr.equals(strs[i])) {
				return i;
			}
		}
		//���û�У��ͷ���-1
		return -1;
	}
}