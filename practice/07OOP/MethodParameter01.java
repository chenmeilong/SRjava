
public class MethodParameter01 { 

	//��дһ��main����
	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		//����AA���� ���� obj
		AA obj = new AA();
		obj.swap(a, b); //����swap

		System.out.println("main���� a=" + a + " b=" + b);//a=10 b=20
	}
}

class AA {
	public void swap(int a,int b){
		System.out.println("\na��b����ǰ��ֵ\na=" + a + "\tb=" + b);//a=10 b=20
		//����� a �� b�Ľ���
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("\na��b�������ֵ\na=" + a + "\tb=" + b);//a=20 b=10
	}
}