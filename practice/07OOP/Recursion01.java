
public class Recursion01 { 

	//��дһ��main����
	public static void main(String[] args) {

		T t1 = new T();
		t1.test(4);//���ʲô�� n=2 n=3 n=4
		int res = t1.factorial(5); 
		System.out.println("5�Ľ׳� res =" + res);
	}
}

class T {
	//����
	public  void test(int n) {
		if (n > 2) {
			test(n - 1);
		} 
		System.out.println("n=" + n);
	}

	//factorial �׳�
	public  int factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return factorial(n - 1) * n;
		}
	}


}