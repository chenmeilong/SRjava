import java.util.Scanner;
public class DoWhileExercise02 { 

	//��дһ��main����
	public static void main(String[] args) {

		//�����������Ǯ�����Ϻ���һֱʹ�������ޣ�ֱ������˵��ǮΪ
		//[System.out.println("�Ϻ��ʣ���Ǯ��y/n")]   do...while ..
		//
		//����Ϊ��
		//(1) ��ͣ���ʻ�Ǯ��?
		//(2) ʹ��char answer ���ջش�, ����һ��Scanner����
		//(3) ��do-while ��while �ж������ y �Ͳ���ѭ��
		//һ���Լ����Խ�..
		Scanner myScanner  = new Scanner(System.in);
		char answer = ' ';
		do {
			System.out.println("�Ϻ�ʹ��������~");
			System.out.println("�Ϻ��ʣ���Ǯ��y/n");
			answer = myScanner.next().charAt(0);
			System.out.println("���Ļش���" + answer);
		}while(answer != 'y');//�ж������ܹؼ�

		System.out.println("������Ǯ��");
	}
}