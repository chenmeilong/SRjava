import java.util.Scanner;
public class SeqSearch { 

	//��дһ��main����
	public static void main(String[] args) {
		/*
		��һ�����У���üӥ������ëʨ����������������������������Ϸ��
		�Ӽ�������������һ�����ƣ��ж��������Ƿ���������ơ�˳����ҡ� 
		Ҫ��: ����ҵ��ˣ�����ʾ�ҵ����������±�ֵ

		˼·����
		1. ����һ���ַ�������
		2. �����û�����, �������飬��һ�Ƚϣ�����У�����ʾ��Ϣ�����˳�
		 */
		
		//����һ���ַ�������
		String[] names = {"��üӥ��", "��ëʨ��", "��������", "��������"};
		Scanner myScanner = new Scanner(System.in); 

		System.out.println("����������");
		String findName = myScanner.next();

		//�������飬��һ�Ƚϣ�����У�����ʾ��Ϣ�����˳�
		//������ʦ�����һ�����˼��/����, һ������ķ���
		int index = -1;
		for(int i = 0; i < names.length; i++) {
			//�Ƚ� �ַ����Ƚ� equals, ���Ҫ�ҵ����־��ǵ�ǰԪ��
			if(findName.equals(names[i])) {
				System.out.println("��ϲ���ҵ� " + findName);
				System.out.println("�±�Ϊ= " + i);
				//��i ���浽 index
				index = i;
				break;//�˳� 
			} 
		}

		if(index == -1) { //û���ҵ�
			System.out.println("sorry ,û���ҵ� " + findName);
		}

	}
}