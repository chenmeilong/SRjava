
public class StringToBasic { 

	//��дһ��main����
	public static void main(String[] args) {
		
		//������������->String
		
		int n1 = 100;
		float f1 = 1.1F;
		double d1 = 4.5;
		boolean b1 = true;
		String s1 = n1 + "";
		String s2 = f1 + "";
		String s3 = d1 + "";
		String s4 = b1 + "";
		System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);

		//String->��Ӧ�Ļ�����������
		String s5 = "123";
		//����OOP ������ͷ�����ʱ�����ϸ
		//��� ʹ�� �����������Ͷ�Ӧ�İ�װ�࣬����Ӧ�������õ�������������
		int num1 = Integer.parseInt(s5);
		double num2 = Double.parseDouble(s5);
		float num3 = Float.parseFloat(s5);
		long num4 = Long.parseLong(s5);
		byte num5 = Byte.parseByte(s5);
		boolean b = Boolean.parseBoolean("true");
		short num6 = Short.parseShort(s5);

		System.out.println("===================");
		System.out.println(num1);//123
		System.out.println(num2);//123.0
		System.out.println(num3);//123.0
		System.out.println(num4);//123
		System.out.println(num5);//123
		System.out.println(num6);//123
		System.out.println(b);//true

		//��ô���ַ���ת���ַ�char -> ������ָ ���ַ����ĵ�һ���ַ��õ�
		//���  s5.charAt(0) �õ� s5�ַ����ĵ�һ���ַ� '1'
		System.out.println(s5.charAt(0));
		
	}
}