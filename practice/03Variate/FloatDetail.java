
public class FloatDetail { 

	//��дһ��main����
	public static void main(String[] args) {

		//Java �ĸ����ͳ���(����ֵ)Ĭ��Ϊdouble�ͣ�����float�ͳ��������ӡ�f����F'
		//float num1 = 1.1; //�Բ���?����
		float num2 = 1.1F; //�Ե�
		double num3 = 1.1; //��
		double num4 = 1.1f; //��

		//ʮ��������ʽ���磺5.12       512.0f        .512   (������С���㣩
		double num5 = .123; //�ȼ� 0.123
		System.out.println(num5);
		//��ѧ��������ʽ:�磺5.12e2 [5.12 * 10��2�η� ]      5.12E-2   [] 
		System.out.println(5.12e2);//512.0
		System.out.println(5.12E-2);//0.0512


		//ͨ������£�Ӧ��ʹ��double�ͣ���Ϊ����float�͸���ȷ��
		//[����˵��]double num9 = 2.1234567851;float num10 =  2.1234567851F;
		double num9 =  2.1234567851;
		float num10 =  2.1234567851F;
		System.out.println(num9);
		System.out.println(num10);

		//������ʹ������: 2.7 �� 8.1 / 3  �Ƚ�
		//����һ�δ���
		double num11 = 2.7;
		double num12 = 2.7;	//8.1 / 3; //2.7
		System.out.println(num11);//2.7
		System.out.println(num12);//�ӽ�2.7��һ��С����������2.7
		//�õ�һ����Ҫ��ʹ�õ�: �����Ƕ���������С���Ľ�������ж��ǣ�ҪС��
		//Ӧ�������������Ĳ�ֵ�ľ���ֵ����ĳ�����ȷ�Χ���ж�
		if( num11 == num12) {
			System.out.println("num11 == num12 ���");
		}
		//��ȷ��д�� , ctrl + / ע�Ϳ�ݼ�, �ٴ������ȡ��ע��
		if(Math.abs(num11 - num12) < 0.000001 ) {
			System.out.println("��ֵ�ǳ�С�����ҵĹ涨���ȣ���Ϊ���...");
		}
		// ����ͨ��java API  ���� ��һ����Ƶ�������ʹ��API
		System.out.println(Math.abs(num11 - num12));
		//ϸ��:�����ֱ�Ӳ�ѯ�õĵ�С������ֱ�Ӹ�ֵ���ǿ����ж����
		
		

	}
}