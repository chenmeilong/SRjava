
public class VarParameterExercise { 

	//��дһ��main����
	public static void main(String[] args) {
		HspMethod hm = new HspMethod();
		System.out.println(hm.showScore("milan" , 90.1, 80.0 ));
		System.out.println(hm.showScore("terry" , 90.1, 80.0,10,30.5,70 ));
	}
}

class HspMethod  {

	/*
	�������������ֱ�ʵ�ַ������������ſγɼ�(�ܷ�)��
	�������������ſγɼ�(�ܷ�)���������������ſγɼ����ܷ֣���
	��װ��һ���ɱ�����ķ���
	 */
	
	//����1. ������ showScore  2. �β�(String ,double... ) 3. ����String
	//����С��飬��ʦҪ������Լ�����д
	public String  showScore(String name ,double... scores ) {

		double totalScore = 0;
		for(int i = 0; i < scores.length; i++) {
			totalScore += scores[i];
		}
		return name + " �� " +scores.length + "�ſεĳɼ��ܷ�Ϊ=" + totalScore;
	}
 }