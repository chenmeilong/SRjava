
public class Homework05 { 

	//��дһ��main����
	public static void main(String[] args) {
		Circle circle = new Circle(3);
		System.out.println("���=" + circle.area());
		System.out.println("�ܳ�=" + circle.len());
	}
}
/*
����һ��Բ��Circle, �������ԣ��뾶���ṩ��ʾԲ�ܳ����ܵķ����� �ṩ��ʾԲ����ķ���
 */
class Circle {
	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double area() { //���
		return Math.PI * radius * radius;
	}

	public double len() { //�ܳ�
		return 2 * Math.PI * radius;
	}
}