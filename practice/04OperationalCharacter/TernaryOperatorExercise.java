
public class TernaryOperatorExercise { 

	//��дһ��main����
	public static void main(String[] args) {
		//������ʵ�������������ֵ
		int n1 = 553;
		int n2 = 33;
		int n3 = 123;

		int max = n1 > n2 ? n1 : n2;
		
		max = max > n3 ? max : n3;

		System.out.println(max);


		
	}
}