
public class ArrayExercise01 { 

	//��дһ��main����
	public static void main(String[] args) {

		/*
		����һ��char���͵�26��Ԫ�ص����飬�ֱ� ����'A'-'Z'��
		ʹ��forѭ����������Ԫ�ز���ӡ������
		��ʾ��char������������ 'A'+1 -> 'B'  

		˼·����
		1. ����һ�� ����  char[] chars = new char[26]
		2. ��Ϊ 'A' + 1 = 'B' ���ƣ�������ʦʹ��for����ֵ
		3. ʹ��forѭ����������Ԫ��
		 */
		char[] chars = new char[26];
		for( int i = 0; i < chars.length; i++) {//ѭ��26��
			//chars �� char[] 
			//chars[i] �� char
			chars[i] = (char)('A' + i); //'A' + i ��int , ��Ҫǿ��ת��
		}

		//ѭ�����
		System.out.println("===chars����===");
		for( int i = 0; i < chars.length; i++) {//ѭ��26��
			System.out.print(chars[i] + " ");
		}
		
	}
}