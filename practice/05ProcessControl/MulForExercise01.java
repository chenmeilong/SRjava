
import java.util.Scanner;
public class MulForExercise01 { 

	//��дһ��main����
	public static void main(String[] args) {
		//ͳ��3����ɼ������ÿ������5��ͬѧ��
		//����������ƽ���ֺ����а༶��ƽ����[ѧ���ĳɼ��Ӽ�������]��
		//ͳ�������༰��������ÿ������5��ͬѧ��
		//
		//˼·����:
		//����Ϊ��
		//(1) �ȼ���һ���� , 5��ѧ���ĳɼ���ƽ���� , ʹ��for
		//1.1 ���� Scanner ����Ȼ�󣬽����û�����
		//1.2 �õ��ð༶��ƽ���� , ����һ�� doubel sum �Ѹð༶5��ѧ���ĳɼ��ۻ� 
		
		//(2) ͳ��3����(ÿ����5��ѧ��) ƽ����
		//(3) ���а༶��ƽ����
		//3.1 ����һ��������double totalScore �ۻ�����ѧ���ĳɼ�
		//3.2 ������ѭ��������totalScore / (3 * 5) 
		//(4) ͳ�������༰������
		//4.1 ������� int passNum = 0; ����һ��ѧ���ɼ�>=60, passNum++
		//4.2 ��� >= 60 passNum++
		//(5) �����Ż�[Ч�ʣ��ɶ���, �ṹ]
		
		//���� Scanner ����
		Scanner myScanner = new Scanner(System.in);
		double totalScore = 0; //�ۻ�����ѧ���ĳɼ�
		int passNum = 0;//�ۻ� ��������
		int classNum = 3; //�༶����
		int stuNum = 5;//ѧ������
		for( int i = 1; i <= classNum; i++) {//i ��ʾ�༶

			double sum = 0; //һ���༶���ܷ�
			for( int j = 1; j <= stuNum; j++) {//j ��ʾѧ��
				System.out.println("������"+i+"����ĵ�"+j+"��ѧ���ĳɼ�");
				double score = myScanner.nextDouble();
				//����һ��ѧ���ɼ�>=60, passNum++
				if(score >= 60) {
					passNum++;
				}
				sum += score; //�ۻ�
				System.out.println("�ɼ�Ϊ" + score);
			}
			//��Ϊsum �� 5��ѧ�����ܳɼ�
			System.out.println("sum=" + sum + " ƽ����=" + (sum / stuNum));
			//�� sum �ۻ��� totalScore
			totalScore += sum;

		}
		System.out.println("�������ܷ�="+ totalScore 
			+ " ƽ����=" + totalScore / (classNum*stuNum));
		System.out.println("��������=" + passNum);

	}
}



/*
public class MulForExercise01{
	public static void main(String[] args){
		for(int i=1;i<=9;i++){
			for(int j=1;j<=9;j++){
				if(i>=j){
					System.out.print(j+"*"+i+"="+i*j+'\t');
				}
			}
			System.out.println(' ');
		}

	}

}
*/