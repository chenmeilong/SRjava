import java.util.Scanner;
public class ArrayAdd02 { 

	//��дһ��main����
	public static void main(String[] args) {
		/*
		Ҫ��ʵ�ֶ�̬�ĸ��������Ԫ��Ч����ʵ�ֶ��������ݡ�ArrayAdd.java
		1.ԭʼ����ʹ�þ�̬���� int[] arr = {1,2,3}
		2.���ӵ�Ԫ��4��ֱ�ӷ����������� arr = {1,2,3,4}
		3.�û�����ͨ�����·����������Ƿ������ӣ���ӳɹ����Ƿ������y/n
		
		˼·����
		1. �����ʼ���� int[] arr = {1,2,3}//�±�0-2
		2. ����һ���µ����� int[] arrNew = new int[arr.length+1];
		3. ���� arr ���飬���ν�arr��Ԫ�ؿ����� arrNew����
		4. �� 4 ���� arrNew[arrNew.length - 1] = 4;��4����arrNew���һ��Ԫ��
		5. �� arr ָ�� arrNew ;  arr = arrNew; ��ô ԭ��arr����ͱ�����
		6. ����һ�� Scanner���Խ����û�����
		7. ��Ϊ�û�ʲôʱ���˳�����ȷ������ʦʹ�� do-while + break������
		 */
		
		Scanner myScanner = new Scanner(System.in);
		//��ʼ������
		int[] arr = {1,2,3};

		do {
			int[] arrNew = new int[arr.length + 1];
			//���� arr ���飬���ν�arr��Ԫ�ؿ����� arrNew����
			for(int i = 0; i < arr.length; i++) {
				arrNew[i] = arr[i];
			}
			System.out.println("��������Ҫ��ӵ�Ԫ��");
			int addNum = myScanner.nextInt();
			//��addNum����arrNew���һ��Ԫ��
			arrNew[arrNew.length - 1] = addNum;
			//�� arr ָ�� arrNew, 
			arr = arrNew;
			//���arr ����Ч��
			System.out.println("====arr���ݺ�Ԫ�����====");
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + "\t");
			}
			//���û��Ƿ����
			System.out.println("�Ƿ������� y/n");
			char key = myScanner.next().charAt(0);
			if( key == 'n') { //�������n ,�ͽ���
				break;
			}			
		}while(true);

		System.out.println("���˳������...");
	}
}
