//文档注释
/**
 * @author 小明
 * @version 1.0
 */
public class test{
	public static void main(String[] args){
		System.out.println("书名\t作者\t价格\t销量\n三国\t罗贯中\t120\t1000");

		System.out.println('1'+1);

		byte a=10;
		System.out.println(a);


		//在java中，char的本质是一个整数，在默认输出时，是unicode码对应的字符
		char c1 = 97;
		System.out.println(c1); // a
		char c2 = 'a'; //输出'a' 对应的 数字
		System.out.println((int)c2); //要输出对应的数字，可以(int)字符
		char c3 = '韩';
		System.out.println((int)c3);//38889
		char c4 = 38889;
		System.out.println(c4);//韩

	}
}
