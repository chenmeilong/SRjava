//������ϰ
import java.util.Scanner;
public class If03 { 

	//��дһ��main����
	public static void main(String[] args) {
		/*
		���뱣��ͬ־��֥�����÷֣�
		�����
		���÷�Ϊ100��ʱ����� ���ü��ã�
		���÷�Ϊ(80��99]ʱ����� �������㣻
		���÷�Ϊ[60,80]ʱ����� ����һ�㣻
		������� ����� ���� ������ 
		��Ӽ������뱣����֥�����÷֣��������ж�
		�ٶ����÷���Ϊint
		 */
		
		Scanner myScanner = new Scanner(System.in);
		//�����û�����
		System.out.println("���������÷�(1-100):");
		//��˼�������С�������Ĳ�������������hello..
		//==>�������Ǻ������ʹ���쳣������Ƹ㶨-����ʦ��һ��
		int grade = myScanner.nextInt();

		//�ȶ���������÷֣�����һ����Χ����Ч�ж� 1-100, ������ʾ�������

		if(grade >=1 && grade <= 100) {
			//��Ϊ��4�����������ʹ�ö��֧
			if(grade == 100) {
				System.out.println("���ü���");
			} else if (grade > 80 && grade <= 99) { //���÷�Ϊ(80��99]ʱ����� �������㣻
				System.out.println("��������");
			} else if (grade >= 60 && grade <= 80) {//���÷�Ϊ[60,80]ʱ����� ����һ��
				System.out.println("����һ��");
			} else {//������� ����� ���� ������ 
				System.out.println("���ò�����");
			}

		} else {
			System.out.println("���÷���Ҫ��1-100,����������:)");
		}

	}
}