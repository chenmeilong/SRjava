 
import java.util.Scanner;
public class SwitchExercise { 

	//��дһ��main����
	public static void main(String[] args) {

		//ʹ�� switch ��Сд���͵� 
		//char��תΪ��д(��������)��ֻת�� a->A, b->B, c, d, e. 
		//��������� "other"��
		
		//����Scanner����
		// Scanner myScanner = new Scanner(System.in);
		// System.out.println("������a-e");
		// char c1 = myScanner.next().charAt(0);
		// switch(c1) {
		// 	case 'a' :
		// 		System.out.println("A");
		// 		break;
		// 	case 'b' :
		// 		System.out.println("B");
		// 		break;
		// 	case 'c' :
		// 		System.out.println("C");
		// 		break;
		// 	case 'd' :
		// 		System.out.println("D");
		// 		break;
		// 	case 'e' :
		// 		System.out.println("E");
		// 		break;
		// 	default :
		// 		System.out.println("�����������~");

		// }

		//��ѧ���ɼ�����60�ֵģ����"�ϸ�"������60�ֵģ�
		//���"���ϸ�"��(ע������ĳɼ����ܴ���100), ��ʾ �ɼ�/60
		//˼·����
		//1. ����⣬����ʹ�� ��֧����ɣ� ����Ҫ��ʹ��switch
		//2. ����������Ҫ����һ��ת��, ���˼· : 
		//   ����ɼ��� [60,100] , (int)(�ɼ�/60) = 1 
		//   ����ɼ��� [0,60) , (int)(�ɼ�/60) = 0 
		
		//����ʵ��
		
		double score = 1.1;

		//ʹ��if-else ��֤����ĳɼ�����Ч�� 0-100
		//���˵���ʦ�ķ����ʹ�����ʾ���Լ�һ��Ҫ������ɣ������Ϻ����룬Ҳ��д��
		if( score >= 0 && score <= 100) {
			switch ((int)(score / 60)) {
				case 0 :
					System.out.println("���ϸ�");
					break;
				case 1 :
					System.out.println("�ϸ�");
					break;
				// default :
				// 	System.out.println("��������");
			}
		} else {
			System.out.println("����ĳɼ���0-100");
		}

		//��������ָ���·ݣ�
		//��ӡ���·������ļ��ڡ�
		//3,4,5 ���� 6,7,8 �ļ�  9,10,11 �＾ 12, 1, 2 ���� 
		//[������ϰ, ��ʾ ʹ�ô�͸ ] 
		//
		//˼·����
		//1. ����Scanner���� �����û�����
		//2. ʹ�� int month ����
		//3. ʹ��switch ��ƥ�� ,ʹ�ô�͸����ɣ��Ƚϼ��
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("�����·�");
		int month = myScanner.nextInt();
		switch(month) {
			case 3:
			case 4:
			case 5: 
				System.out.println("���Ǵ���");
				break;
			case 6:
			case 7:
			case 8: 
				System.out.println("�����ļ�");
				break;
			case 9:
			case 10:
			case 11: 
				System.out.println("�����＾");
				break;
			case 1:
			case 2:
			case 12: 
				System.out.println("���Ƕ���");
				break;
			default :
				System.out.println("��������·ݲ���(1-12)");
		}


	}
}