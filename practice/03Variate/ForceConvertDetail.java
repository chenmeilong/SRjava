
public class ForceConvertDetail { 

	//��дһ��main����
	public static void main(String[] args) {
		
		//��ʾǿ������ת��
		//ǿת����ֻ���������Ĳ�������Ч��������ʹ��С�����������ȼ�
		//int x = (int)10*3.5+6*1.5;//������� double -> int 
		int x = (int)(10*3.5+6*1.5);// (int)44.0 -> 44
		System.out.println(x);//44


		char c1 = 100; //ok
		int m = 100; //ok
		//char c2 = m; //����
		char c3 = (char)m; //ok
		System.out.println(c3);//100��Ӧ���ַ�, d�ַ�

		
	}
}