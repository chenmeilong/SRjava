//!��^������ʾ

public class InverseOperator { 

	//��дһ��main����
	public static void main(String[] args) {

		//! ������ȡ�� T->F  , F -> T
		System.out.println(60 > 20); //T
		System.out.println(!(60 > 20)); //F

		//a^b: ���߼���򣬵� a �� b ��ͬʱ������Ϊtrue, ����Ϊfalse
		boolean b = (10 > 1) ^ ( 3 > 5);
		System.out.println("b=" + b);//T
	}
}