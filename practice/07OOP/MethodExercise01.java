

public class MethodExercise01 { 
	public static void main(String[] args) {
		AA a = new AA();
		a.print(4, 4, '#');
	}
}
//编写类AA ，有一个方法：判断一个数是奇数odd还是偶数, 返回boolean
class AA {
	public boolean isOdd(int num) {
		return num % 2 != 0;
	}
	//根据行、列、字符打印 对应行数和列数的字符，
	//比如：行：4，列：4，字符#,则打印相应的效果
	public void print(int row, int col, char c) {
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {//输出每一行
				System.out.print(c);
			}
			System.out.println(); //换行
		}
	}
}





