
public class Test { 

	//��дһ��main����
	public static void main(String[] args) {

		// String name = "������";
		// System.out.println(name.equals("������"));//T
		// System.out.println("������".equals(name));//T [�Ƽ�, ���Ա����ָ��]


		char[] arr1={'a','z','b','c'};
		char[] arr2=arr1;
		arr1[2]='��';

		for(int i=0;i<arr2.length; i++){
			System.out.println(arr1[i]+","+ arr2[i]); 
		}


	}
}