//�ĵ�ע��
/**
 * @author С��
 * @version 1.0
 */
public class test{
	public static void main(String[] args){
		System.out.println("����\t����\t�۸�\t����\n����\t�޹���\t120\t1000");

		System.out.println('1'+1);

		byte a=10;
		System.out.println(a);


		//��java�У�char�ı�����һ����������Ĭ�����ʱ����unicode���Ӧ���ַ�
		char c1 = 97;
		System.out.println(c1); // a
		char c2 = 'a'; //���'a' ��Ӧ�� ����
		System.out.println((int)c2); //Ҫ�����Ӧ�����֣�����(int)�ַ�
		char c3 = '��';
		System.out.println((int)c3);//38889
		char c4 = 38889;
		System.out.println(c4);//��

	}
}
