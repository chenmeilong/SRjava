
public class CharDetail { 

	//��дһ��main����
	public static void main(String[] args) {

		//��java�У�char�ı�����һ����������Ĭ�����ʱ����unicode���Ӧ���ַ�
		//Ҫ�����Ӧ�����֣�����(int)�ַ�
		char c1 = 97;
		System.out.println(c1); // a

		char c2 = 'a'; //���'a' ��Ӧ�� ����
		System.out.println((int)c2);
		char c3 = '��';
		System.out.println((int)c3);//38889
		char c4 = 38889;
		System.out.println(c4);//��

		//char�����ǿ��Խ�������ģ��൱��һ����������Ϊ������Ӧ��Unicode��.
		
		System.out.println('a' + 10);//107

		//����С����
		char c5 = 'b' + 1;//98+1==> 99
		System.out.println((int)c5); //99
		System.out.println(c5); //99->��Ӧ���ַ�->�����ASCII(�涨�õ�)=>c
	}
}