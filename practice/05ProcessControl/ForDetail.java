
//��ʾfor��ʹ��ϸ��

public class ForDetail { 

	//��дһ��main����
	public static void main(String[] args) {

		//for(;ѭ���ж�����;) 
		//�еĳ�ʼ���ͱ�����������д�������ط����������ߵķֺŲ���ʡ��
		
		// ʹ��forѭ������
		// int i = 1;//ѭ��������ʼ��
		// for( ; i <= 10 ; ) {
		// 	System.out.println("hello����˳ƽ����" + i);
		// 	i++;
		// }

		// System.out.println("i=" + i);//11 ok
		

		// int j = 1;
		// //����
		// for(;;) { //��ʾһ������ѭ��,��ѭ��
		// 	System.out.println("ok~" + (j++));
		// }

		//ѭ����ʼֵ�����ж�����ʼ����䣬��Ҫ������һ���������м��ö��Ÿ�����
		//ѭ����������Ҳ�����ж�������������䣬�м��ö��Ÿ���
		//��ʦʹ���ڴ����������������������ʲô?
		int count = 3;
		for (int i = 0,j = 0;  i < count; i++, j += 2) {
			System.out.println("i=" + i + " j=" + j);
		}

	}
}