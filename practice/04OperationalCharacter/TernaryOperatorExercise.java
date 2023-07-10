
public class TernaryOperatorExercise { 

	//编写一个main方法
	public static void main(String[] args) {
		//案例：实现三个数的最大值
		int n1 = 553;
		int n2 = 33;
		int n3 = 123;

		int max = n1 > n2 ? n1 : n2;
		
		max = max > n3 ? max : n3;

		System.out.println(max);


		
	}
}