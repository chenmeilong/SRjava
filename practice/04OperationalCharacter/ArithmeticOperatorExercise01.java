//��ϰ

public class ArithmeticOperatorExercise01 { 

	//��дһ��main����
	public static void main(String[] args) {
		
		// int i = 1;//i->1
		// i = i++; //����ʹ����ʱ����: (1) temp=i;(2) i=i+1;(3)i=temp;
		// System.out.println(i); // 1


		// int i=1;
		// i=++i; //����ʹ����ʱ����: (1) i=i+1;(2) temp=i;(3)i=temp;
		// System.out.println(i); //2
		// 
		// �������
		int i1 = 10;
	    int i2 = 20;
        int i = i1++;
        System.out.print("i="+i);//10
        System.out.println("i2="+i2);//20
        i = --i2; 
        System.out.print("i="+i);//19
        System.out.println("i2="+i2);//19


	}
}